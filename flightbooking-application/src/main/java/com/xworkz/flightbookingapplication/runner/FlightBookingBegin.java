package com.xworkz.flightbookingapplication.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.flightbookingapplication.dto.FlightBookingDto;
import com.xworkz.flightbookingapplication.repository.FlightBookingRepository;
import com.xworkz.flightbookingapplication.repository.FlightBookingRepositoryImpl;
import com.xworkz.flightbookingapplication.service.FlightBookingService;
import com.xworkz.flightbookingapplication.service.FlightBookingServiceImpl;

public class FlightBookingBegin {
public static void main(String[] args) {
	FlightBookingRepository flightBookingRepository=new FlightBookingRepositoryImpl();
	
//	FlightBookingDto flightBookingDto=new FlightBookingDto("z", "banglore", "goa", 3000);
	
//	flightBookingRepository.saveFlightBookingDetails(flightBookingDto);
	FlightBookingService flightBookingService=new FlightBookingServiceImpl();
//	flightBookingService.save(flightBookingDto);
	
	List<FlightBookingDto> list=new ArrayList<>();
	FlightBookingDto flightBookingDto1=new FlightBookingDto("Indigo", "banglore", "delhi", 10000);
	FlightBookingDto flightBookingDto2=new FlightBookingDto("AirIndia", "banglore", "chennai", 7000);
//	list.add(flightBookingDto1);
//	list.add(flightBookingDto2);
//	flightBookingService.saveAll(list);
	
//	flightBookingRepository.update("AirIndia", "hyderabad", "nepal");
//	flightBookingRepository.deleteByFlightName("Indigo");
	
//	flightBookingRepository.findByName("z");
//FlightBookingDto booking=	flightBookingRepository.findByName("AirIndia");
//	if(booking==null) {
//		System.out.println("there are no flights");
//	}else {
//		System.out.println("Flight exist and flight name is:"+booking.getFlightName());
//		System.out.println("source is:"+booking.getSource());
//		System.out.println("destination is:"+booking.getDestination());
//		System.out.println("price is:"+booking.getPrice());
//	}
	
	List<FlightBookingDto> bookings=flightBookingService.findAll();
	bookings.forEach(bookings1->{
		System.out.println("flight booking details");
		System.out.println(bookings1.getFlightName());
		System.out.println(bookings1.getSource());
		System.out.println(bookings1.getDestination());
		System.out.println(bookings1.getPrice());
	});
	
	
}
}
