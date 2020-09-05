package org.divya;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo")
@Singleton
public class App {
	
	private int x = 0;
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo() {
		return "The value of x  is " + (++x);
	}
}
