package com.xworkz.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class BankJDBCApplicationSelectPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String jdbcUrl="jdbc:mysql://localhost:3306/bankapplication";
		String userName="root";
		String password="Xworkzodc@123";
		String selectQuery="select * from bank where b_name=? or location=?";
		ResultSet resultset=null;
		Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
		
		PreparedStatement preparedStatement=connection.prepareStatement(selectQuery);
//		ResultSet resultset=preparedStatement.executeQuery(selectQuery);
		try {
			preparedStatement.setString(1, "ICICI");
			preparedStatement.setString(2, "banglore");
			resultset=	preparedStatement.executeQuery();
			
			while(resultset.next()) {
				System.out.println("bank details---");
				System.out.print("bank name:"+resultset.getString("b_name")+" ");
				System.out.print("branch:"+resultset.getString("branch")+" ");
				System.out.print("ifsc_code:"+resultset.getString("ifsc_code")+" ");
				System.out.print("location:"+resultset.getString("location")+" ");
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				connection.close();
			}
			if(preparedStatement!=null) {
				preparedStatement.close();
			}
			if(resultset!=null) {
				resultset.close();
			}
		}
		
		

	}

}
