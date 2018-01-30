package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "PerTable")
@NamedQueries ({@NamedQuery(name ="person.getAll",query="Select p from Person p" ),
                @NamedQuery(name ="person.getPersonByID",query="Select p from Person p where p.id=:id")})
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	private String name;
	private int age;

	@Override
	public String toString() {
		return this.id+"."+this.name + "-" + this.age;
	}

	/**
	 * @param id
	 * @param name
	 * @param email
	 */
	public Person() {

	}

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
