package com.thevarungupta.employee.service.dto;

import com.thevarungupta.employee.service.entity.Employee;

public class EmployeeResponse {

	private Employee employee;
	private Department department;
	public EmployeeResponse() {
		
	}
	public EmployeeResponse(Employee employee, Department department) {
		super();
		this.employee = employee;
		this.department = department;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
}
