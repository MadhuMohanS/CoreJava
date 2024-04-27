package com.xworkz.amartailors;



import java.io.IOException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import javax.servlet.http.*;

@WebServlet(urlPatterns = "/sendEmail",loadOnStartup = 1)
public class ContactServlet extends HttpServlet {
	public ContactServlet() {
		System.out.println("running no arg constructor of contact servlet");
	}

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
         
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("inputEmail");
        String mobile = request.getParameter("mobile");
        String message = request.getParameter("textArea");
        
        Properties properties=new Properties();
		properties.put("mail.smtp.auth", true);
		properties.put("mail.smtp.starttls.enable", true);
		properties.put("mail.smtp.port","587");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		 String user="madhumohan17021999";
		String passWord="tsen wcjd kckw fhiu";
		 
		 Session session= Session.getInstance(properties,new Authenticator() {

				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					// TODO Auto-generated method stub
					return new PasswordAuthentication(user, passWord);
				}
			});
		 String to="madhumohan53227@gmail.com";
	    	String from=email;
	    	String subject="form data";
	    	String text=message;
		 
		 try {
				Message mimeMessage=new MimeMessage(session);
				mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
				mimeMessage.setFrom(new InternetAddress(from));
				mimeMessage.setSubject(subject);
				mimeMessage.setText("Name:"+firstName+" "+lastName+"\nEmail:"+email+"\nMobile:"+mobile+"\nMessage:"+text);
				Transport.send(mimeMessage);
				RequestDispatcher dispatcher=request.getRequestDispatcher("EmailSuccess.jsp");
				request.setAttribute("fn", firstName);
				request.setAttribute("ln", lastName);
				dispatcher.forward(request, response);
				 System.out.println("email sent successfully");
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("sorry their occured some problem");
				RequestDispatcher dispatcher=request.getRequestDispatcher("EmailFailure.jsp");
				request.setAttribute("fn", firstName);
				request.setAttribute("ln", lastName);
				dispatcher.forward(request, response);
			}
    }
}

