package com.xworkz.loginform2;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/register", loadOnStartup = 1)
public class RegisterServlet extends HttpServlet {

	EntityManagerFactory entityManagerFactory;

	public RegisterServlet() {
		System.out.println("running no-arg constructor of register");
	}

	@Override
	public void init() throws ServletException {
		entityManagerFactory = Persistence.createEntityManagerFactory("com.xwork");

	}

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");

		RegisterDto registerDto = new RegisterDto();
		registerDto.setUserName(userName);
		registerDto.setEmail(email);
		registerDto.setPassword(password);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(registerDto);
			System.out.println("data inserted successfully");
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while inserting data " + e);
			transaction.rollback();
		}
		finally {
			entityManager.close();
		}

	}

	@Override
	public void destroy() {
		this.entityManagerFactory.close();
	}

}
