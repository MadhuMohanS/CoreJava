package com.xworkz.tour.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="team")
public class TeamDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String country ;
private String captain;
@Column(name = "category_type")
private String catagoryType;
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
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getCaptain() {
	return captain;
}
public void setCaptain(String captain) {
	this.captain = captain;
}
public String getCatagoryType() {
	return catagoryType;
}
public void setCatagoryType(String catagoryType) {
	this.catagoryType = catagoryType;
}
public TeamDto(int id, String name, String country, String captain, String catagoryType) {
	super();
	this.id = id;
	this.name = name;
	this.country = country;
	this.captain = captain;
	this.catagoryType = catagoryType;
}
public TeamDto() {
	System.out.println("running no-arg constructor of teamdto");
}
}
