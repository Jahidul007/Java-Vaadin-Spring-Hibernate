package com.example.hibernate.demo;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.demo.entity.Customer;

public class CreateCustomerDemo {

	public static void main(String[] args) {
		 
		//create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Customer.class)
								.buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//use the session object to save java object 
			//create a customer object 
			System.out.println("Creat ing new customer object .............");
			Customer tempCustomer = new Customer("John","Denly","john@gmail.com");
			
			// start a transaction 
			session.beginTransaction();
			
			// save the customer object 
			System.out.println("Saving the Customer.........");
			session.save(tempCustomer);
			
			// commit the transaction 
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			factory.close();
		}

	}

}
