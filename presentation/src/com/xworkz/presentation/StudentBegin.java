package com.xworkz.presentation;

import java.util.function.Predicate;

interface Subject{
	void study(int i);
}
public class StudentBegin {
public static void main(String[] args) {
	Predicate<String> predicate=(t)->t.length()>5;
	
	
boolean value=predicate.test("stud");
System.out.println(value);
	
}
}
