package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Person_Table")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	private String name;
	private String email;

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	/**
	 * @param id
	 * @param name
	 * @param email
	 */
	public Person(String name, String email) {

		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
