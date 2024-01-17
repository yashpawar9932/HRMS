package com.Technosignia.HRMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.HRMS.entity.Employee;
import com.Technosignia.HRMS.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository ;

	public Employee createEmployee(Employee emp) {
		
		return employeeRepository.save(emp);
		
	}
}
