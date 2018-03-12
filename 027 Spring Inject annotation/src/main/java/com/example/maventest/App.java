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

		Logger logger = (Logger) context.getBean("logger");
		logger.writeConsole("Hello There");
		logger.writeFile("Hi There");
		

		((ClassPathXmlApplicationContext) context).close();
	}
}
