package com.xworkz.clothsorting;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/ProductServlet",loadOnStartup = 1)
public class ProductServlet extends HttpServlet{
public ProductServlet() {
	System.out.println("running no-arg constructor of Product servlet");
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String jdbcUrl="jdbc:mysql://localhost:3306/sort";
		String userName="root";
		String passWord="Xworkzodc@123";
		String selectQuery="select * from cloth_info";
		List<Integer> products=new ArrayList<Integer>();
		try {
		Connection connection=	DriverManager.getConnection(jdbcUrl,userName,passWord);
		PreparedStatement preparedStatement= connection.prepareStatement(selectQuery);
	ResultSet resultSet=	preparedStatement.executeQuery();
	while(resultSet.next()) {
		int cost=resultSet.getInt("cost");
		products.add(cost);
	}
//	products.forEach(x->System.out.println(x));
		preparedStatement.execute();
		System.out.println("data inserted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception while inserting data:"+e);
			e.printStackTrace();
		}
		 String sortBy = req.getParameter("sort");
	        
	        // Sort products based on sortBy parameter
	        if (sortBy != null) {
	            switch (sortBy) {
	                case "popularity":
	                    // Implement popularity sorting logic (if applicable)
	                    break;
	                case "low_to_high":
	                    Collections.sort(products, new Comparator<Integer>() {
	                        @Override
	                        public int compare(Integer p1, Integer p2) {
	                            return Double.compare(p1, p2);
	                        }
	                    });
	                    break;
	                case "high_to_low":
	                    Collections.sort(products, new Comparator<Integer>() {
	                        @Override
	                        public int compare(Integer p1, Integer p2) {
	                            return Double.compare(p2, p1);
	                        }
	                    });
	                    break;
	                default:
	                    // Default sorting logic (if needed)
	                    break;
	            }
	        }
	        products.forEach(s->System.out.println(s));
	}
}
