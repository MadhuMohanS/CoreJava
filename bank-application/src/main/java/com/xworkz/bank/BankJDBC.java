package com.xworkz.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class BankJDBC {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
		e.printStackTrace();
	}
	String jdbcUrl="jdbc:mysql://localhost:3306/bankapplication";
	String userName="root";
	String pass="Xworkzodc@123";
	String sql="insert into bank values(12,'sulthan bank','btm nagar','SUL066','banglore'),(11,'sulthan bank','btm nagar','SUL066','banglore')";
	String sql1="update bank set id=110 where id=10";
	
	
	try {
	Connection connection=DriverManager.getConnection(jdbcUrl,userName,pass);
		System.out.println("connection is successfull");
		Statement statement=connection.createStatement();
		int result=statement.executeUpdate(sql1);
		//use executeUpdate();
		System.out.println("no of query updated:"+result);
		System.out.println("query was updated");
	
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
