package com.xworkz.exception.programs;



class NegativeRadiusException extends Exception{
	@Override
	public String toString() {
		return "radius cannot be negative";
	}
}
public class ExceptionPractise {

	public static double area(double r) throws NegativeRadiusException{
		if(r<0) {
			throw new NegativeRadiusException();
		}else {
			return 3.14*r*r;
		}
	}
	
	public static void main(String[] args) {
		 try {
			area(-3);
		} catch (NegativeRadiusException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
