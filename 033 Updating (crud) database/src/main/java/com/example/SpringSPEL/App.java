package com.example.SpringSPEL;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/beans/beans.xml");

		NoticesDAO noticeDao = (NoticesDAO) context.getBean("noticeDao");

		try {
			/*
			 //delete operation 
			 noticeDao.delete(3);
			 
			//insert operation
			Notice notice1 = new Notice("parthiv", "parthiv@gmail.com", "i love to play cricket");
			noticeDao.create(notice1);*/
			
			//update
			Notice notice1 = new Notice(7,"Sanon", "sanon@gmail.com", "ranon loves to play Tennis");
			noticeDao.update(notice1);

			List<Notice> notices = noticeDao.getNotices();
			for (Notice notice : notices) {
				System.out.println(notice);
			}

		} catch (CannotGetJdbcConnectionException ex1) {
			System.out.println(ex1.getMessage());
			System.out.println(ex1.getClass());

		} catch (DataAccessException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getClass());

		}

		((ClassPathXmlApplicationContext) context).close();
	}
}
