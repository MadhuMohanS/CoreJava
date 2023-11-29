package com.stringpackage.objectintro;

public class Locker {

	int cost=30;
	String type="iron";
	int noOfKeys=2;
	
	@Override
	public String toString() {
		return "Locker info:[cost:30,type:iron,noOfKeys:2]";
	}
	
	@Override
	public int hashCode() {
		return 200;
	}

}
