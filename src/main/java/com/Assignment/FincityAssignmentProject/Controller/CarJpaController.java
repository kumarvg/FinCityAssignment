package com.Assignment.FincityAssignmentProject.Controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.util.UriComponentsBuilder;

import com.Assignment.FincityAssignmentProject.Exception.CarExistException;
import com.Assignment.FincityAssignmentProject.Exception.CarNotFoundException;
import com.Assignment.FincityAssignmentProject.Model.Car;
import com.Assignment.FincityAssignmentProject.Service.CarService;

@RestController
public class CarJpaController {

	@Autowired
	private CarService carService;

	@GetMapping("/getCar")
	public List<Car> getAllCar() {

		List<Car> car = carService.getAllCar();
		return car;
	}

	@PostMapping("/car")
	public ResponseEntity<?> createCar(@Valid @RequestBody Car car, UriComponentsBuilder builder) {
		try {
			carService.createCar(car);

			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(builder.path("/car/id").buildAndExpand(car.getId()).toUri());
			return new ResponseEntity<>(headers, HttpStatus.CREATED);

		} catch (CarExistException ex) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
		}
	}

	@GetMapping("/car/{id}")
	public Optional<Car> getCarById(@PathVariable("id") int id) {
		try {
			return carService.getCarById(id);
		} catch (CarNotFoundException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage());
		}
	}

	@PutMapping("/Car/{id}")
	public Car updateCarById(@PathVariable("id") int id, @RequestBody Car car) {
		try {
			return carService.updateCarById(id, car);
		} catch (CarNotFoundException ex) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
		}
	}

	@DeleteMapping("/car/{id}")
	public void deleteCarById(@PathVariable("id") int id) {
		carService.deleteCarById(id);
	}

	@GetMapping("/car/byCarName/{carName}")
	public Car getCarByCarName(@PathVariable("carName") String carName) {
		try {
			return carService.getCarByName(carName);
		} catch (CarNotFoundException ex) {

			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());

		}

	}

}
