package com.xworkz.tourapplication.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.tourapplication.dto.TourDto;
import com.xworkz.tourapplication.repository.TourRepository;
import com.xworkz.tourapplication.repository.TourRepositoryImpl;

public class TourBegin {
public static void main(String[] args) {
	TourRepository tourRepository=new TourRepositoryImpl();
//	TourDto tourDto=new TourDto(1,"davangere","banglore", 300);
//	tourRepository.save(tourDto);
	
//	TourDto tourDto1=new TourDto(2,"davangere","hubli", 250);
//	TourDto tourDto2=new TourDto(3,"chennai","banglore", 500);
//	List<TourDto> list=new ArrayList<TourDto>();
//	list.add(tourDto1);
//	list.add(tourDto2);
//	
//	tourRepository.saveAll(list);
	
//	tourRepository.update(3,1000);
//	tourRepository.deleteByCost(1000);
	
	TourDto tourDto= tourRepository.findByCost(300);
	System.out.println("id:"+tourDto.getId());
	System.out.println("from:"+tourDto.getFromPlace());
	System.out.println("to:"+tourDto.getToPlace());
	System.out.println("cost:"+tourDto.getCost());
	
	
	
	
}
}
