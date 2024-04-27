package com.xworkz.equalscontract.practise;

import java.util.HashMap;
import java.util.Map;

public class CompanyBikeMap {
	public static void main(String[] args) {

BikeDto bikeDto =new BikeDto("ktm-420", 2019, 30);
CompanyDto companyDto=new CompanyDto("ktm", "banglore", "mark");
BikeDto bikeDto1 =new BikeDto("honda-350", 2018, 30);
CompanyDto companyDto1=new CompanyDto("Honda", "banglore", "mark");
BikeDto bikeDto2 =new BikeDto("hero-240", 2019, 30);
CompanyDto companyDto2=new CompanyDto("hero", "banglore", "mark");

Map<CompanyDto, BikeDto> maps=new HashMap<CompanyDto, BikeDto>();
maps.put(companyDto, bikeDto);
maps.put(companyDto1, bikeDto1);
maps.put(companyDto2, bikeDto2);

maps.forEach((k,v)->System.out.println(k+" "+v));
}
}
