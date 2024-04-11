package vegetableshopmanagement;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/mostsold",loadOnStartup = 1)
public class MostSoldServlet extends HttpServlet{
	
	public MostSoldServlet() {
		System.out.println("running no-arg constructor of mostsoldservlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println(findall());
		List<String> items= findall();
		List<String> convItems=new ArrayList<String>();
		List<String> finalList=new ArrayList<String>();
		for(String str:items) {
			convItems= Arrays.asList(str.split(","));
			for(String ref:convItems) {
				finalList.add(ref);
			}
		}
		
//		finalList.forEach(l->System.out.println(l));
		int max_count=0;
		String maxFreq="";
		for(int i=0;i<finalList.size();i++) {
			int count=0;
			for(int j=0;j<finalList.size();j++) {
				if(finalList.get(i).equals(finalList.get(j))) {
					count++;
				}
			}
			if(count>max_count) {
				max_count=count;
				maxFreq=finalList.get(i);
			}
		}
//		System.out.println("most sold item is:"+maxFreq);
		RequestDispatcher dispatcher=req.getRequestDispatcher("MostSoldJsp.jsp");
		req.setAttribute("maxFreq", maxFreq);
		dispatcher.forward(req, resp);
		
		
	}
	public static List<String> findall(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcUrl="jdbc:mysql://localhost:3306/vegetableapplication";
		String userName="root";
		String password="Xworkzodc@123";
		String insertQuery="select * from customer_items_info";
		List<String> items=new ArrayList<String>();
		try {
			Connection con=DriverManager.getConnection(jdbcUrl,userName,password);
			PreparedStatement preparedStatement=con.prepareStatement(insertQuery);
		ResultSet resultSet=	preparedStatement.executeQuery();
		while(resultSet.next()) {
			String ele=resultSet.getString("items_list");
			items.add(ele);
		}
		
//		items.forEach(t->System.out.println(t));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return items;
	}
	

}
