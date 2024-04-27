package com.xworkz.sendingemail2;

public class App {
public static void main(String[] args) {
	GEmailSender gEmailSender=new GEmailSender();
	String to="madhumohan53227@gmail.com";
	String from="madhumohan17021999@gmail.com";
	String subject="sending email using gmail";
	String text="sending email using gmail and javamail api";
	boolean b= gEmailSender.sendEmail(to, from, subject, text);
	if(b) {
		System.out.println("email sent successsfuly");
	}else {
		System.out.println("their occurred some problem");
	}
}
}
