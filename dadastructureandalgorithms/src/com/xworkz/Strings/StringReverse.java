package com.xworkz.Strings;

public class StringReverse {
public static void main(String[] args) {
//	StringBuilder sb=new StringBuilder("Hello World");
//	for(int i=0;i<sb.length()/2;i++) {
//		char front=sb.charAt(i);
//		char back=sb.charAt(sb.length()-1-i);
//		
//		sb.setCharAt(i, back);
//		sb.setCharAt(sb.length()-1-i, front);
//	}
//	System.out.println("the reverse of the String :"+sb);
	String str="Hello";
	for(int i=str.length()-1;i>=0;i--) {
		System.out.print(str.charAt(i));
	}
}
}
