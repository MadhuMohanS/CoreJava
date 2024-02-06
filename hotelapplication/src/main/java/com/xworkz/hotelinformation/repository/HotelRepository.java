package com.xworkz.hotelinformation.repository;

import java.util.List;

import com.xworkz.hotelinformation.dto.HotelDto;

public interface HotelRepository {
public void save(HotelDto hotel);
public void saveAll(List<HotelDto> hotelDto);
public void update(String name,String branch,String location);
public HotelDto findByName(String hotelName);
public List<HotelDto> finAll();
}
