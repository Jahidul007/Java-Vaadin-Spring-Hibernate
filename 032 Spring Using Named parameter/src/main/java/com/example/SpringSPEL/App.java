package com.example.SpringSPEL;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/beans/beans.xml");

		NoticesDAO noticeDao = (NoticesDAO) context.getBean("noticeDao");

		try {
			List<Notice> notices = noticeDao.getNotices(); 
			for (Notice notice : notices) {
				System.out.println(notice);
			}
			Notice notice = noticeDao.getNotice(4);
			System.out.println("Notice with id 4: " + notice);

		} catch (CannotGetJdbcConnectionException ex1) {
			System.out.println(ex1.getMessage());
			System.out.println(ex1.getClass());

		}catch (DataAccessException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getClass());

		}
		


		((ClassPathXmlApplicationContext) context).close();
	}
}
