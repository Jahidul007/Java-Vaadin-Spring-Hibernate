package com.example.maventest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/beans/beans.xml");

		ContactBook contacts = (ContactBook) context.getBean("contactBook");
		System.out.println(contacts);

		((ClassPathXmlApplicationContext) context).close();
	}
}
