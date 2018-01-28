package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App {
	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.first.jpa");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	entityManager.getTransaction().begin();
	
	
	/*//student s = new student("Adnan",26,"Chittagong");
	Person person = new Person ("Abir Reza",20);
	Person person1 = new Person ("Abir Ahmed",21);
	Person person2 = new Person ("Abir Chowdhury",32);
	Person person3 = new Person ("Abir Rehman",44);
	
	entityManager.persist(person);
	entityManager.persist(person1);
	entityManager.persist(person2);
	entityManager.persist(person3);
	
	entityManager.persist(s);
	Person person = entityManager.find(Person.class,4);
	System.out.println(person); 
	entityManager.remove(person);*/

	//Query query =entityManager.createQuery("select p from Person p");
	//Query query =entityManager.createQuery("select p from Person p where p.age between 20 and 30");

	//Query query =entityManager.createQuery("select p from Person p order by p.name desc");
	
	Query query =entityManager.createNativeQuery("select * from PerTable",Person.class);
	
	List<Person> people = (List<Person>) query.getResultList();
	
	for(Person p:people) 
	{
		System.out.println(p);
	}
	
	entityManager.getTransaction().commit();
	entityManager.close();
	entityManagerFactory.close();

}
}
