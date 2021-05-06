package com.thevarungupta.employee.service.dto;

import com.thevarungupta.employee.service.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {

	private Employee employee;
	private Department department;

}
