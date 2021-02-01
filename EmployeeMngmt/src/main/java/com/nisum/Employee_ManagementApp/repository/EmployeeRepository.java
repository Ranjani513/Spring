package com.nisum.Employee_ManagementApp.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nisum.Employee_ManagementApp.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>   {
	public abstract Employee findByName(String name);
	
}

