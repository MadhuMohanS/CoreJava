package com.stringpackage.objectintro;

public class Cotton {
int cost=20;
int quantity=100;
String place="up";

@Override
public String toString() {
	return "Cotton info[cost:20,quantity:100,place:up]";
}

@Override
public int hashCode() {
	return 300;
}
}
