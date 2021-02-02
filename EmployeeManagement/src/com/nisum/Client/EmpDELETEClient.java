package com.nisum.Client;

import com.nisum.EmployeeManagement.model.Employee;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class EmpDELETEClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
Client client=Client.create();
WebResource webresource=client.resource("http://localhost:8080/EmployeeManagement/rest/emp/delete/1001");

ClientResponse response=webresource.type("application/xml").delete(ClientResponse.class);
System.out.println("Delete operation response processing");
String output=response.getEntity(String.class);
System.out.println(output);
	}

}
