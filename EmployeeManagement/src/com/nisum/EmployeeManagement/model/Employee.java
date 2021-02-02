package com.nisum.EmployeeManagement.model;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="employee")
public class Employee {
public String empId;
public String name;
public String email;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@XmlElement(required=true)
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
@XmlElement(required=true)
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@XmlElement(required=true)
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Employee(String empId, String name, String email) {
	super();
	this.empId = empId;
	this.name = name;
	this.email = email;
}

}
