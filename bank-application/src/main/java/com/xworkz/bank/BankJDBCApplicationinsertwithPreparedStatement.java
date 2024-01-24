package com.xworkz.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankJDBCApplicationinsertwithPreparedStatement {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String jdbcUrl="jdbc:mysql://localhost:3306/bankapplication";
		String passWord="Xworkzodc@123";
		String userName="root";
		String insertQuery="insert into bank values(?,?,?,?,?)";
	try {
		Connection connection=	DriverManager.getConnection(jdbcUrl,userName,passWord);
		PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
		
		preparedStatement.setInt(1, 201);
		preparedStatement.setString(2, "xworkz");
		preparedStatement.setString(3, "kormangla");
		preparedStatement.setString(4,"Xwor009");
		preparedStatement.setString(5,"banglore");
		preparedStatement.execute();
		System.out.println("data inserted");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
}
