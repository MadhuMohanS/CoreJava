package com.xworkz.arrays;

import java.util.Scanner;

//import javax.xml.stream.events.Namespace;

public class ArrayNames {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the string");
	int size=sc.nextInt();
	String[] name=new String[size];
	System.out.println("enter the names");
	for(int i=0;i<name.length;i++) {
		name[i]=sc.next();
	}
	System.out.println("the names are:");
	for(int i=0;i<name.length;i++) {
		System.out.println(name[i]);
	}
}
}
