package com.xworkz.loginform;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.loginform.repository.RegisterDto;

@WebServlet(urlPatterns = "/register",loadOnStartup = 1)
public class RegisterServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName=req.getParameter("username");
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		
		RegisterDto registerDto=new RegisterDto();
		registerDto.setUserName(userName);
		registerDto.setEmail(email);
		registerDto.setPassword(password);
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction transaction= entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(registerDto);
			System.out.println("data inserted successfully");
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while inserting data "+e);
			transaction.rollback();
		}
		
		
		
	}
}
