package com.xworkz.moviejdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDto {
	@Autowired
	private JdbcTemplate jdbcTemplate;
public MovieDto() {
	// TODO Auto-generated constructor stub
	System.out.println("running no-arg constructor of moviedto");
}
public int createTable() {
	String sql="create table if not exists movie(id int primary key,name varchar(20),heroname varchar(20),heroinename varchar(20))";
	int update= jdbcTemplate.update(sql);
	System.out.println("table successfully created");
	return update;
}
public int insertUser(Integer id,String name,String heroName,String heroineName) {
	String sql="insert into movie values(?,?,?,?)";
	int update= jdbcTemplate.update(sql,id,name,heroName,heroineName);
	System.out.println("data inserted successfully");
	return update;
}

public int updateUser(Integer id,String name,String heroName,String heroineName) {
	String sql="update movie set name=?,heroname=?,heroinename=? where id=?";
	int update= jdbcTemplate.update(sql,name,heroName,heroineName,id);
	System.out.println("data updated successfully");
	return update;
}

public int deleteUser(Integer id) {
	String sql="delete from movie where id=?";
	int update= jdbcTemplate.update(sql,id);
	System.out.println(id+" deleted successfully");
	return update;
}

}
}
