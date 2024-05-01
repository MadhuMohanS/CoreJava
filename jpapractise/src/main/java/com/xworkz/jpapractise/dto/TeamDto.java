package com.xworkz.jpapractise.dto;

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
private String country;
public TeamDto() {
	System.out.println("running no-arg constructor of TeamDto");
}
public TeamDto(String name, String country, String categoryType, String captain) {
	super();
	this.name = name;
	this.country = country;
	this.categoryType = categoryType;
	this.captain = captain;
}
@Column(name="category_type")
private String categoryType;
private String captain;
@Column(name="no_of_players")
public int noOfPlayers;
@Column(name="no_of_matches")
public int noOfMatches;
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
public String getCategoryType() {
	return categoryType;
}
public void setCategoryType(String categoryType) {
	this.categoryType = categoryType;
}
public String getCaptain() {
	return captain;
}
public void setCaptain(String captain) {
	this.captain = captain;
}
public int getNoOfPlayers() {
	return noOfPlayers;
}
public void setNoOfPlayers(int noOfPlayers) {
	this.noOfPlayers = noOfPlayers;
}
public int getNoOfMatches() {
	return noOfMatches;
}
public void setNoOfMatches(int noOfMatches) {
	this.noOfMatches = noOfMatches;
}
 
}
