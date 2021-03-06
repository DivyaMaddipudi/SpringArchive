package org.divya;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.divya.model.Brand;

public class App {
	
	static Client client = ClientBuilder.newClient();
	static WebTarget baseBrandURL = client.target("http://localhost:8082/23HATEOAS_1/showroom/brands");
	static WebTarget brandURL = baseBrandURL.path("{brandId}");
	
	public static void main(String[] args) {
		
		Response resonse = baseBrandURL.request(MediaType.APPLICATION_JSON)
									   .post(Entity.json(new Brand("New Brand name")));
		System.out.println(resonse.toString());
	}
}
