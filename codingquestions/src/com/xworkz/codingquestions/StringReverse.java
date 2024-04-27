package com.xworkz.codingquestions;

public class StringReverse {
public static void main(String[] args) {
	String string="hi hello";
	
	for(int i=string.length()-1;i>=0;i--) {
		System.out.print(string.charAt(i));
	}
}
}
