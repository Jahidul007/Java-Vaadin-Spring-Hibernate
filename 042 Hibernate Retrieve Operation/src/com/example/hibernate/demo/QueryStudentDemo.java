package com.example.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.demo.entity.*;

public class QueryStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create session factory
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
								
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			
			// start a transaction 
			session.beginTransaction();
			
			// query the students
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			//display the students
			displayStudents(theStudents);
			
			// query students: lastName = "hasan" 
			theStudents = session.createQuery("from Student s where s.lastName='hasan'").getResultList();
			
			// display the students
			System.out.println("\n\n\nStudents who have last name of hasan");
			displayStudents(theStudents);
			
			// query students: lastName = "john" or firstName='tom' 
			theStudents = 
					session.createQuery("from Student s where"
							+" s.lastName='hasan' OR firstName='Tom'").getResultList();
			
			// display the students
			System.out.println("\n\n\nStudents who have last name of hasan or first name Tom");
			displayStudents(theStudents);
			
			// query students: lastName = "john" or firstName='tom' 
			theStudents = 
					session.createQuery("from Student s where"
							+" s.email LIKE '%gmail.com'").getResultList();
			
			// display the students
			System.out.println("\n\n\nStudents whose email ends with gmail.com");
			displayStudents(theStudents);

			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done My Job!!!!!!!!!!!");
			
			
			
		} finally {
			
			session.close();
			factory.close();
			
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}
