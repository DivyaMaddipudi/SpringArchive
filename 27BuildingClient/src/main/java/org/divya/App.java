package org.divya;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/app")
public class App {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo() {
		
		Client client = ClientBuilder.newClient();
		WebTarget baseBrandURL = client.target("http://localhost:8082/23HATEOAS_1/showroom/brands");
		WebTarget brandURL = baseBrandURL.path("{brandId}");
		
		
		
		String response = brandURL
							.resolveTemplate("brandId", "6")
							.request(MediaType.APPLICATION_JSON)
							.get(String.class);
		
	return response;
	}
}
