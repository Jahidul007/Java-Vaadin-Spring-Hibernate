package com.example.maventest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/beans/beans.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		for (EmergencyContact contact : patient.getEmergencyContact()) {
			System.out.println(contact);
		}

		((ClassPathXmlApplicationContext) context).close();
	}
}
