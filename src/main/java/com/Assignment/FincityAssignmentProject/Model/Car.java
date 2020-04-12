package com.Assignment.FincityAssignmentProject.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Car")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotEmpty(message = "Name is mandotry field.Please provide name")
	@Column(name = "Name", length = 50, nullable = false ,unique = true)
	private String name;
	
	
	@Size(min = 2, message = "Manufacturer name should have atleast 2 character")
	@Column(name = "Manuf_name" ,length = 50,nullable = false)
	private String manufactureName;

	
	@Column(name = "Model" ,length = 50,nullable = false,unique = true)
	private String model;

	
	
	@Column(name = "Color" ,length = 50,  nullable = false)
	private String color;

	
	
	public Car() {
		super();
	}

	public Car(int id, String name, String manufactureName, String model, String color) {
		super();
		this.id = id;
		this.name = name;
		this.manufactureName = manufactureName;
		this.model = model;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufactureName() {
		return manufactureName;
	}

	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
