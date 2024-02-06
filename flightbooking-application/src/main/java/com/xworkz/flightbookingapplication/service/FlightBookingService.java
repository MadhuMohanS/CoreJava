package com.xworkz.flightbookingapplication.service;

import java.util.List;

import com.xworkz.flightbookingapplication.dto.FlightBookingDto;

public interface FlightBookingService {
	void save(FlightBookingDto flight);
	void saveAll(List<FlightBookingDto> flight);
	void update(String flightName,String source,String destination);
	void delete(String flightName);
	public FlightBookingDto findByName(String flightName);
	public List<FlightBookingDto> findAll();
}
