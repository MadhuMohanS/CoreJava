package com.xworkz.aboutcookie;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/contact",loadOnStartup = 1)
public class ContactInfo extends HttpServlet{
public ContactInfo() {
	System.out.println("running no-arg constructor of contactinfo");
}

@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies=req.getCookies();
		String cookieName="Custom_cookie";
		boolean exists=false;
		if(cookies!=null) {
			for(Cookie cookie:cookies) {
				if(cookie.getName().equals(cookieName)) {
					exists=true;
					break;
				}
			}
		}
		
		if(!exists) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("Error.jsp");
			dispatcher.forward(req, resp);
		}else {
			String mobile=req.getParameter("mobile");
			String email=req.getParameter("email");
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("FinalResult.jsp");
			req.setAttribute("mail", email);
			req.setAttribute("mob", mobile);
			dispatcher.forward(req, resp);
		}
	}
}
