package com.xworkz.degreeinfo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/market",loadOnStartup = 1)
public class MarketInfo extends HttpServlet{
public MarketInfo() {
	System.out.println("running no-arg constructor of marketInfo");
}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service method in marketinfo.....");
		
		String name=req.getParameter("name");
		String location=req.getParameter("location");
		String city=req.getParameter("city");
		String pincode=req.getParameter("pincode");
		String area=req.getParameter("area");
		String type=req.getParameter("type");
		String stallno=req.getParameter("stall");
		String item=req.getParameter("itemName");
		String quality=req.getParameter("itemQuality");
		String quantity=req.getParameter("itemQuantity");
		String cost=req.getParameter("itemCost");
		String owner=req.getParameter("stallOwner");
		String keb=req.getParameter("keb");
		String gst=req.getParameter("gst");
		String transaction=req.getParameter("transaction");
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("MarketResult1.jsp");
		req.setAttribute("nm", name);
		req.setAttribute("loc", location);
		req.setAttribute("cit", city);
		req.setAttribute("pin", pincode);
		req.setAttribute("are", area);
		req.setAttribute("typ", type);
		req.setAttribute("stall", stallno);
		req.setAttribute("ite", item);
		req.setAttribute("qual", quality);
		req.setAttribute("quan", quantity);
		req.setAttribute("cos", cost);
		req.setAttribute("own", owner);
		req.setAttribute("ke", keb);
		req.setAttribute("gs", gst);
		req.setAttribute("trans", transaction);
		
		dispatcher.forward(req, resp);
		
	}
}
