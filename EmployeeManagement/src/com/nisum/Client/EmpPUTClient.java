package com.nisum.Client;

import com.nisum.EmployeeManagement.model.Employee;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class EmpPUTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
Client client=Client.create();
WebResource webresource=client.resource("http://localhost:8080/EmployeeManagement/rest/emp/update");
Employee emp=new Employee();
emp.setEmail("sowmya@gmail.com");
emp.setEmpId("1234");
emp.setName("sowmya");
ClientResponse response=webresource.type("application/xml").put(ClientResponse.class,emp);
System.out.println("create operation response processing");
String output=response.getEntity(String.class);
System.out.println(output);
	}

}
