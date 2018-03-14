package com.example.SpringSPEL;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/beans/beans.xml");

		NoticesDAO dao = (NoticesDAO) context.getBean("dao");

		List<Notice> notices = dao.getNotices();

		for (Notice notice : notices) {
			System.out.println(notice);

		}

		((ClassPathXmlApplicationContext) context).close();
	}
}
