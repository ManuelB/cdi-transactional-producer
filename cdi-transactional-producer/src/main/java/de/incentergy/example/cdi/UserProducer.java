package de.incentergy.example.cdi;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import de.incentergy.example.entities.User;

public class UserProducer {

	@PersistenceContext
	EntityManager em;

	public UserProducer() {
	}

	@Produces
	@RequestScoped
	public User produceUser() {
		// Get a random number between 1 and 3 as a String
		String id = new Integer((int) Math.ceil(Math.random() * 3)).toString();
		return em.find(User.class, id);
	}

}
