package com.xworkz.flightbookingapplication.runner;

import com.xworkz.flightbookingapplication.dto.FlightBookingDto;
import com.xworkz.flightbookingapplication.repository.FlightBookingRepository;
import com.xworkz.flightbookingapplication.repository.FlightBookingRepositoryImpl;

public class FlightBookingBegin {
public static void main(String[] args) {
	FlightBookingRepository flightBookingRepository=new FlightBookingRepositoryImpl();
	FlightBookingDto flightBookingDto=new FlightBookingDto("AirIndia", "banglore", "goa", 3000);
	flightBookingRepository.saveFlightBookingDetails(flightBookingDto);
}
}
