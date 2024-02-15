package com.xworkz.copy;

class Bank{
	String name="Axis";
	String location="dvg";
}
public class DeepCopy {
public static void main(String[] args) {
	Bank b1=new Bank();
	Bank b2=new Bank();
	b2.name="ICIC";
	b2.location="Banglore";
	System.out.println("b1.name:"+b1.name);
	System.out.println("b1.location:"+b1.location);
}
}
