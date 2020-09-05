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
		
		/*Brand[] response = baseBrandURL.request(MediaType.APPLICATION_JSON)
									   .get(Brand[].class);
		
		for(Brand brand: response) {
			System.out.println(brand);
		}
		*/
		
		//GET
		
		/*Brand specificBrand = brandURL
								.resolveTemplate("brandId", "5")
								.request()
								.get(Brand.class);
		
		System.out.println(specificBrand);
		*/
		
		//POST
		
		/*Response response = brandURL
						.request()
						.post(Entity.json(new Brand("New brand 100")));
		
		System.out.println(response.readEntity(Brand.class).displayBrand());
		*/
		
		//PUT
		
		/*Response response = brandURL
							.resolveTemplate("brandId", "7")
							.request(MediaType.APPLICATION_JSON)
							.put(Entity.json(new Brand("Yamaha")));
		
		System.out.println(response.getStatus());
		*/
		
		//DELETE
		
		Response response = brandURL
							.resolveTemplate("brandId", "17")
							.request()
							.delete();
		System.out.println(response.getStatus());
		
		
	}
}
