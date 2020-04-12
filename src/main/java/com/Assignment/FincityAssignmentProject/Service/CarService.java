package com.Assignment.FincityAssignmentProject.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.server.ResponseStatusException;

import com.Assignment.FincityAssignmentProject.Exception.CarExistException;
import com.Assignment.FincityAssignmentProject.Exception.CarNotFoundException;
import com.Assignment.FincityAssignmentProject.Model.Car;
import com.Assignment.FincityAssignmentProject.Repositery.CarRepositery;
@Service
public class CarService {

	@Autowired
	CarRepositery carRepositery;

	public List<Car> getAllCar() {
		return carRepositery.findAll();

	}

	public Car createCar(Car car) throws CarExistException
	{
		Car existCar=carRepositery.findByName(car.getName());
		
		if(existCar!=null)
		{
			throw new CarExistException("Car Already Present in repositery");
		}
		else {
		return carRepositery.save(car);
		}
	}
	
	
	public Optional<Car> getCarById(int id) throws CarNotFoundException
	{
		Optional<Car> car=carRepositery.findById(id);
		if(!car.isPresent())
		{
			throw new CarNotFoundException("Car Not found in car Repositery");
		}
		
		return car;
	}
	
	
	public Car updateCarById(int id, Car car) throws CarNotFoundException
	{
		
		Optional<Car> carOptional=carRepositery.findById(id);
		if(!carOptional.isPresent())
		{
			throw new CarNotFoundException("Car Not found in car Repositery: Provide the correct id");
		}
		
		car.setId(id);
		return carRepositery.save(car);
		
	}
	
	
public void deleteCarById(int id) 
{
	
	Optional<Car> carOptional=carRepositery.findById(id);
	if(!carOptional.isPresent())
	{
		throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Car Not found in car Repositery: Provide the correct id");
	}
		carRepositery.deleteById(id);
	}
	
public Car getCarByName(String carName) throws CarNotFoundException
{
	
	if(carRepositery.findByName(carName)==null)
	{
		throw new CarNotFoundException("Car is Not found with this name");
	}
	else {
	return carRepositery.findByName(carName);
	}
	
}
	
	
}
