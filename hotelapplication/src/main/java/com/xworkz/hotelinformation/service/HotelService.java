package com.xworkz.hotelinformation.service;

import java.util.List;

import com.xworkz.hotelinformation.dto.HotelDto;

public interface HotelService {
public void save(HotelDto hotelDto);
public void saveAll(List<HotelDto> hotelDtos);
public void update(String name,String branch,String location);
public HotelDto findByName(String hotelName);
public List<HotelDto> findAll();
}
