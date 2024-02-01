package com.xworkz.flightbookingapplication.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.flightbookingapplication.dto.PersonInfoDto;

public class PersonInfoRepositoryImpl implements PersonInfoRepository{

	@Override
	public void savePersonDetails(PersonInfoDto person) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String jdbcUrl="jdbc:mysql://localhost:3306/ticketsystem";
		String userName="root";
		String password="Xworkzodc@123";
		String insertQuery="insert into person_info(p_name,total_weight,seat_no) values(?,?,?);";
		
		try {
			Connection connection=DriverManager.getConnection(jdbcUrl,userName,password);
			System.out.println("connection is successfull");
			PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
			preparedStatement.setString(1,person.getName() );
			preparedStatement.setInt(2,person.getTotalWeight() );
			preparedStatement.setInt(3,person.getSeatNo() );
			preparedStatement.execute();
			System.out.println("data inserted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
