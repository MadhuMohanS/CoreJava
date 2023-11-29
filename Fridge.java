package com.mypackage;

public class Fridge {
	
	protected Fridge(){
		System.out.println("running no-arg constructor of fridge");
	}
	
	public Fridge(double cost) {
		System.out.println("running single parameter constructor of Fridge");
		System.out.println("cost:"+cost);
	}
    
	private Fridge(double cost,int doors) {
		System.out.println("running double parameter constructor of Fridge");
		System.out.println("cost:"+cost);
		System.out.println("doors:"+doors);
	}
	
	Fridge(double cost,int doors,String company) {
		this(cost,doors);
		System.out.println("running triple parameter constructor of Fridge");
		System.out.println("cost:"+cost);
		System.out.println("doors:"+doors);
		System.out.println("company:"+company);
	}
	
	public void open() {
		System.out.println("running public open in Fridge");
		store();
	}
	
	void close() {
		System.out.println("running package-default close in Fridge");
	}
	
	protected void freeze() {
		System.out.println("running protected freeze in Fridge");
	}
	
	private void store() {
		System.out.println("running private store in Fridge");
	}

}
