package com.example.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.demo.entity.*;

public class GetCoursesForstudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create session factory
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory(); 
								
		// create session
		Session session = factory.getCurrentSession();
		
		try {
		
			// start a transaction 
			session.beginTransaction();
			
			// get the student from database 
			int studentId = 4;
			Student tempStudent = session.get(Student.class, studentId);
			
			System.out.println("\nLoaded student: "+ tempStudent);
			System.out.println("Courses: "+tempStudent.getCourses());
			
			
			
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
