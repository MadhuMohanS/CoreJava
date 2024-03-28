package com.xworkz.iplinfo;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/ipl",loadOnStartup = 1)
public class IplInfo extends HttpServlet{
public IplInfo() {
	System.out.println("running no-arg constructor of iplinfo");
}

@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service method in iplInfo");
		 String cookieName="IPL_COOKIE";

			
			
			
			String cookieValue=UUID.randomUUID().toString();
			String newValue= cookieValue.substring(0, 20);			
			Cookie cookie=new Cookie(cookieName,newValue);
			cookie.setMaxAge(60);
			resp.addCookie(cookie);
		
		String teamA=req.getParameter("teamA");
		String teamB=req.getParameter("teamB");
		String captainA=req.getParameter("ACaptain");
		String captainB=req.getParameter("BCaptain");
		String match=req.getParameter("match");
		String city=req.getParameter("city");
		String pincode=req.getParameter("pincode");
		String area=req.getParameter("area");
		String stadium=req.getParameter("stadium");
		String matchNo=req.getParameter("matchNo");
		String batsmenA=req.getParameter("batsmenA");
		String batsmenB=req.getParameter("batsmenB");
		String bowlersA=req.getParameter("bowlersA");
		String bowlersB=req.getParameter("bowlersB");
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("IplResult.jsp");
		req.setAttribute("tmA", teamA);
		req.setAttribute("tmB", teamB);
		req.setAttribute("cpA", captainA);
		req.setAttribute("cpB", captainB);
		req.setAttribute("mtch", match);
		req.setAttribute("cty", city);
		req.setAttribute("pin", pincode);
		req.setAttribute("are", area);
		req.setAttribute("sta", stadium);
		req.setAttribute("mtchno", matchNo);
		req.setAttribute("btA", batsmenA);
		req.setAttribute("btB", batsmenB);
		req.setAttribute("bwA", bowlersA);
		req.setAttribute("bwB", bowlersB);
		
		dispatcher.forward(req, resp);
		
       
		
	}
}
