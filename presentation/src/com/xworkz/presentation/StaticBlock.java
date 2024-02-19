package com.xworkz.presentation;


public class StaticBlock {
//public StaticBlock() {
//	System.out.println("running no argument constructor of staticblock");
//}
static {
	System.out.println("running static block");
}
public static void main(String[] args) {
	StaticBlock s=new StaticBlock();
	System.out.println("running main in Staticblock");
}
}
