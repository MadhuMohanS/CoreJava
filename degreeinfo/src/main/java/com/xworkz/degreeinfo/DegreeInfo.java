package com.xworkz.degreeinfo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/degree",loadOnStartup = 1)
public class DegreeInfo extends HttpServlet{
public DegreeInfo() {
	System.out.println("running no-arg constructor of degreeinfo");
}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service method..");
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String college=req.getParameter("college");
		String degree=req.getParameter("degree");
		String stream=req.getParameter("stream");
		String percentage=req.getParameter("percentage");
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("DegreeResult.jsp");
		req.setAttribute("nm", name);
		req.setAttribute("em", email);
		req.setAttribute("coll", college);
		req.setAttribute("deg", degree);
		req.setAttribute("stre", stream);
		req.setAttribute("per", percentage);
		
		dispatcher.forward(req, resp);
	}
}
