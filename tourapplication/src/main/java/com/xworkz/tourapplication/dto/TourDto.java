package com.xworkz.tourapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TourDto {
private int id;
private String fromPlace;
private String toPlace;
private double cost;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFromPlace() {
	return fromPlace;
}
public void setFromPlace(String fromPlace) {
	this.fromPlace = fromPlace;
}
public String getToPlace() {
	return toPlace;
}
public void setToPlace(String toPlace) {
	this.toPlace = toPlace;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "TourDto [id=" + id + ", fromPlace=" + fromPlace + ", toPlace=" + toPlace + ", cost=" + cost + "]";
}
public TourDto(int id, String fromPlace, String toPlace, double cost) {
	super();
	this.id = id;
	this.fromPlace = fromPlace;
	this.toPlace = toPlace;
	this.cost = cost;
}

public TourDto() {
	System.out.println("running no-arg constructor of tourdto");
}
}
