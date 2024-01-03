package com.xworkz.exception.programs;

public class TryMultipleCatch {
public static void main(String[] args) {
	try {
		int[] a=new int[5];
		a[3]=30/0;
//		System.out.println("hi hello");
	}catch(ArithmeticException e) {
		System.out.println("arithmetic exception");
		System.out.println(e.getMessage());
	}
	catch(IndexOutOfBoundsException e) {
		System.out.println("indexoutofbound exception");
		System.out.println(e.getMessage());
	}
	System.out.println("exception is not ecountered");
}
}
