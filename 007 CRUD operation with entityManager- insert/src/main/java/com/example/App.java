package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.first.jpa");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	entityManager.getTransaction().begin();
	//student s = new student("Adnan",26,"Chittagong");
	Person person = new Person ("Abir Reza","AbirReza1@gmail.com");
	Person person1 = new Person ("Abir Ahmed","AbirReza2@gmail.com");
	Person person2 = new Person ("Abir Chowdhury","AbirReza3@gmail.com");
	Person person3 = new Person ("Abir Rehman","AbirReza4@gmail.com");
	//entityManager.persist(s);
	entityManager.persist(person);
	entityManager.persist(person1);
	entityManager.persist(person2);
	entityManager.persist(person3);
	entityManager.getTransaction().commit();
	entityManager.close();
	entityManagerFactory.close();
	
	
}
}
