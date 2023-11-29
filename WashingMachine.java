package com.Xworkz;
import com.mypackage.*;
public class WashingMachine extends Fridge{
	Fridge fridge=new Fridge(15000);
	
	@Override
	public void open() {
		System.out.println("running override open method of fridge in Washing machine");
		super.freeze();
		freeze();
	}
	@Override
	protected void freeze() {
		System.out.println("running override freeze method of fridge in Washing machine");
	}
}
