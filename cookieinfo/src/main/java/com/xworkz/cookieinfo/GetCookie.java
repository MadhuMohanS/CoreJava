package com.xworkz.cookieinfo;

import java.io.IOException;
import java.net.CookieStore;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/getCookie",loadOnStartup = 1)
public class GetCookie extends HttpServlet{
public GetCookie() {
	System.out.println("running no-arg constructor of getCookie..");
}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies=req.getCookies();
		resp.setContentType("text/plain");
		
		if(cookies!=null) {
			for(Cookie cookie:cookies) {
				resp.getWriter().println(cookie.getName()+" "+cookie.getValue());
			}
		}else {
			resp.getWriter().println("no cookie found");
		}
	}
}
