package de.incentergy.example.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;

import de.incentergy.example.entities.User;

@Stateless
public class GreetingService {

	@Inject
	User user;

	public GreetingService() {
	}

	public String greet() {
		return "Hello " + user.getName();
	}

}
