package com.nisum.Employee_ManagementApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

public class Employee {

String name;
int id;
String city;

public Employee(String name, int id, String city) {
	super();
	this.name = name;
	this.id = id;
	this.city = city;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

public String getName() {
	return name;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public void setName(String name) {
	this.name = name;
}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", city=" + city + "]";
}
}

