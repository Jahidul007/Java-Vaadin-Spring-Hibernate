package com.example.hibernate.demo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.example.hibernate.demo.entity.Course;
import com.example.hibernate.demo.entity.Instructor;
import com.example.hibernate.demo.entity.InstructorDetail;

public class FetchJoinDemo {

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
			
			// option 2: Hibernate query with HQL
			

			// get the instructor from database
			int theId = 4;
			Query<Instructor> query = 
					session.createQuery("Select i from Instructor i "
										+ "JOIN FETCH i.courses "
										+"where i.id =:theInstructorId"
										, Instructor.class);
			
			// set parameter on query 
			query.setParameter("theInstructorId", theId);
		
			// execute query and get instructor 
			Instructor instructor = query.getSingleResult();
			
			System.out.println("Instructor2: " + instructor);

			// commit transaction
			session.getTransaction().commit(); 
			
			// close session
			session.close();
			
			System.out.println("\nHey, The session is now closed!!!\n");
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
