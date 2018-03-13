package com.example.SpringSPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/beans/beans.xml");

		Parrot parrot = (Parrot) context.getBean("parrot");
		parrot.speak();

		((ClassPathXmlApplicationContext) context).close();
	}
}
