package com.xworkz.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankJDBCDeletePrepareParedStatement {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String jdbcUrl="jdbc:mysql://localhost:3306/bankapplication";
	String userName="root";
	String password="Xworkzodc@123";
	
	String deleteQuery="delete from bank where branch=? and location=?";
	
	try {
		Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
		System.out.println("connection is successfull");
		PreparedStatement preparedStatement=connection.prepareStatement(deleteQuery);
		preparedStatement.setString(1, "nayag nagar");
		preparedStatement.setString(2, "Banglore");
		preparedStatement.execute();
		
		preparedStatement.setString(1, "btm nagar");
		preparedStatement.setString(2, "banglore");
		preparedStatement.execute();
		System.out.println("data successfully deleted");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
