package com.xworkz.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankJDBCApplicationUpdate {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	String jdbcUrl="jdbc:mysql://localhost:3306/bankapplication";
	String userName="root";
	String passWord="Xworkzodc@123";
	String updateQuery="update bank set id=1 where id=11";
	Connection connection=DriverManager.getConnection(jdbcUrl,userName,passWord);
	Statement statement=connection.createStatement();
	int result= statement.executeUpdate(updateQuery);
	System.out.println("no of rows affected:"+result);	
}
}
