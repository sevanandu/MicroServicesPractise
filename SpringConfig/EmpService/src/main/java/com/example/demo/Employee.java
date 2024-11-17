package com.example.demo;

public class Employee {
	
	private int id;
	private String empName;
	private String empJob;
	public Employee(int id, String empName, String empJob) {
		super();
		this.id = id;
		this.empName = empName;
		this.empJob = empJob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpJob() {
		return empJob;
	}
	public void setEmpJob(String empJob) {
		this.empJob = empJob;
	}
	
	

}
