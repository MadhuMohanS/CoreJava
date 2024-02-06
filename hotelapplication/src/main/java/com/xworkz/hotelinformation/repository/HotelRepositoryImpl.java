package com.xworkz.hotelinformation.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.hotelinformation.dto.HotelDto;

public class HotelRepositoryImpl implements HotelRepository{
	HotelDto hotel=new HotelDto();

	@Override
	public void save(HotelDto hotel) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/hotelapplication";
		String userName="root";
		String password="Xworkzodc@123";
		
		String insertQuery="insert into hotel(h_name,branch,location,manager) values(?,?,?,?);";
		
		try {
			Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
			System.out.println("connection is successfull");
			PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
			preparedStatement.setString(1,hotel.getName());
			preparedStatement.setString(2, hotel.getBranch());
			preparedStatement.setString(3, hotel.getLocation());
			preparedStatement.setString(4, hotel.getManager());
			preparedStatement.execute();
			System.out.println("data inserted successully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void saveAll(List<HotelDto> hotelDto) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/hotelapplication";
		String userName="root";
		String password="Xworkzodc@123";
		
		String insertQuery="insert into hotel(h_name,branch,location,manager) values(?,?,?,?)";
		
		try {
	Connection connection=	DriverManager.getConnection(jdbcUrl,userName,password);
	PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
	for(HotelDto hotel:hotelDto) {
	preparedStatement.setString(1, hotel.getName());
	preparedStatement.setString(2, hotel.getBranch());
	preparedStatement.setString(3, hotel.getLocation());
	preparedStatement.setString(4, hotel.getManager());
int row=	preparedStatement.executeUpdate();
	System.out.println("data inserted successsfully:"+row);
	}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(String name, String branch, String location) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/hotelapplication";
		String userName="root";
		String password="Xworkzodc@123";
		
		String updateQuery="update hotel set branch=?,location=? where h_name=?";
		try {
			Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
		PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
		preparedStatement.setString(1, branch);
		preparedStatement.setString(2, location);
		preparedStatement.setString(3, name);
	int row=preparedStatement.executeUpdate();
	System.out.println("rows updated:"+row);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public HotelDto findByName(String hotelName) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/hotelapplication";
		String userName="root";
		String password="Xworkzodc@123";
		
		String selectQuery="select * from hotel where h_name=?";
		HotelDto hotelDto=null;
		try {
			Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
			PreparedStatement preparedStatement=connection.prepareStatement(selectQuery);
			preparedStatement.setString(1, hotelName);
		    ResultSet resultSet=preparedStatement.executeQuery();
		    hotelDto=new HotelDto();
		    if(resultSet.next()) {
		    	hotelDto.setBranch(resultSet.getString("branch"));
		    	hotelDto.setLocation(resultSet.getString("location"));
		    	hotelDto.setName(resultSet.getString("h_name"));
		    	hotelDto.setManager(resultSet.getString("manager"));
		    	}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return hotelDto;
	}

	@Override
	public List<HotelDto> finAll() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/hotelapplication";
		String userName="root";
		String password="Xworkzodc@123";
		
		String selectQuery="select * from hotel";
		List<HotelDto> list=new ArrayList<>();
		
	try {
		Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
		PreparedStatement preparedStatement=connection.prepareStatement(selectQuery);
	ResultSet resultSet=preparedStatement.executeQuery();
	
	while(resultSet.next()) {
		HotelDto hotelDto=new HotelDto();
		hotelDto.setName(resultSet.getString("h_name"));
		hotelDto.setBranch(resultSet.getString("branch"));
		hotelDto.setLocation(resultSet.getString("location"));
		hotelDto.setManager(resultSet.getString("manager"));
		list.add(hotelDto);
	}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return list;
	}

//	@Override
//	public List<HotelDto> findAll() {
//		// TODO Auto-generated method stub
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		String jdbcUrl="jdbc:mysql://localhost:3306/hotelapplication";
//		String userName="root";
//		String password="Xworkzodc@123";
//		
//		String selectQuery="select * from hotel";
//		List<HotelDto> list=new ArrayList<>();
//		
//		try {
//		Connection connection=	DriverManager.getConnection(jdbcUrl,userName,password);
//		PreparedStatement preparedStatement=connection.prepareStatement(selectQuery);
//	ResultSet resultSet=preparedStatement.executeQuery();
//	
//	while(resultSet.next()) {
//		HotelDto hotelDto=new HotelDto();
//		hotelDto.setName(resultSet.getString("h_name"));
//		hotelDto.setBranch(resultSet.getString("branch"));
//		hotelDto.setLocation(resultSet.getString("location"));
//		hotelDto.setManager(resultSet.getString("manager"));
//		list.add(hotelDto);
//	}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return list;
//	}


	

}
