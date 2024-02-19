package com.xworkz.presentation;

public class AccessModifier {
	int age;
	String name;
	protected int gender;

	public void demo() {
		System.out.println("running demo in access");
	}

	public AccessModifier() {

	}

	private AccessModifier(int age) {
		this.age = age;
		this.demo();
	}

	protected AccessModifier(int age, String name) {
		this(age);
		this.age = age;
	}

	
	protected void study() {
		System.out.println("running study in Accessmodifier");
	}
}
