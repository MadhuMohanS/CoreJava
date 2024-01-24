package com.xworkz.companyapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CompanyJDBCApplicationUpdate {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	String JdbcUrl="jdbc:mysql://localhost:3306/companyapplication";
	String userName="root";
	String password="Xworkzodc@123";
	
	String updateQuery="update company set id=101 where id=1";
	String updateQuery1="update company set id=102 where id=2";
	String updateQuery2="update company set id=103 where id=3";
	String updateQuery3="update company set id=104 where id=4";
	String updateQuery4="update company set id=105 where id=5";
	String updateQuery5="update company set id=106 where id=6";
	String updateQuery6="update company set id=107 where id=7";
	String updateQuery7="update company set id=108 where id=8";
	String updateQuery8="update company set id=109 where id=9";
	String updateQuery9="update company set id=110 where id=10";
	
	
	Connection connection=DriverManager.getConnection(JdbcUrl,userName,password);
	System.out.println("connection is successfull");
	
	Statement statement=connection.createStatement();
    int result=	statement.executeUpdate(updateQuery);
    System.out.println("rows affected:"+result);
    result=	statement.executeUpdate(updateQuery1);
    System.out.println("rows affected:"+result);
    result=	statement.executeUpdate(updateQuery2);
    System.out.println("rows affected:"+result);
    result=	statement.executeUpdate(updateQuery3);
    System.out.println("rows affected:"+result);
    result=	statement.executeUpdate(updateQuery4);
    System.out.println("rows affected:"+result);
    result=	statement.executeUpdate(updateQuery5);
    System.out.println("rows affected:"+result);
    result=	statement.executeUpdate(updateQuery6);
    System.out.println("rows affected:"+result);
    result=	statement.executeUpdate(updateQuery7);
    System.out.println("rows affected:"+result);
    result=	statement.executeUpdate(updateQuery8);
    System.out.println("rows affected:"+result);
    result=	statement.executeUpdate(updateQuery9);
    System.out.println("rows affected:"+result);
	
}
}
