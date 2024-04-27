package com.xworkz.clothsorting;

import java.io.Serializable;

public class ClothDto implements Serializable{
private int id;
private String name;
private int cost;
public ClothDto() {
	System.out.println("running no arg constructor of clothdto");
}
@Override
public String toString() {
	return "ClothDto [id=" + id + ", name=" + name + ", cost=" + cost + "]";
}
public ClothDto(int id, String name, int cost) {
	super();
	this.id = id;
	this.name = name;
	this.cost = cost;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
}
