package de.incentergy.example.entities;

import javax.enterprise.inject.Alternative;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Alternative
public class User {

	@Id
	private String id;
	private String name;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
