package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	
	@GetMapping("/getEmployees")
	public ResponseEntity<List<Employee>> getEmployees() {
		
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1,"Sevanandu","ProjectEngineer"));
		return  ResponseEntity.status(HttpStatus.OK).body(emp);
		
		
		
	}

}
