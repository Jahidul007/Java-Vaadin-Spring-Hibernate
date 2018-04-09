package com.example.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.demo.entity.*;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create session factory
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
								
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			int studentId = 1;
		
			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on id: primary key 
			System.out.println("\nGetting student with id: "+ studentId);
			
			Student myStudent = session.get(Student.class,studentId);
			
			System.out.println("Updating students............");
			myStudent.setFirstName("Scooby");
			 
			//commit the transaction 
			session.getTransaction().commit();
			
			// new code
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// update email for student
			System.out.println("update email ");
			session.createQuery("Update Student set email='scooby@gmail.com' where id = "+studentId).executeUpdate();
			
			//commit the transaction 
			session.getTransaction().commit();
			
			System.out.println("Done My Job!!!!!!");
				
			
		} finally {
			
			session.close();
			factory.close();
			
		}
	}

}
