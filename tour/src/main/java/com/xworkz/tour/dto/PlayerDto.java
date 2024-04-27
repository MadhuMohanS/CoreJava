package com.xworkz.tour.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class PlayerDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	@Column(name="first_name")
private String firstName;
	@Column(name="last_name")
private String lastName;
	@Column(name="jersey_no")
private int jerseyNo;
	@Column(name="team_id")
private int teamId;
	public PlayerDto() {
		System.out.println("running no-arg constructor of player dto");
	}
	public PlayerDto(String firstName, String lastName, int jerseyNo, int teamId) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.jerseyNo = jerseyNo;
		this.teamId = teamId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
}
