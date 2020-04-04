package com.Assignment.FincityAssignmentProject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.Assignment.FincityAssignmentProject")
public class FincityAssignmentProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FincityAssignmentProjectApplication.class,args);
	}
}
