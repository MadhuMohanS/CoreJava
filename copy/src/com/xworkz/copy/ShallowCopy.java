package com.xworkz.copy;

class Bank{
	String name="Axis";
	String location="dvg";
}
public class ShallowCopy {
public static void main(String[] args) {
	Bank b1=new Bank();
	Bank b2=b1;
	
	b2.location="banglore";
	b2.name="ICIC";
	System.out.println("b1.name:"+b1.name);
	System.out.println("b1.location:"+b1.location);
}
}
