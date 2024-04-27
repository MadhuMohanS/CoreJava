package com.xworkz.flightbookingapplication.repository;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.flightbookingapplication.dto.FlightBookingDto;

public class FlightBookingRepositoryImpl implements FlightBookingRepository{
	@Override
	public void saveFlightBookingDetails(FlightBookingDto booking) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/ticketsystem";
		String userName="root";
		String password="Xworkzodc@123";
		String insertQuery="insert into airticket"+
		"(flight_name,source,destination,price) "+ 
				"values(?,?,?,?)";
		
		try {
	Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
			PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
			preparedStatement.setString(1, booking.getFlightName());
			preparedStatement.setString(2, booking.getSource());
			preparedStatement.setString(3, booking.getDestination());
			preparedStatement.setInt(4, booking.getPrice());
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void saveAll(List<FlightBookingDto> bookings) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String jdbcUrl="jdbc:mysql://localhost:3306/ticketsystem";
		String userName="root";
		String password="Xworkzodc@123";
		String insertQuery="insert into airticket"+
		"(flight_name,source,destination,price) "+
				"values(?,?,?,?)";
		
		try {
			Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
			PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
			for(FlightBookingDto booking:bookings) {
			preparedStatement.setString(1, booking.getFlightName());
			preparedStatement.setString(2, booking.getSource());
			preparedStatement.setString(3, booking.getDestination());
			preparedStatement.setInt(4, booking.getPrice());
			
			preparedStatement.execute();
			System.out.println("data inserted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(String flightName, String source, String destination) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String jdbcUrl="jdbc:mysql://localhost:3306/ticketsystem";
		String userName="root";
		String password="Xworkzodc@123";
		
		String updateQuery="update airticket set source=?,destination=? where flight_name=?";
		
		try {
		Connection connection=	DriverManager.getConnection(jdbcUrl,userName,password);
		PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
		preparedStatement.setString(1,source);
		preparedStatement.setString(2,destination);
		preparedStatement.setString(3,flightName);
		preparedStatement.executeUpdate();
		System.out.println("data is successfully updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteByFlightName(String flightName) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/ticketsystem";
		String userName="root";
		String password="Xworkzodc@123";
		
		String deleteQuery="delete from airticket where flight_name=?";
		try {
			Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
			PreparedStatement preparedStatement=connection.prepareStatement(deleteQuery);
			preparedStatement.setString(1, flightName);
			preparedStatement.executeUpdate();
			System.out.println("data deleted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public FlightBookingDto findByName(String flightName) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/ticketsystem";
		String userName="root";
		String password="Xworkzodc@123";
		
		String selectQuery="select * from airticket where flight_name=?";
		FlightBookingDto booking=null;
		
	try {
		Connection connection=	DriverManager.getConnection(jdbcUrl,userName,password);
	PreparedStatement preparedStatement=connection.prepareStatement(selectQuery);
	preparedStatement.setString(1, flightName);
    ResultSet resultSet=preparedStatement.executeQuery();
    if(resultSet.next()) {
	System.out.println(resultSet.getString("source"));
	System.out.println(resultSet.getString("destination"));
	booking=new FlightBookingDto();
	booking.setFlightName(resultSet.getString("flight_name"));
	booking.setSource(resultSet.getString("source"));
	booking.setDestination(resultSet.getString("destination"));
	booking.setPrice(resultSet.getInt("price"));
}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	return booking;	
	}

	@Override
	public List<FlightBookingDto> findAll() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/ticketsystem";
		String userName="root";
		String password="Xworkzodc@123";
		
		String selectQuery="select * from airticket";
		List<FlightBookingDto> bookings=new ArrayList<>();
		
	try {
		Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
		  PreparedStatement preparedStatement=connection.prepareStatement(selectQuery);
		  ResultSet resultSet=preparedStatement.executeQuery();
		  while(resultSet.next()) {
			  System.out.println(resultSet.getString(2));
			  System.out.println(resultSet.getString("source"));
			  FlightBookingDto booking=new FlightBookingDto();
			  booking.setFlightName(resultSet.getString("flight_name"));
			  booking.setSource(resultSet.getString("source"));
			  booking.setDestination(resultSet.getString("destination"));
			  booking.setPrice(resultSet.getInt("price"));
			  bookings.add(booking);
		  }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		return bookings;
	}

}
