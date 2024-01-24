package com.xworkz.companyapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CompanyJDBCApplicationInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		String jdbcUrl="jdbc:mysql://localhost:3306/CompanyApplication";
		String userName="root";
		String passWord="Xworkzodc@123";
//		String insertQuery="insert into company values(1,'infosys','white field','narayan murthy','banglore')";
//		String insertQuery1="insert into company values(2,'wipro','tin factory','ajim','banglore')";
//		String insertQuery2="insert into company values(3,'reliance','white field','ambani','hyderabad')";
//		String insertQuery3="insert into company values(4,'microsoft','jp nagar','billgates','banglore')";
//		String insertQuery4="insert into company values(5,'apple','white field','steve','new delhi')";

//		Connection connection=null;
//		try {
//			connection = DriverManager.getConnection(jdbcUrl,userName,passWord);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("connection is successfull");
//		Statement statement=null;
//		try {
//			statement = connection.createStatement();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	   
//		try {
////		boolean	result = statement.execute(insertQuery);
//		
////		 System.out.println("result:"+result);
//			statement.execute(insertQuery1);
//			statement.execute(insertQuery2);
//			statement.execute(insertQuery3);
//			statement.execute(insertQuery4);
//		    System.out.println("data inserted");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			connection.close();
//			statement.close();
//		}
	   String insertQuery="insert into company values(?,?,?,?,?)";
	   Connection connection=DriverManager.getConnection(jdbcUrl,userName,passWord);
	   System.out.println("connection successfull");
	   PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
//	   preparedStatement.setInt(1, 6);
//	   preparedStatement.setString(2, "adobe");
//	   preparedStatement.setString(3, "jayanagar");
//	   preparedStatement.setString(4, "vignesh");
//	   preparedStatement.setString(5, "mumbai");
//	   preparedStatement.execute();
	   
	   preparedStatement.setInt(1, 7);
	   preparedStatement.setString(2, "etranbiz");
	   preparedStatement.setString(3, "jayanagar");
	   preparedStatement.setString(4, "musthafa");
	   preparedStatement.setString(5, "manglore");
	   preparedStatement.execute();
	   
	   preparedStatement.setInt(1, 8);
	   preparedStatement.setString(2, "Tide");
	   preparedStatement.setString(3, "ram and co");
	   preparedStatement.setString(4, "Bhushan");
	   preparedStatement.setString(5, "mumbai");
	   preparedStatement.execute();
	   
	   preparedStatement.setInt(1, 9);
	   preparedStatement.setString(2, "surfexcel");
	   preparedStatement.setString(3, "banashankari");
	   preparedStatement.setString(4, "Kiran");
	   preparedStatement.setString(5, "banglore");
	   preparedStatement.execute();
	   
	   preparedStatement.setInt(1, 10);
	   preparedStatement.setString(2, "woodland");
	   preparedStatement.setString(3, "btm");
	   preparedStatement.setString(4, "md faraz");
	   preparedStatement.setString(5, "Ahmedbad");
	   preparedStatement.execute();
	   System.out.println("data inserted");
	   
		
	}
}
