package com.xworkz.hotelinformation.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.hotelinformation.dto.HotelDto;
import com.xworkz.hotelinformation.repository.HotelRepository;
import com.xworkz.hotelinformation.repository.HotelRepositoryImpl;
import com.xworkz.hotelinformation.service.HotelService;
import com.xworkz.hotelinformation.service.HotelServiceImpl;

public class HotelBegin {
public static void main(String[] args) {
	HotelRepository hotelRepository=new HotelRepositoryImpl();
	HotelService hotelService=new HotelServiceImpl();
	List<HotelDto> list=new ArrayList<>();
//	HotelDto hotelDto=new HotelDto("ambur", "btm", "banglore", "vignesh");
//	hotelRepository.save(hotelDto);
//	hotelService.save(hotelDto);
//	HotelDto hotelDto1=new HotelDto("empire", "btm", "banglore", "vignesh");
//	HotelDto hotelDto2=new HotelDto("ambur star", "btm", "banglore", "vignesh");
//	list.add(hotelDto1);
//	list.add(hotelDto2);
////	hotelRepository.saveAll(list);
//	hotelService.saveAll(list);
	
//	hotelRepository.update("empire", "banashankari", "davangere");
//	hotelService.update("udupi", "vidyanagar", "udupi");
//HotelDto hotel=hotelService.findByName("udupi");
//if(hotel==null) {
//	System.out.println("there are no hotels");
//}else {
//	System.out.println("hotel name:"+hotel.getName());
//	System.out.println("hotel branch:"+hotel.getBranch());
//	System.out.println("hotel location:"+hotel.getLocation());
//	System.out.println("hotel manager:"+hotel.getManager());
//}
	
	

//List<HotelDto> hotelDtos=hotelService.findAll();
//hotelDtos.forEach(hotel1->{
//	System.out.println("hotel name:"+hotel1.getName());
//	System.out.println("hotel branch:"+hotel1.getBranch());
//	System.out.println("hotel location:"+hotel1.getLocation());
//	System.out.println("hotel manager:"+hotel1.getManager());
//});
	
	List<HotelDto> hotelDto=hotelService.findAll();
	hotelDto.forEach(hotel1->{
		System.out.println("name is:"+hotel1.getName());
		System.out.println("branch is:"+hotel1.getBranch());
		System.out.println("location is:"+hotel1.getLocation());
		System.out.println("manager is:"+hotel1.getManager());
	});
	
}
}
