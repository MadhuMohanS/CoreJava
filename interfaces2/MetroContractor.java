package com.xworkz.classroom.interfaces2;

public class MetroContractor extends Contractor implements GarbageRule{
	@Override
	public void loc() {
		System.out.println("running loc in MetroContractor");
	}
	@Override
	public void weight() {
		System.out.println("running weight in MetroContractor");
	}

}
