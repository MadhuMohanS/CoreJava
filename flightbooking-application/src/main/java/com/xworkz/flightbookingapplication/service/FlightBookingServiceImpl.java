package com.xworkz.flightbookingapplication.service;

import java.util.List;

import com.xworkz.flightbookingapplication.dto.FlightBookingDto;
import com.xworkz.flightbookingapplication.repository.FlightBookingRepository;
import com.xworkz.flightbookingapplication.repository.FlightBookingRepositoryImpl;

public class FlightBookingServiceImpl implements FlightBookingService{

	FlightBookingRepository flightBookingRepository=new FlightBookingRepositoryImpl();
//	FlightBookingService flightBookingService=new FlightBookingServiceImpl();
	@Override
	public void save(FlightBookingDto flight) {
		// TODO Auto-generated method stub
		if(flight.getFlightName().isEmpty()) {
			System.out.println("please enter valid flight name");
		}else {
			flightBookingRepository.saveFlightBookingDetails(flight);
		}
		
	}
	@Override
	public void saveAll(List<FlightBookingDto> flight) {
		boolean validBooking=true;
		for(FlightBookingDto booking:flight) {
			if(booking.getFlightName().isEmpty()) {
				System.out.println("please enter valid flight name");
				validBooking=false;
			}
		}
		if(!validBooking) {
			return;
		}
		flightBookingRepository.saveAll(flight);
		
	}
	@Override
	public void update(String flightName, String source, String destination) {
		// TODO Auto-generated method stub
		if(flightName==null || flightName.isEmpty()) {
			System.out.println("please enter valid flight Name");
		}else {
			flightBookingRepository.update(flightName, source, destination);
		}
		
	}
	@Override
	public void delete(String flightName) {
		// TODO Auto-generated method stub
		if(flightName==null || flightName.isEmpty()) {
			System.out.println("please enter valid flight Name");
		}else {
			flightBookingRepository.deleteByFlightName(flightName);
		}
		
	}
	@Override
	public FlightBookingDto findByName(String flightName) {
		// TODO Auto-generated method stub
		if(flightName==null) {
			System.out.println("please enter valid flight name");
		}else {
			FlightBookingDto booking=flightBookingRepository.findByName(flightName);
			return booking;
		}
		return null;
	}
	@Override
	public List<FlightBookingDto> findAll() {
		// TODO Auto-generated method stub
		List<FlightBookingDto> bookings=flightBookingRepository.findAll();
		return bookings;
	}

}
