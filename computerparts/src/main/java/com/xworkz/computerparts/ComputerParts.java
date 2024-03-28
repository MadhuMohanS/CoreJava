package com.xworkz.computerparts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/computer",loadOnStartup = 1)
public class ComputerParts extends HttpServlet{
public ComputerParts() {
	System.out.println("running no-arg constructor of ComputerParts");
}

@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running computerParts service....");
		
		String brand= req.getParameter("brandName");
		String model=req.getParameter("model");
		String type=req.getParameter("typeName");
		String ram=req.getParameter("ram");
		String disk=req.getParameter("ram");
		String processor=req.getParameter("processor");
		String cost=req.getParameter("cost");
		String quantity=req.getParameter("quantity");
		
		System.out.println(brand+model+type+ram+disk+processor+cost+quantity);
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.write("this is the response of service");
		System.out.println(brand+model+type+ram+disk+processor+cost+quantity);
		
		long longCost=Long.parseLong(cost);
		double doubleQuantity=Double.parseDouble(quantity);
		
		writer.write("<html><head><title></title><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">"
				+ "</head>");
		writer.write("<body class=\"bg-primary\">\r\n"
				+ "<nav class=\"navbar navbar-expand-lg navbar-light bg-primary\">\r\n"
				+ "  <div class=\"container-fluid\">\r\n"
				+ "    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "      <span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "    </button>\r\n"
				+ "    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
				+ "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\r\n"
				+ "        </li>\r\n"
				+ "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link\" href=\"computer.html\">ComputerParts</a>\r\n"
				+ "        </li>\r\n"
				+ "      </ul>\r\n"
				+ "      \r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "</nav>"
                +"<div class=\"container mb-5 mt-5\">\n" +
                "    <div class=\"container\">\n" +
                "        <h1 class=\"text-white\">Total cost of the Computer Part's is: "+doubleQuantity*longCost+" </h1>\n" +
                " <h2 class=\"text-white\"></h2>   </div>\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>");
		
		
	}
}
