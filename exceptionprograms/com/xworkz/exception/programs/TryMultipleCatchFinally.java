package com.xworkz.exception.programs;

public class TryMultipleCatchFinally {
public static void main(String[] args) {
	try {
		int[] a=new int[5];
		a[6]=30/5;
	}catch(ArithmeticException e) {
		System.out.println("arithmetic exception");
		System.out.println(e.getMessage());
	}
	catch(IndexOutOfBoundsException e) {
		System.out.println("indexoutofbound exception");
		System.out.println(e.getMessage());
	}finally {
		System.out.println("finally block is executed even if an unexpected event occur");
	}
}
}
