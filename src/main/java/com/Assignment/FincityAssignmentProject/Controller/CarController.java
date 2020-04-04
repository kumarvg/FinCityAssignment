package com.Assignment.FincityAssignmentProject.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Assignment.FincityAssignmentProject.Model.Car;
import com.Assignment.FincityAssignmentProject.Repositery.DaoJdbcTemplte;

@RestController
public class CarController {

	@Autowired
	private DaoJdbcTemplte dao;

	@GetMapping("/getCar")
	public List<Car> getAllCar() {
		List<Car> car = dao.findAll();
		return car;
	}
	
	
	@GetMapping("findCar/{id}")
	public ResponseEntity<?> findCarById(@PathVariable int id) {
		
		Car car = dao.findById(id);
		if (car == null) {
			return new ResponseEntity<String>("No any Car as id  " + id + " Not Found.",
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Car>(car, HttpStatus.OK);
		
	}
	
	@GetMapping("Car/{name}")
	public ResponseEntity<?> findCarByName(@PathVariable String name) {
		
		Car car = dao.findByName(name);
		if (car == null) {
			return new ResponseEntity<String>("No any Car as name  " + name + " Not Found.",
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Car>(car, HttpStatus.OK);
		
	}
	

	@DeleteMapping(path = "deleteCar/{id}")
	public ResponseEntity<?> deleteCar(@PathVariable("id") int id) {
		
		Car car = dao.findById(id);
		if (car == null) {
			return new ResponseEntity<String>("Unable to delete as Car id  " + id + " Not Found.",
					HttpStatus.NOT_FOUND);
		}
		int a=dao.Delete(id);
		return new ResponseEntity<Car>(HttpStatus.NO_CONTENT);

	}

		
	@PutMapping(path = "/updateCar")
	public ResponseEntity<?> updateCar(@RequestBody Car car) {
		
		
		if (dao.findById(car.getId())== null) {
			return new ResponseEntity<String>("Unable to delete as Car id " +car.getId() + " Not Found.",
					HttpStatus.NOT_FOUND);
		}		
		dao.update(car);
		return new ResponseEntity<Car>(car, HttpStatus.OK);
		
		
	}
	
	
}
