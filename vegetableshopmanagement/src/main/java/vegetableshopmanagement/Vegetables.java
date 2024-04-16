package vegetableshopmanagement;


import java.io.IOException;
import java.io.Writer;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/calculate",loadOnStartup = 1)
public class Vegetables extends HttpServlet{
public Vegetables() {
	System.out.println("running no-arg constructor of vegetables");
}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("runnng service method of vegetables");
		double banCost=30;
		double appCost=20;
		double ornCost=25;
		double grpCost=35;
		double manCost=40;
		double pinCost=29;
		double pomCost=35;
		double papCost=22;
		double melonCost=22;
		double berryCost=50;
		int sum=0;
		String name=req.getParameter("name");
		
		Map<String, Integer> maps=new LinkedHashMap<>();
		
		String[] s=req.getParameterValues("check");
		
		List<String> items=new ArrayList<>();
		for(int i=0;i<s.length;i++) {
			items.add(s[i]);
		}
		List<Integer> kgs=new ArrayList<Integer>();
//		String[] a=req.getParameterValues("select");
		 java.util.Enumeration<String> parameterNames = req.getParameterNames();

	        // Iterate through parameter names
	        while (parameterNames.hasMoreElements()) {
	            String paramName = parameterNames.nextElement();
	            // Check if parameter name corresponds to a select tag
	            if (paramName.startsWith("select")) {
	                // Retrieve selected values for this select tag
	                String[] selectedValues = req.getParameterValues(paramName);
	                // Process selected values
	                if (selectedValues != null) {
	                    for (String value : selectedValues) {
	                    	if(!(value.equals("0"))) {
	                        // Do something with each selected value
	                    		kgs.add(Integer.parseInt(value));
	                        System.out.println("Selected value from " + paramName + ": " + value);
	                    	}
	                    }
	                } else {
	                    // Handle case when no values are selected for this select tag
	                    System.out.println("No values selected for " + paramName);
	                }
	            }
	        }
		
		

		
				if (s != null && s.length != 0) {
		System.out.println("You have selected the option is: ");
		for (int i = 0; i < s.length; i++) {
			maps.put(s[i], kgs.get(i));
	}
		}

				maps.forEach((k,v)->System.out.println(k+":"+v));
				
				for(Map.Entry<String, Integer> map:maps.entrySet()) {
					if(map.getKey().equals("Apple")) {
						sum+=appCost*map.getValue();
					}
					
					if(map.getKey().equals("Banana")) {
						sum+=banCost*map.getValue();
						
					}
					if(map.getKey().equals("Orange")) {
						sum+=ornCost*map.getValue();

					}
					if(map.getKey().equals("Grapes")) {
						sum+=grpCost*map.getValue();
					}
					if(map.getKey().equals("Mango")) {
						sum+=manCost*map.getValue();
					}
					if(map.getKey().equals("Pinapple")) {
						sum+=pinCost*map.getValue();
					}
					if(map.getKey().equals("Pomegranate")) {
						sum+=pomCost*map.getValue();
					}
					if(map.getKey().equals("Papaya")) {
						sum+=papCost*map.getValue();
					}
					if(map.getKey().equals("Watermelon")) {
						sum+=melonCost*map.getValue();
					}
					if(map.getKey().equals("Strawberry")) {
						sum+=berryCost*map.getValue();
					}
				}
				
//				writer.write("total bill is:"+sum);
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				String jdbcUrl="jdbc:mysql://localhost:3306/vegetableapplication";
				String userName="root";
				String password="Xworkzodc@123";
				String insertQuery="insert into customer_items_info(name,items_list,kgs_list,bill) values(?,?,?,?)";
				try {
				Connection connection=	DriverManager.getConnection(jdbcUrl,userName,password);
			PreparedStatement statement=	connection.prepareStatement(insertQuery);
		

			statement.setString(1, name);
            statement.setString(2, arrayToString(s));
//            statement.setString(3, arrayToString(a));
            statement.setInt(4, sum);

            // Execute the query
            statement.executeUpdate();

            System.out.println("Data inserted successfully.");
			
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
				
			        
	    
		
		
		
		

		
		RequestDispatcher dispatcher=req.getRequestDispatcher("FinalResult.jsp");
		req.setAttribute("nm", name);
		req.setAttribute("map", maps);
		req.setAttribute("bill", sum);
		dispatcher.forward(req, resp);

		
}
private static String arrayToString(String[] array) {
    if (array == null || array.length == 0) {
        return null;
    }
    StringBuilder sb = new StringBuilder();
    for (String element : array) {
    	if(!(element.equals("0"))) {
        sb.append(element).append(",");
    	}
    }
    // Remove the trailing comma
    sb.deleteCharAt(sb.length() - 1);
    return sb.toString();
}
}
