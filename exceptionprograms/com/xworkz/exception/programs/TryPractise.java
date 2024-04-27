package com.xworkz.exception.programs;



public class TryPractise {
	public static void main(String[] args) {
		try {
			int[] a=new int[5];
			a[7]=30/6;
		}catch (ArithmeticException e) {
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
