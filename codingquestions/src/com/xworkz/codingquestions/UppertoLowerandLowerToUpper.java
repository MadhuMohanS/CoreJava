package com.xworkz.codingquestions;

public class UppertoLowerandLowerToUpper {
public static void main(String[] args) {
	String string="jaVaT";
	StringBuffer result=new StringBuffer("");
	
	for(int i=0;i<string.length();i++) {
		char ch=string.charAt(i);
		if(ch>='A' && ch<='Z') {
			result.append((char)(ch+32));
		}else if(ch>='a' && ch<='z') {
			result.append((char)(ch-32));
		}else {
			result.append(ch);
		}
	}
	String ans=result.toString();
	
	System.out.println(ans);
}
}
