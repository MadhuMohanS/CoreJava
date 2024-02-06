package com.xworkz.Strings;

import java.util.Scanner;

public class ChangeLetterInString {
public static void main(String[] args) {
	String result="";
	Scanner sc=new Scanner(System.in);
	String original=sc.next();
	for(int i=0;i<original.length();i++) {
		if(original.charAt(i)=='e') {
			result=result+'i';
		}else {
			result+=original.charAt(i);
		}
	}
	System.out.println(result);
}
}
