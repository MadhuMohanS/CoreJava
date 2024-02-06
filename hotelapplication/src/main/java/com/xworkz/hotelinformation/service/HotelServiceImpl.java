package com.xworkz.hotelinformation.service;

import java.util.List;

import com.xworkz.hotelinformation.dto.HotelDto;
import com.xworkz.hotelinformation.repository.HotelRepository;
import com.xworkz.hotelinformation.repository.HotelRepositoryImpl;

public class HotelServiceImpl implements HotelService{

	HotelRepository hotelRepository=new HotelRepositoryImpl();
	@Override
	public void save(HotelDto hotelDto) {
		// TODO Auto-generated method stub
		
		if(hotelDto.getName().isEmpty()) {
			System.out.println("please enter valid name");
		}else {
			hotelRepository.save(hotelDto);
		}
		
	}

	@Override
	public void saveAll(List<HotelDto> hotelDto) {
		// TODO Auto-generated method stub
		boolean valid=true;
		for(HotelDto hotel:hotelDto) {
			if(hotel.getName().isEmpty()) {
				System.out.println("please enter valid name");
				valid=false;
			}
		}
		if(!valid) {
			return;
		}
		hotelRepository.saveAll(hotelDto);
		
	}

	@Override
	public void update(String name, String branch, String location) {
		// TODO Auto-generated method stub
		if(name==null || name.isEmpty()) {
			System.out.println("please enter valid name");
		}else {
			hotelRepository.update(name, branch, location);
		}
		
	}

//	@Override
//	public HotelDto findByName(String hotelName) {
//		// TODO Auto-generated method stub
//		if(hotelName==null) {
//			System.out.println("please enter valid name");
//		}else {
//		HotelDto hotel=hotelRepository.findByName(hotelName);
//		return hotel;
//		}
//		return null;
//	}

//	@Override
//	public List<HotelDto> findAll() {
//		// TODO Auto-generated method stub
//		List<HotelDto> list=hotelRepository.findAll();
//		return list;
//	}

@Override
public HotelDto findByName(String hotelName) {
	// TODO Auto-generated method stub
	if(hotelName==null) {
		System.out.println("please provide valid hotel name");
	}else {
	HotelDto hotelDto=	hotelRepository.findByName(hotelName);
	return hotelDto;
	}
	return null;
}

@Override
public List<HotelDto> findAll() {
	// TODO Auto-generated method stub
	List<HotelDto> hotelDtos=hotelRepository.finAll();
	return hotelDtos;
}

}
