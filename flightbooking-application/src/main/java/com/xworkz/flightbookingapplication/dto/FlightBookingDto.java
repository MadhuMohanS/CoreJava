package com.xworkz.flightbookingapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter

@NoArgsConstructor
public class FlightBookingDto {
private int id;
private String flightName;
private String source;
private String destination;
private int price;

public FlightBookingDto(String flightName,String source,String destination,int price) {
	this.source=source;
	this.destination=destination;
	this.flightName=flightName;
	this.price=price;
}
}
