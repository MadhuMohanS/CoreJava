package com.xworkz.hotelinformation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class HotelDto {
private int id;
private String name;
private String branch;
private String location;
private String manager;

public HotelDto(String name,String branch,String location,String manager) {
	this.name=name;
	this.branch=branch;
	this.location=location;
	this.manager=manager;
}
}
