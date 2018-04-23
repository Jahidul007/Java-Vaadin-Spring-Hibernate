package com.example.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.demo.entity.*;

public class CreateCourseAndReviewDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create session factory
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.buildSessionFactory(); 
								
		// create session
		Session session = factory.getCurrentSession();
		
		try {
		
			// start a transaction 
			session.beginTransaction();
			
			// create a course
			Course course = new Course("keep and calm down");
			
			// add some review
			course.addReview(new Review("Great course....loved it!!!"));
			course.addReview(new Review("cool course....loved it!!!"));
			course.addReview(new Review("Awesome course....loved it!!!"));
			
			
			// save the course... and leverage the cascade all :-) 
			System.out.println("Saving the course........");
			System.out.println(course);
			System.out.println(course.getReviews());
			
			session.save(course);
			
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
