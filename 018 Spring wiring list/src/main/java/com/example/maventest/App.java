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

		for (String name : patient.getEmergencyContactNames()) {
			System.out.println(name);
		}

		((ClassPathXmlApplicationContext) context).close();
	}
}
