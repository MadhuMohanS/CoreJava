package com.xworkz.amartailors;

import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.*;

public class GEmailSender {
	public boolean sendEmail(String to,String from,String subject,String text) {
		boolean flag=false;
		Properties properties=new Properties();
		properties.put("mail.smtp.auth", true);
		properties.put("mail.smtp.starttls.enable", true);
		properties.put("mail.smtp.port","587");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		 final String user="madhumohan17021999";
		 final String passWord="tsen wcjd kckw fhiu";
		
		
		Session session= Session.getInstance(properties,new Authenticator() {
			

			

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(user, passWord);
			}
		});
		
		try {
			Message message=new MimeMessage(session);
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setFrom(new InternetAddress(from));
			message.setSubject(subject);
			message.setText(text);
			Transport.send(message);
			flag=true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}
}
