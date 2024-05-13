package com.xworkz.studentinfo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/student",loadOnStartup = 1)
public class StudentInfo extends HttpServlet{
public StudentInfo() {
	System.out.println("running no-arg constructor of student info");
}

@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service method in studentinfo");
		
		
		String name=req.getParameter("name");
		String fatherName=req.getParameter("fatherName");
		String motherName=req.getParameter("motherName");
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("StudentResult.jsp");
		req.setAttribute("name", name);
		req.setAttribute("fn", fatherName);
		req.setAttribute("mn", motherName);
		dispatcher.forward(req, resp);
	}
}
