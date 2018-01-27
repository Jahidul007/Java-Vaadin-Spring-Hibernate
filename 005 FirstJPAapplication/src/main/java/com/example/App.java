package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
 public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.first.jpa");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	entityManager.getTransaction().begin();
	student s = new student();
	
	s.setName("jahid");
	s.setAge(30);
	s.setName("abir");
	s.setAge(40);
	
	entityManager.persist(s);
	entityManager.getTransaction().commit();
	entityManager.close();
	entityManagerFactory.close();
	
	
}
}
