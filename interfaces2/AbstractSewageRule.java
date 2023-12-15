package com.xworkz.classroom.interfaces2;

public abstract class AbstractSewageRule implements SewageRule{
	
	@Override
	public void clean() {
		System.out.println("running clean in AbstractSewageRule");
	}
	@Override
	public void regularCheckup() {
		System.out.println("running regularCheckup in AbstractSewageRule");
	}
	

}
