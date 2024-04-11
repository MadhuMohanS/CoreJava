package com.xworkz.customersinfo;

import java.io.Serializable;

public class CustomerDto implements Serializable,Comparable<CustomerDto>{
private String name;
private String[] items;
private double bill;
public String getName(){
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String[] getItems() {
	return items;
}
public void setItems(String[] items) {
	this.items = items;
}
public double getBill() {
	return bill;
}
public void setBill(double bill) {
	this.bill = bill;
}
public CustomerDto(String name, String[] items, double bill) {
	super();
	this.name = name;
	this.items = items;
	this.bill = bill;
}
public int compareTo(CustomerDto o1) {
	return o1.getName().compareTo(getName());
}
public CustomerDto() {
	System.out.println("running no-arg constructor of customerDto");
}

}
