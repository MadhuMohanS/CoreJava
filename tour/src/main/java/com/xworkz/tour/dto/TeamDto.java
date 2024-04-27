package com.xworkz.tour.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="team")
@NamedQuery(name="updateCaptain",query="update TeamDto set captain =:captain where name=:teamName")
@NamedQuery(name="deleteQuery",query = "delete from TeamDto where name=:teamName")
@NamedQuery(name="totalnoofMatches",query="select sum(totalNoOfMatches) from TeamDto")
@NamedQuery(name="getnoofMatchesbw10and20",query = "select t from TeamDto t where totalNoOfMatches between 10 and 20")
@NamedQuery(name="minimumMatchPlayedQuery",query = "select min(totalNoOfMatches) from TeamDto")
@NamedQuery(name="categoryTypeCountQuery",query = "select count(t) from TeamDto t where catagoryType=:catagoryType")
public class TeamDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String country ;
private String captain;
@Column(name = "category_type")
private String catagoryType;
@Column(name="no_of_players")
private int totalNoOfPlayers;
@Column(name="no_of_matches")
private int totalNoOfMatches;

public void setTotalNoOfMatches(int totalNoOfMatches) {
	this.totalNoOfMatches=totalNoOfMatches;
}
public int getTotalNoOfMatches() {
	return totalNoOfMatches;
}
public void setTotalNoOfPlayers(int totalNoOfPlayers) {
	this.totalNoOfPlayers=totalNoOfPlayers;
}
public int getTotalNoOfPlayers() {
	return totalNoOfPlayers;
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
