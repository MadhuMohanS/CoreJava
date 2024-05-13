package com.xworkz.moviejdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class MoviejdbcApplication implements CommandLineRunner{

	@Autowired
	MovieDto movieDto;
	public static void main(String[] args) {
		SpringApplication.run(MoviejdbcApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		movieDto.createTable();
		this.createUser();
//		int update= movieDto.updateUser(101, "Bahubali", "Prabhas", "Anushka");
//		System.out.println("no of rows updated:"+update);
		movieDto.deleteUser(101);
	}
	public void createUser() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the id:");
		Integer id=Integer.parseInt(br.readLine());
		
		System.out.println("enter the name:");
		String name=br.readLine();
		
		System.out.println("enter the hero name");
		String heroName=br.readLine();
		System.out.println("enter the heroine name");
		String heroineName=br.readLine();
		
		movieDto.insertUser(id, name, heroName, heroineName);
		
	}
	

}
