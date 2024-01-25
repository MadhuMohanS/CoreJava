package com.xworkz.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankJDBCUpdate2UsingPReparesStatement {
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
	
	String updateQuery="update bank set branch=? where location=? and ifsc_code=?";
	
	try {
		Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
		System.out.println("connection is successfull");
		PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
		preparedStatement.setString(1, "bomnahalli");
		preparedStatement.setString(2, "banglore");
		preparedStatement.setString(3, "DIA009");
		preparedStatement.execute();
		
		preparedStatement.setString(1, "bomhahalli");
		preparedStatement.setString(2, "banglore");
		preparedStatement.setString(3, "GRA009");
		preparedStatement.execute();
		System.out.println("data successfully updated");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
