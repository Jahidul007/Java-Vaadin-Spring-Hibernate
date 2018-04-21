package com.example.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.demo.entity.*;

public class CreateCourseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create session factory
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
								
		// create session
		Session session = factory.getCurrentSession();
		
		try {
		
			// start a transaction 
			session.beginTransaction();
			
			// get the instructor from database
			int theId = 4;
			Instructor instructor = session.get(Instructor.class,theId);
			
			// create some courses 
			Course course = new Course("Air Guitar - The ");
			Course course1 = new Course("The wings of fire");
			Course course2 = new Course("The Pinball masterclass");
			
			// add courses to instructor
			instructor.add(course);
			instructor.add(course1);
			instructor.add(course2);
			
			// save the courses 
			session.save(course);
			session.save(course1);
			session.save(course2);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done My Job!!!!!!!!!!!");
			
			
			
		} finally {
			
			// add clean up code
			session.close();
			
			factory.close();
			
		}
	}

}
