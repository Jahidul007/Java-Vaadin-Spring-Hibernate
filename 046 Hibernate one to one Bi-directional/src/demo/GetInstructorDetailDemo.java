package com.example.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.demo.entity.*;

public class GetInstructorDetailDemo {

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
			
			// get the instructor detail object
			int theId = 299;
			InstructorDetail tempInstructorDetail =
					session.get(InstructorDetail.class, theId);
			
			// print the instructor detail
			System.out.println("TempInstructor detail: "+tempInstructorDetail);
			
			// print the associated instructor
			System.out.println("The associated instructors: "+
										tempInstructorDetail.getInstructor());
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done My Job!!!!!!!!!!!");
			
			
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			// handle connection leak issue 
			session.close();
			factory.close();
			
		}
	}

}
