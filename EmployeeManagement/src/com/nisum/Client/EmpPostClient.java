package com.nisum.Client;

import com.nisum.EmployeeManagement.model.Employee;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class EmpPostClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Client client=Client.create();
WebResource webresource=client.resource("http://localhost:8080/EmployeeManagement/rest/emp/create");
Employee emp=new Employee();
emp.setEmail("nikhila@gmail.com");
emp.setEmpId("123");
emp.setName("nikhila");
ClientResponse response=webresource.type("application/xml").post(ClientResponse.class,emp);
System.out.println("create operation response processing");
String output=response.getEntity(String.class);
System.out.println(output);
	}

}
