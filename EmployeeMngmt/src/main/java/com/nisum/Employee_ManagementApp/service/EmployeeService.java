package com.nisum.Employee_ManagementApp.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nisum.Employee_ManagementApp.model.Employee;
import com.nisum.Employee_ManagementApp.repository.EmployeeRepository;


@Service
public class EmployeeService {
	@Autowired  
	EmployeeRepository employeeRepository;  

	public List<Employee> getAllEmployees()   
	{  
	List<Employee> emps = new ArrayList<Employee>();  
    employeeRepository.findAll().forEach(emp -> emps.add(emp));  
	return emps;  
	}  

	public Employee getEmployeeById(int id)   
	{  

		Optional<Employee> checkId=employeeRepository.findById(id);
		if(checkId.isPresent())
		{	
			return employeeRepository.findById(id).get();  
		}
		else {
			System.out.println("Entered Id is not present");
		}
		return null;

	}  
	
	public void saveOrUpdate(Employee emp)   
	{  
	employeeRepository.save(emp);  
	}  
	 
	public void delete(int id)   
	{  
		Optional<Employee> checkId=employeeRepository.findById(id);
		if(checkId.isPresent())
		{
			employeeRepository.deleteById(id); 
		}
		else {
			System.out.println("Entered Id is not present");
		}
	 
	}  
	 public Employee FindByName(String name) {
		 List<Employee>  e=employeeRepository.findAll();
		 Employee emp = e.stream() .
				 filter(e1 -> name.equalsIgnoreCase(e1.getName())) 
				 .findAny() .orElse(null);
		         return emp;
	  
	  }
	
	public void update(Employee emp, int empid)   
	{  
	employeeRepository.save(emp);  
	}  
	
	}  