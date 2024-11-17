package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeClientController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${emp.service.url}")
	String url;
	
	@GetMapping("/getEmployees1")
	public ResponseEntity<List<Employee>> getEmployees(){
		List<Employee> emp=restTemplate.getForObject(url, List.class);
		
		return ResponseEntity.status(HttpStatus.OK).body(emp);
		
	}
	
	

}
