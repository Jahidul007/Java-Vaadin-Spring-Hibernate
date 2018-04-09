package com.example.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.demo.entity.*;

public class ReadStudentDemo {

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
			// create a student object 
			System.out.println("creating a new student object");
			Student tempStudent = new Student("kinn", "tong", "tong@gmail.com");			
			
			// start a transaction 
			session.beginTransaction();
			
			// save the student object
			
			System.out.println("Saving the student........");
			System.out.println(tempStudent);
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			
			// My new code
			
			//find out the student's id: primary key 
			System.out.println("Saved student.Generated id: "+ tempStudent.getId());
			
			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on id: primary key 
			System.out.println("\nGetting student with id: "+tempStudent.getId());
			
			Student myStudent = session.get(Student.class, tempStudent.getId());
			
			System.out.println("Get complete: "+ myStudent);
			
			//commit the transaction 
			session.getTransaction().commit();
			
			System.out.println("Done My Job!!!!!!");
				
			
		} finally {
			
			session.close();
			factory.close();
			
		}
	}

}
