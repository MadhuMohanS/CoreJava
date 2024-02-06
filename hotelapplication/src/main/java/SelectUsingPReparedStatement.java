import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectUsingPReparedStatement {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String jdbcUrl="jdbc:mysql://localhost:3306/hotelapplication";
	String userName="root";
	String password="Xworkzodc@123";
	
	String selectQuery="select * from hotel";
	
	try {
		Connection connection= DriverManager.getConnection(jdbcUrl,userName,password);
	PreparedStatement preparedStatement=connection.prepareStatement(selectQuery);
	ResultSet resultSet=preparedStatement.executeQuery();
	while(resultSet.next()) {
		System.out.println(resultSet.getString("h_name"));
		System.out.println(resultSet.getString("branch"));
		System.out.println(resultSet.getString("location"));
		System.out.println(resultSet.getString("manager"));
	}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
