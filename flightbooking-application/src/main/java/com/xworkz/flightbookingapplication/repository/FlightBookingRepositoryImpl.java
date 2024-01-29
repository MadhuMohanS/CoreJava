package com.xworkz.flightbookingapplication.repository;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

}
