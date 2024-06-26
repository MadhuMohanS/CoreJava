package com.xworkz.exception.programs;

class NegativeRadiusException extends Exception{
	@Override
	public String toString(){
		return "Radius cannot be negative";
	}
	
	@Override
	public String getMessage() {
		return "Radius cannnot be negative";
	}
}

public class ThrowAndThrows {

	public static double area(int r) throws NegativeRadiusException{
		if(r<0) {
			throw new NegativeRadiusException();
		}
		double result=Math.PI*r*r;
		return result;
	}
public static int divide(int a,int b){
	int result=a/b;
	return result;
}
public static void main(String[] args) {
	try {
	divide(10, 10);
	}catch(ArithmeticException e) {
		System.out.println(e);
	}
	try {
		area(-3);
	}catch(NegativeRadiusException e) {
		System.out.println(e);
	}
}
}
