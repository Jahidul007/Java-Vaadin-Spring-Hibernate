package com.example.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.demo.entity.*;

public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create session factory
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
								
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			// start a transaction 
			session.beginTransaction();
			
			// get instruction by primary key 
			int theId = 1;
			Instructor tempInstructor = session.get(Instructor.class, theId);
			
			System.out.println("Found instructor: " + tempInstructor);
			
			// delete the instructors
			if(tempInstructor!=null) {
				System.out.println("Deleting: "+tempInstructor);
				
				// Note: will also delete associated "details" object
				//because of cascadeType.all
 				session.delete(tempInstructor);
			}
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done My Job!!!!!!!!!!!");
			
			
			
		} finally {
			
			session.close();
			factory.close();
			
		}
	}

}
