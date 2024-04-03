package com.xworkz.exception.programs;

public class TryMultiCatch {
public static void main(String[] args) {
	try {
		int[] a=new int[5];
		a[6]=30/5;
	}catch(ArithmeticException | IndexOutOfBoundsException e) {
		System.out.println("arithmeticexception or indexoutofboundexception");
		System.out.println(e.getMessage());
		System.out.println(e);
	}
}
}
