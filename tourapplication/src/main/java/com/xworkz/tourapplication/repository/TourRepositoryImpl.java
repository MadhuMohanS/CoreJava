package com.xworkz.tourapplication.repository;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.xworkz.tourapplication.dto.TourDto;

public class TourRepositoryImpl implements TourRepository{

	public void save(TourDto t) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/tourapplication";
		String userName="root";
		String password="Xworkzodc@123";
		
		String insertQuery="insert into tourInfo values(?,?,?,?)";
		
	try {
		Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
		PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
		preparedStatement.setInt(1, t.getId());
		preparedStatement.setString(2, t.getFromPlace());
		preparedStatement.setString(3, t.getToPlace());
		preparedStatement.setDouble(4, t.getCost());
		preparedStatement.execute();
		System.out.println("data inserted successfully");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	public void saveAll(List<TourDto> t) {
		// TODO Auto-generated method stub
	   try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   String jdbcUrl="jdbc:mysql://localhost:3306/tourapplication";
	   String userName="root";
	   String passWord="Xworkzodc@123";
	   String insertQuery="insert into tourInfo values(?,?,?,?)";
	   
	 try {
		Connection connection= DriverManager.getConnection(jdbcUrl,userName,passWord);
	PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
	for(TourDto tours:t) {
	preparedStatement.setInt(1, tours.getId());
	preparedStatement.setString(2, tours.getFromPlace());
	preparedStatement.setString(3, tours.getToPlace());
	preparedStatement.setDouble(4, tours.getCost());
	preparedStatement.execute();
	System.out.println("data successfully inserted");
	}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	public void update(int id,double cost) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/tourapplication";
		String userName="root";
		String passWord="Xworkzodc@123";
		String updateQuery="update tourInfo set cost=? where id=?";
		
	try {
		Connection connection=DriverManager.getConnection(jdbcUrl,userName,passWord);
		PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
		preparedStatement.setDouble(1,cost );
		preparedStatement.setInt(2, id);
		int rows=preparedStatement.executeUpdate();
		System.out.println("rows affected:"+rows);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	public void deleteByCost(double cost) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/tourapplication";
		String passWord="Xworkzodc@123";
		String userName="root";
		
		String deleteQuery="delete from tourInfo where cost=?";
		
	try {
		Connection connection=DriverManager.getConnection(jdbcUrl,userName,passWord);
		PreparedStatement preparedStatement= connection.prepareStatement(deleteQuery);
		preparedStatement.setDouble(1, cost);
		int rows= preparedStatement.executeUpdate();
		System.out.println("data deleted successfully");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	public TourDto findByCost(double cost) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/tourapplication";
		String userName="root";
		String passWord="Xworkzodc@123";
		
		String findQuery="select * from tourInfo where cost=?";
		TourDto tourDto=null;
		
		try {
			Connection connection= DriverManager.getConnection(jdbcUrl,userName,passWord);
			PreparedStatement preparedStatement=connection.prepareStatement(findQuery);
			preparedStatement.setDouble(1, cost);
	ResultSet resultSet=	preparedStatement.executeQuery();
	
	if(resultSet.next()) {
		tourDto=new TourDto();
		tourDto.setId(resultSet.getInt("id"));
		tourDto.setFromPlace(resultSet.getString("fromPlace"));
		tourDto.setToPlace(resultSet.getString("toPlace"));
		tourDto.setCost(resultSet.getDouble("cost"));
		
	}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tourDto;
	}
	
	

}
