package com.xworkz.flightbookingapplication.repository;

import java.util.List;

import com.xworkz.flightbookingapplication.dto.FlightBookingDto;

public interface FlightBookingRepository {
public void saveFlightBookingDetails(FlightBookingDto booking);
public void saveAll(List<FlightBookingDto> booking);
public void update(String flightName,String source,String destination);
public void deleteByFlightName(String flightName);
}
