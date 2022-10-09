package com.bhavna.annotations.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavna.annotations.dao.EmployeeDao;

@Service
public class EmployeeServices {
	
	@Autowired
	EmployeeDao employeeDao;
	public void addEmployee() {
		employeeDao.addEmployee();
	}
	
}
