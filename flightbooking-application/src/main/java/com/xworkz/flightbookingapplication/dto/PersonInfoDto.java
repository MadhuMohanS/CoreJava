package com.xworkz.flightbookingapplication.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PersonInfoDto {
private int id;
private String name;
private int totalWeight;
private int seatNo;

public PersonInfoDto(String name,int totalWeight,int seatNo) {
	this.name=name;
	this.totalWeight=totalWeight;
	this.seatNo=seatNo;
}
}
