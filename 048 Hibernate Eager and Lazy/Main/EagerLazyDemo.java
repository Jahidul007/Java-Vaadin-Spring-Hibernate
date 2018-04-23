package com.example.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.demo.entity.*;

public class EagerLazyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create session factory

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			// get the instructor from database
			int theId = 4;
			Instructor instructor = session.get(Instructor.class, theId);

			System.out.println("Instructor: " + instructor);
			
			System.out.println("Courses: " + instructor.getCourses());
		

			// commit transaction
			session.getTransaction().commit(); 
			
			// close session
			session.close();
			
			System.out.println("\n  Hey, The session is nobw closed!!!\n");
			// since courses are lazy loaded ... this should fail
			
			// option 1: call getter method while session is open

			// get courses for the instructor
			System.out.println("Courses: " + instructor.getCourses());
			

			System.out.println("Done My Job!!!!!!!!!!!");

		} finally {

			// add clean up code
			session.close();

			factory.close();

		}
	}

}
