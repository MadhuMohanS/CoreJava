package com.xworkz.companyapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class CompanyJDBCApplicationSelect {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	String jdbcUrl="jdbc:mysql://localhost:3306/companyapplication";
	String userName="root";
	String password="Xworkzodc@123";
	
	String selectQuery="select * from company";
	
	Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
	PreparedStatement preparedStatement=connection.prepareStatement(selectQuery);
	
	ResultSet resultset=preparedStatement.executeQuery();
	
	while(resultset.next()) {
		System.out.print(resultset.getInt("id")+" ");
		System.out.print(resultset.getString("c_name")+" ");
		System.out.print(resultset.getString("location")+" ");
		System.out.print(resultset.getString("ceo_name")+" ");
		System.out.print(resultset.getString("branch")+" ");
		System.out.println();
	}
	
}
}
