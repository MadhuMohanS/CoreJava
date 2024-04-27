package secondline;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="bottle",urlPatterns = "/bottle",loadOnStartup = 1)
public class Bottle extends HttpServlet{
public Bottle() {
	System.out.println("no-arg constructor of bottle...");
}

@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service method ....");
		System.out.println(req.getLocalAddr());
		String firstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		String age=req.getParameter("age");
		String height=req.getParameter("height");
		
		resp.setContentType("text/plain");
		PrintWriter writer=resp.getWriter();
		writer.write("this is the response of bottle");
		System.out.println(firstName+lastName+age+height);
		writer.print("application under processing....");
		
	}
}
