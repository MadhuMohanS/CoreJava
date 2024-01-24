package com.xworkz.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class BankJDBCApplicationDelete {

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String jdbcUrl="jdbc:mysql://localhost:3306/bankapplication";
		String userName="root";
		String pass="Xworkzodc@123";
		
		String deleteQuery="delete from bank where b_name='sbi'";
		
		try {
			connection=DriverManager.getConnection(jdbcUrl,userName,pass);
		System.out.println("connection is successfull");
		
		statement=connection.createStatement();
		int result=statement.executeUpdate(deleteQuery);
		System.out.println("rows affected:"+result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
