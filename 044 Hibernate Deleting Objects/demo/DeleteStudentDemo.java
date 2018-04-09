package com.example.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.demo.entity.*;

public class DeleteStudentDemo {

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
			int studentId = 7;
		
			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on id: primary key 
			System.out.println("\nGetting student with id: "+ studentId);
			
			Student myStudent = session.get(Student.class,studentId);
			
			// delete the student 
			System.out.println("deleting student: "+myStudent);
			session.delete(myStudent);
			
			// delete student id =8
			System.out.println("\n\n\nDeleting student id = 8");
			session.createQuery("delete from Student where id =8").executeUpdate();
			
			//commit the transaction 
			session.getTransaction().commit();
			
			System.out.println("Done My Job!!!!!!");
				
			
		} finally {
			
			session.close();
			factory.close();
			
		}
	}

}
