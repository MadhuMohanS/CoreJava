package com.stringpackage.objectintro;

public class StringClassMethods {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="hello     ";
		char[] mystr1= {'w','o','r','l','d'};
		String mystr="";
		mystr=mystr.copyValueOf(mystr1, 0, 5);
		System.out.println(s1.charAt(2));
		System.out.println(s2.codePointAt(0));
		System.out.println(s1.codePointBefore(1));
	    System.out.println(s1.compareTo(s2));
	    System.out.println(s1.compareTo(s2));
	    System.out.println(s1.concat(s2));
	    System.out.println(s1.contains("Hell"));
	    System.out.println(s1.contentEquals("Hello"));
	    System.out.println(mystr);
	    System.out.println(s1.equals(s2));
	    System.out.println(s1.equalsIgnoreCase(s2));
	    System.out.println(s1.indexOf("l"));
	    System.out.println(s1.isEmpty());
	    System.out.println(s1.toUpperCase());
	    System.out.println(s1.toLowerCase());
	    System.out.println(s2.trim());
	    System.out.println(s1.startsWith("H"));
	    System.out.println(s1.endsWith("o"));
	    System.out.println(s1.replace('e', 'b'));
	}

}
