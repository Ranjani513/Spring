package com.nisum.Employee_ManagementApp.controller;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.Employee_ManagementApp.model.Employee;
import com.nisum.Employee_ManagementApp.service.EmployeeService;


@RestController
public class EmployeeController {
	@Autowired  
	EmployeeService employeeService;  
	   
	@GetMapping("/employee")  
	private List<Employee> getAllEmployees()   
	{  
	return employeeService.getAllEmployees();  
	}  
	@GetMapping("/employee/name/{name}") 
	public ResponseEntity get(@PathVariable String name) {
			  
			  try 
			  {
				   Employee employee=employeeService.FindByName(name);
			       return new  ResponseEntity<Employee>(employee,HttpStatus.OK);
			       }
			  catch(NoSuchElementException e)
			  {
				  return new  ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
				  }
			  
			  }
	
	@GetMapping("/employee/{empid}")  
	private Employee getEmployee(@PathVariable("empid") int empid)   
	{  
	return employeeService.getEmployeeById(empid);  
	}  

	@DeleteMapping("/employee/{empid}")  
	private void deleteEmployee(@PathVariable("empid") int empid)   
	{  
	employeeService.delete(empid);  
	}  
	
	@PostMapping("/employee")  
	private int saveEmployee(@RequestBody Employee emp)   
	{  
	employeeService.saveOrUpdate(emp);  
	return emp.getId();  
	}  
	
	@PutMapping("/employee")  
	private Employee update(@RequestBody Employee emp)   
	{  
	employeeService.saveOrUpdate(emp);  
	return emp;  
	}  
}

