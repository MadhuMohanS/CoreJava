package com.xworkz.flightbookingapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
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

public FlightBookingDto() {
	// TODO Auto-generated constructor stub
	System.out.println("running no -arg constructor of flightbookingdto");
}

@Override
public String toString() {
	return "FlightBookingDto [id=" + id + ", flightName=" + flightName + ", source=" + source + ", destination="
			+ destination + ", price=" + price + "]";
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFlightName() {
	return flightName;
}

public void setFlightName(String flightName) {
	this.flightName = flightName;
}

public String getSource() {
	return source;
}

public void setSource(String source) {
	this.source = source;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}
}
