package com.xworkz.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class BankJDBCApplicationselect {
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
	String selectQuery="select * from bank";
	try {
		connection=DriverManager.getConnection(jdbcUrl,userName,pass);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(selectQuery);
		System.out.println(resultSet.toString());
		while(resultSet.next()) {
			System.out.print(resultSet.getString("b_name")+" ");
			System.out.print(resultSet.getString("branch")+" ");
			System.out.print(resultSet.getString("ifsc_code")+" ");
			System.out.print(resultSet.getString("location")+" ");
			System.out.println();
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
