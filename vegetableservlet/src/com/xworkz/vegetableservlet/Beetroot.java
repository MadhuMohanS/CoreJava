package com.xworkz.vegetableservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="beetroot",urlPatterns = "/beetroot",loadOnStartup = 1)
public class Beetroot extends HttpServlet{
	public Beetroot() {
		System.out.println("no argument constructor has been created.. using tomcat server");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Beetroot has been called....");
		System.out.println(req.getLocalAddr());
		
		res.setContentType("text/plain");
	PrintWriter writer=	res.getWriter();
	writer.write("this is the response of beetroot");
	}

}
