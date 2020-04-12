package com.Assignment.FincityAssignmentProject.Repositery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Assignment.FincityAssignmentProject.Model.Car;

@Repository
public interface CarRepositery extends JpaRepository<Car,Integer> {
	
	Car findByName(String name);
		
}
