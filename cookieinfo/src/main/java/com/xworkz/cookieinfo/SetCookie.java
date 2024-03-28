package com.xworkz.cookieinfo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/setCookie",loadOnStartup = 1)
public class SetCookie extends HttpServlet{
public SetCookie() {
	System.out.println("running no-arg constructor of setcookie");
}

@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cookieName="cookie-1";
		
		Cookie[] cookies=req.getCookies();
		
		resp.setContentType("text/plain");
		
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
			String cookieValue="1234";
			Cookie cookie=new Cookie(cookieName,cookieValue);
			cookie.setMaxAge(60);
			resp.addCookie(cookie);
			resp.getWriter().println("cookies successfully set..");
		}else {
			resp.getWriter().println("cookie already exists");
		}
	}
}
