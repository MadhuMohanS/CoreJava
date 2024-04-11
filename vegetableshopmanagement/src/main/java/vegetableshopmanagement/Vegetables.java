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
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("runnng service method of vegetables");
		double banCost=30;
		double appCost=20;
		double ornCost=25;
		double grpCost=35;
		int sum=0;
		String name=req.getParameter("name");
		resp.setContentType("text/plain");
		Map<String, Integer> maps=new HashMap<String, Integer>();
		Writer writer= resp.getWriter();
		String[] s=req.getParameterValues("check");
		
		List<String> items=new ArrayList<>();
		for(int i=0;i<s.length;i++) {
			items.add(s[i]);
		}
		String[] a=req.getParameterValues("select");
		
		List<String> kgs=new ArrayList<String>();
		for(int i=0;i<a.length;i++) {
			kgs.add(a[i]);
		}
		
				if (s != null && s.length != 0) {
		writer.write("You have selected the option is: ");
		for (int i = 0; i < s.length; i++) {
			maps.put(s[i], Integer.parseInt(a[i]));
	}
		}
				
				
//				maps.forEach((k,v)->{
//					try {
//						writer.write(k+" "+v);
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				});
				
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
            statement.setString(3, arrayToString(a));
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
//		req.setAttribute("app", apple);
//		req.setAttribute("ban", banana);
//		req.setAttribute("banq", banCon);
//		req.setAttribute("appq", appCon);
//		req.setAttribute("grp", grape);
//		req.setAttribute("grpq", grapCon);
//		req.setAttribute("orn", orange);
//		req.setAttribute("ornq", orangeCon);
		req.setAttribute("bill", sum);
		dispatcher.forward(req, resp);
//		writer.write("Bill is:"+sum);
		
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
