package com.example.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.demo.entity.*;

public class CreateCourseAndStudentDemo {

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
			
			// create a course
			Course course = new Course("Spring and hibernate");
			
			// save the course
			System.out.println("\nSaving the course............");
			session.save(course);
			System.out.println("saved the course: "+ course);
			
			// create the students 
			Student tempStudent1 = new Student("john", "Kelein", "john@gmail.com");
			Student tempStudent2 = new Student("kitmon", "jonas", "kitmon@gmail.com");
			Student tempStudent3 = new Student("Stones", "dohry", "Stones@gmail.com");
			Student tempStudent4 = new Student("Alex", "hales", "Alex@gmail.com");
			
			// add students to the course
			course.addStudent(tempStudent1);
			course.addStudent(tempStudent2);
			course.addStudent(tempStudent3);
			course.addStudent(tempStudent4);
			
			// save the students 
			System.out.println("\nSaving students..........");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			session.save(tempStudent4);
			System.out.println("Saved students: "+course.getStudents());
			
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
