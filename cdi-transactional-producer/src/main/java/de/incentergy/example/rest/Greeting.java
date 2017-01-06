package de.incentergy.example.rest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import de.incentergy.example.ejb.GreetingService;

@RequestScoped
@Path("greeting")
public class Greeting {

	@Inject
	GreetingService greetingService;
	
	@GET
	@Path("/greet")
	public String greet() {
		return greetingService.greet();
	}

	public Greeting() {
	}

}
