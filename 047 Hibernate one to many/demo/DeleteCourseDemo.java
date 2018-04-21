package com.example.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.demo.entity.*;

public class DeleteCourseDemo {

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

			// get a course
			int theId = 3;
			Course course = session.get(Course.class, theId);
			
			// delete course 
			System.out.println("Deleting course: "+course);
			session.delete(course);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done My Job!!!!!!!!!!!");

		} finally {

			// add clean up code
			session.close();

			factory.close();

		}
	}

}
