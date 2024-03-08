package com.xworkz.exceptionpractise;

class AgeInvalidException extends Exception{
public AgeInvalidException(String str) {
	super(str);
}

}
public class CustomException {
	public static void validate(int age) throws AgeInvalidException {
		if(age<18) {
			throw new AgeInvalidException("age is not valid");
		}else {
			System.out.println("welcome to vote");
		}
	}
public static void main(String[] args) {
  try {
	validate(20);
} catch (AgeInvalidException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
