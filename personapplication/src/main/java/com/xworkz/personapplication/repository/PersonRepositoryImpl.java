package com.xworkz.personapplication.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.personapplication.dto.PersonDto;

public class PersonRepositoryImpl implements PersonRepository{

	PersonDto personDto=new PersonDto();
	@Override
	public void save(PersonDto person) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/personapplication";
		String userName="root";
		String password="Xworkzodc@123";
		String inserQuery="insert into person_info(p_name,total_weight,seat_no) values(?,?,?)";
		
	try {
	Connection connection=	DriverManager.getConnection(jdbcUrl,userName,password);
	PreparedStatement preparedStatement=connection.prepareStatement(inserQuery);
	preparedStatement.setString(1,person.getName() );
	preparedStatement.setInt(2,person.getTotalWeight());
	preparedStatement.setInt(3, person.getSeatNo());
    int rows=preparedStatement.executeUpdate();
    System.out.println("data inserted successfully");
    System.out.println("rows affected:"+rows);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	@Override
	public void saveAll(List<PersonDto> person) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/personapplication";
		String userName="root";
		String password="Xworkzodc@123";
		String inserQuery="insert into person_info(p_name,total_weight,seat_no) values(?,?,?)";
		
		try {
			Connection connection=	DriverManager.getConnection(jdbcUrl,userName,password);
			PreparedStatement preparedStatement=connection.prepareStatement(inserQuery);
			for(PersonDto person1:person) {
				preparedStatement.setString(1, person1.getName());
				preparedStatement.setInt(2, person1.getTotalWeight());
				preparedStatement.setInt(3, person1.getSeatNo());
			int rows=preparedStatement.executeUpdate();
			System.out.println("data inserted successfully");
			System.out.println("rows affected:"+rows);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void update(String name, int weight, int seatNo) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/personapplication";
		String userName="root";
		String password="Xworkzodc@123";
		
		String updateQuery="update person_info set total_weight=?,seat_no=? where p_name=?";
		try {
			Connection connection=	DriverManager.getConnection(jdbcUrl,userName,password);
			PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
			preparedStatement.setInt(1, weight);
			preparedStatement.setInt(2, seatNo);
			preparedStatement.setString(3, name);
		int rows=preparedStatement.executeUpdate();
		System.out.println("updated successfully");
		System.out.println("rows affected:"+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/personapplication";
		String userName="root";
		String password="Xworkzodc@123";
		
		String deleteQuery="delete from person_info where p_name=?";
		try {
			Connection connection=	DriverManager.getConnection(jdbcUrl,userName,password);
			PreparedStatement preparedStatement=connection.prepareStatement(deleteQuery);
			preparedStatement.setString(1, name);
			preparedStatement.execute();
			System.out.println("data deleted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public PersonDto findByName(String name) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/personapplication";
		String userName="root";
		String password="Xworkzodc@123";
		
		String selectQuery="select * from person_info where p_name=?";
		PersonDto person=null;
		try {
	Connection connection=	DriverManager.getConnection(jdbcUrl,userName,password);
	PreparedStatement preparedStatement=connection.prepareStatement(selectQuery);
	preparedStatement.setString(1, name);
	ResultSet resultSet=preparedStatement.executeQuery();
	
	if(resultSet.next()) {
		person=new PersonDto();
		person.setName(resultSet.getString("p_name"));
		person.setSeatNo(resultSet.getInt("seat_no"));
		person.setTotalWeight(resultSet.getInt("total_weight"));
	}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return person;
	}
	@Override
	public List<PersonDto> findAll() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/personapplication";
		String userName="root";
		String password="Xworkzodc@123";
		
		String selectQuery="select * from person_info";
		List<PersonDto> list=new ArrayList<>();
		
		try {
			Connection connection=	DriverManager.getConnection(jdbcUrl,userName,password);
			PreparedStatement preparedStatement=connection.prepareStatement(selectQuery);
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next()) {
			PersonDto personDto=new PersonDto();
			personDto.setName(resultSet.getString("p_name"));
			personDto.setSeatNo(resultSet.getInt("seat_no"));
			personDto.setTotalWeight(resultSet.getInt("total_weight"));
			list.add(personDto);
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return list;
	}
	
	

}
