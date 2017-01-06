package de.incentergy.example.ejb;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import de.incentergy.example.entities.User;

@Singleton
@Startup
public class Bootstraper {

	@PersistenceContext
	EntityManager em;

	public Bootstraper() {
	}

	@PostConstruct
	public void init() {
		User user = em.find(User.class, "1");
		if (user == null) {
			user = new User();
			user.setId("1");
			user.setName("Manuel");
			em.persist(user);
		}
		user = em.find(User.class, "2");
		if (user == null) {
			user = new User();
			user.setId("2");
			user.setName("Hans");
			em.persist(user);
		}
		user = em.find(User.class, "3");
		if (user == null) {
			user = new User();
			user.setId("1");
			user.setName("Peter");
			em.persist(user);
		}
	}

}
