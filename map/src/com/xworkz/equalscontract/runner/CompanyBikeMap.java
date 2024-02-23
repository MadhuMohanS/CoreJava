package com.xworkz.equalscontract.runner;

import java.util.HashMap;
import java.util.Map;

import com.xworkz.equalscontract.BikeDto;
import com.xworkz.equalscontract.CompanyDto;

public class CompanyBikeMap {
public static void main(String[] args) {
	CompanyDto companyDto=new CompanyDto("KTM", "banglore", "Stefan Pierer");
	BikeDto bikeDto=new BikeDto("duke", 2000, 30);
	CompanyDto companyDto1 = new CompanyDto("Honda", "Tokyo", "Takahiro Hachigo");
	BikeDto bikeDto1 = new BikeDto("CBR", 1500, 25);

	CompanyDto companyDto2 = new CompanyDto("Yamaha", "Osaka", "Yoshihiro Hidaka");
	BikeDto bikeDto2 = new BikeDto("YZF", 1800, 28);

	CompanyDto companyDto3 = new CompanyDto("Suzuki", "Hamamatsu", "Toshihiro Suzuki");
	BikeDto bikeDto3 = new BikeDto("GSX", 1700, 26);

	CompanyDto companyDto4 = new CompanyDto("Kawasaki", "Kobe", "Yoshitaka Kaneko");
	BikeDto bikeDto4 = new BikeDto("Ninja", 1900, 27);

	CompanyDto companyDto5 = new CompanyDto("Harley-Davidson", "Milwaukee", "Jochen Zeitz");
	BikeDto bikeDto5 = new BikeDto("Fat Boy", 2500, 35);
	
	CompanyDto companyDto6 = new CompanyDto("Triumph", "Hinckley", "Nick Bloor");
	BikeDto bikeDto6 = new BikeDto("Street Triple", 1600, 29);

	CompanyDto companyDto7 = new CompanyDto("Ducati", "Bologna", "Claudio Domenicali");
	BikeDto bikeDto7 = new BikeDto("Panigale", 2100, 33);

	CompanyDto companyDto8 = new CompanyDto("BMW Motorrad", "Munich", "Markus Schramm");
	BikeDto bikeDto8 = new BikeDto("S1000RR", 2200, 34);

	CompanyDto companyDto9 = new CompanyDto("Royal Enfield", "Chennai", "Vinod K Dasari");
	BikeDto bikeDto9 = new BikeDto("Classic 350", 1800, 31);
	
	Map<CompanyDto, BikeDto> companyBikeMap=new HashMap<>();
	companyBikeMap.put(companyDto, bikeDto);
	companyBikeMap.put(companyDto1, bikeDto1);
	companyBikeMap.put(companyDto2, bikeDto2);
	companyBikeMap.put(companyDto3, bikeDto3);
	companyBikeMap.put(companyDto4, bikeDto4);
	companyBikeMap.put(companyDto5, bikeDto5);
	companyBikeMap.put(companyDto6, bikeDto6);
	companyBikeMap.put(companyDto7, bikeDto7);
	companyBikeMap.put(companyDto8, bikeDto8);
	companyBikeMap.put(companyDto9, bikeDto9);

	CompanyDto companyDto10 = new CompanyDto("KTM", "Noale", "Massimo Rivola");
	BikeDto bikeDto10 = new BikeDto("RSV4", 2000, 32);
	
	companyBikeMap.put(companyDto10, bikeDto10);
	
	companyBikeMap.forEach((k,v)->System.out.println(k+" "+v));
}
}
