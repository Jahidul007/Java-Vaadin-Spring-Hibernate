package com.example.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		// create session factory

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			// create 3 studen objects
			System.out.println("creating 3 new student objects...........");
			Student tempStudent1 = new Student("Jong", "king", "Jong@gmail.com");
			Student tempStudent2 = new Student("Tom", "Copper", "Tom@gmail.com");
			Student tempStudent3 = new Student("Lynn", "Chrmis", "Lynn@gmail.com");

			// start a transaction
			session.beginTransaction();

			// save the student object

			System.out.println("Saving the students........");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done My Job!!!!!!!!!!!");

		} finally {
			session.close();
			factory.close();

		}
	}

}
