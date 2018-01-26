package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.api.jdbc.Statement;

public class studentJDBCQuery {
	private String JDBC_DRIVER ="com.mysql.cj.jdbc.Driver";
	private String DATABASE_URL = "jdbc:mysql://localhost:3306/database123";
	private String USER = "root";
	private String PASSWORD = "202205";
	
	public void readDatabase()
	{
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet =null;
		try {
			Class.forName(JDBC_DRIVER).newInstance ();
			connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
			statement =(Statement) connection.createStatement();
			String sqlCommand = "select * from newtable";
			resultSet= statement.executeQuery(sqlCommand);
			
			while (resultSet.next()) {
				String Name = resultSet.getString("name");
				String Address = resultSet.getString("Address");
				String Email = resultSet.getString("Email");
				int Age = resultSet.getInt("Age");
				String Phone = resultSet.getString("Phone");
				
				student std = new student(Name,Address,Email,Age,Phone);
				System.out.println(std);
				System.out.println(Name+"-"+Address+"-"+Email+"-"+Age+"-"+Phone);
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				resultSet.close();
				statement.close();
				connection.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

}
