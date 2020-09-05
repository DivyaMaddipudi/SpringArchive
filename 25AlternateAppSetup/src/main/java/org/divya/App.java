package org.divya;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

// when path param is used
//@Path("/demo/{id}") 
@Path("/demo")
public class App {
	//@QueryParam("x") String x;
	//@PathParam("id") String id;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo(@QueryParam("code") Currency currency) {
		//return "The value of x  is " + x + " || The value of path param is " + id;
		return "The code of currency is : " + currency;
	}
}
