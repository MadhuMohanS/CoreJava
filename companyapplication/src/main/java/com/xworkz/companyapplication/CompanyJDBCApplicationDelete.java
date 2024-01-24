package com.xworkz.companyapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CompanyJDBCApplicationDelete {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	String jdbcUrl="jdbc:mysql://localhost:3306/companyapplication";
	String userName="root";
	String password="Xworkzodc@123";
	
	String deleteQuery="delete from company where id=101";
	
	Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
	System.out.println("connection is successfull");
	
	Statement statement=connection.createStatement();
    int result=statement.executeUpdate(deleteQuery);
    System.out.println("rows affected:"+result);
}
}
