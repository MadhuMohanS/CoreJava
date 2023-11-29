package com.stringpackage.objectintro;

public class Lens {
int size=30;
String type="contact";
double cost=400;

@Override
public String toString() {
	return "Lens info:[size:30,type:contact,cost:400]";
}

@Override
public int hashCode() {
	return 100;
}
}
