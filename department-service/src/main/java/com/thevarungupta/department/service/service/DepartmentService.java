package com.thevarungupta.department.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thevarungupta.department.service.entity.Department;
import com.thevarungupta.department.service.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department save(Department department) {
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		return departmentRepository.findDepartmentById(departmentId);
	}
	
}
