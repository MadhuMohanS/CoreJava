package com.xworkz.exception.programs;

public class TryMultiCatchFinally {
public static void main(String[] args) {
	try {
		int[] a=new int[5];
		a[5]=30/0;
	}catch(ArithmeticException | IndexOutOfBoundsException e) {
		System.out.println("arithmeticexception or indexoutofboundexception");
		System.out.println(e.getMessage());
		System.out.println(e);
	}finally {
		System.out.println("finally block is executed even if an unexpected event occur");
	}
}
}
