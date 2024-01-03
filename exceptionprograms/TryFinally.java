package com.xworkz.exception.programs;

public class TryFinally {
public static void main(String[] args) {
	try {
		int[] a=new int[5];
		a[6]=30/5;
//		System.out.println("hi hello");
	}finally {
		System.out.println("finally block is executed even if an unexpected event occur");
	}
}
}
