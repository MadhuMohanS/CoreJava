package com.mypackage;

public class FridgeBegin {
public static void main(String args[]) {
	Fridge fridge=new Fridge();
	Fridge fridge1=new Fridge(15000);
	Fridge fridge2=new Fridge(20000,2,"Samsung");
	
	fridge.open();
	fridge.close();
	fridge.freeze();
}
}
