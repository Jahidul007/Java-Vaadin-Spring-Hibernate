package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String JDBC_DRIVER= "com.mysql.jdbc.Driver";
		String DATABASE_URL= "jdbc:mysql://localhost:3306/database123?useSSL=false";
	    String USER= "root";
		String PASSWORD= "202205";
		
		try {
			System.out.println("Connecting to database"+DATABASE_URL );
			Connection myConnection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
			System.out.println("Connection Successful!!!!!!!!!");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
