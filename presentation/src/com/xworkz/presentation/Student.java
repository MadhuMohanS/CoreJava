package com.xworkz.presentation;

public class Student {
String name;
static int age=20;
public Student(String name) {
	this.name=name;
}
public void sleep() {
	System.out.println("running sleep in student");
	bunk();
	study();
	System.out.println(age);
	System.out.println(name);
}
public void bunk() {
	System.out.println("running bunk in student");
}
public static void study() {
	int hrs=20;
	System.out.println("hrs:"+hrs);
	System.out.println("running study in Student");
	Student stu=new Student("bdc");
	stu.bunk();
}
public static void main(String[] args) {
	Student stu=new Student("abc");
	System.out.println("name:"+stu.name);
	System.out.println("age:"+Student.age);
	System.out.println(stu.age);
	stu.study();
}
}
