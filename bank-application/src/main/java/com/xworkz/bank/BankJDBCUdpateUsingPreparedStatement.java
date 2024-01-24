package com.xworkz.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankJDBCUdpateUsingPreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/bankapplication";
		String userName="root";
		String password="Xworkzodc@123";
		
		String updateQuery="update bank set branch=?,location=? where b_name=?";
		
		try {
			Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
			System.out.println("connection is successfull");
			PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
			preparedStatement.setString(1, "jayanagar");
			preparedStatement.setString(2, "banglore");
			preparedStatement.setString(3, "Yes bank");
			preparedStatement.execute();
			
			preparedStatement.setString(1, "nayak nagar");
			preparedStatement.setString(2, "darmavaram");
			preparedStatement.setString(3, "union bank");
			preparedStatement.execute();
			System.out.println("data successfully updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
