package checkcookie;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/details",loadOnStartup = 1)
public class Details extends HttpServlet{
public Details() {
	System.out.println("running no-arg constructor of details");
}

@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in details");
		
		
		String cookieName="Xworkz";
		Cookie[] cookies=req.getCookies();
		boolean exists=false;
		
		if(cookies!=null) {
			for(Cookie cookie:cookies) {
				if(cookie.getName().equals(cookieName)) {
					exists=true;
					break;
				}
			}
		}
		
		if(!exists) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("Error.jsp");
			dispatcher.forward(req, resp);
		}else {
			
			
//			String cookieValue="123456";
//			Cookie cookie=new Cookie(cookieName, cookieValue);
//			cookie.setMaxAge(60);
//			resp.addCookie(cookie);
			String email=req.getParameter("email");
			String mobile=req.getParameter("mobile");
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("FinalResult.jsp");
			
			req.setAttribute("mob", mobile);
			req.setAttribute("em", email);
			dispatcher.forward(req, resp);
		}
		
		
		
		
		
		
	}
}
