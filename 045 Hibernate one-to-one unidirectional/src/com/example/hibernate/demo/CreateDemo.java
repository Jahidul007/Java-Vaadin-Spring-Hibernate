package com.example.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.demo.entity.*;

public class CreateDemo {

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
			// create the objects
			Instructor tempInstructor = new Instructor("Jahid","hasan","hasan@gmail.com");

			InstructorDetail tempInstructorDetail =
					new InstructorDetail("www.youtube.com/jahid","love to dance");
			
			
			// associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
		
			// start a transaction 
			session.beginTransaction();
			
			// save the instructor
			//
			// note: This will also save the details object
			// because of CascadeType.all
			//
			System.out.println("Saving instructor: "+tempInstructor);
			session.save(tempInstructor);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done My Job!!!!!!!!!!!");
			
			
			
		} finally {
			
			session.close();
			factory.close();
			
		}
	}

}
