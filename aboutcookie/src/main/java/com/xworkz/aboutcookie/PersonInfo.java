package com.xworkz.aboutcookie;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/personInfo",loadOnStartup = 1)
public class PersonInfo extends HttpServlet{
	public PersonInfo() {
		System.out.println("running no arg constructor of personal info");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service method of service info....");
		
		String cookieName="Custom_cookie";
		String cookieValue="12345agavFEWEWGR";
		boolean exists=false;
		Cookie[] cookies=req.getCookies();
		if(cookies!=null) {
			for(Cookie cookie:cookies) {
				if(cookie.getName().equals(cookieName)) {
					exists=true;
					break;
				}
			}
		}
		if(!exists) {
			Cookie cookie=new Cookie(cookieName, cookieValue);
			cookie.setMaxAge(60);
			resp.addCookie(cookie);
		}
		
		String firstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("ContactDetails.jsp");
		
		HttpSession session=req.getSession();
		session.setAttribute("fname", firstName);
		session.setAttribute("lname", lastName);
		
		dispatcher.forward(req, resp);
		
		
	}

}
