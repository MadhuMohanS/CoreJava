package com.xworkz.line.firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/click", loadOnStartup = 1)
public class LineServlet extends HttpServlet {
	public LineServlet() {
		System.out.println("no-arg constructor of line servlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service method....");
		System.out.println(req.getLocalAddr());
		
		PrintWriter writer=resp.getWriter();
		writer.write("this is the response of line servlet");
	}
}
