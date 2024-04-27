package com.xworkz.mappractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class CompanyBikeMap {
	public static void main(String[] args) {

		BikeDto bikeDto=new BikeDto("ktm-420", 2019, 30);
		CompanyDto companyDto=new CompanyDto("ktm", "banglore", "mark");
		BikeDto bikeDto1=new BikeDto("ktm-360", 2019, 30);
		CompanyDto companyDto1=new CompanyDto("Honda", "banglore", "mark");
		BikeDto bikeDto2=new BikeDto("ktm-150", 2019, 30);
		CompanyDto companyDto2=new CompanyDto("hero", "banglore", "mark");

		Map<CompanyDto, BikeDto> maps=new HashMap<CompanyDto, BikeDto>();
		maps.put(companyDto, bikeDto);
		maps.put(companyDto1, bikeDto1);
		maps.put(companyDto2, bikeDto2);

		
		BikeDto bikeDto3=new BikeDto("ktm-900", 2020, 34);
		CompanyDto companyDto3=new CompanyDto("ktm", "Davangere", "berg");
		BikeDto bikeDto4=new BikeDto("suzuki-900", 2020, 34);
		CompanyDto companyDto4=new CompanyDto("suzuki", "Davangere", "berg");
		maps.put(companyDto3, bikeDto3);
		
//		maps.forEach((k,v)->System.out.println(k+" "+v));
		Iterator<Map.Entry<CompanyDto,BikeDto >> itr=maps.entrySet().iterator();
		
//		while(itr.hasNext()) {
//		String key=	itr.next().getKey().getcName();
//		if(key.equals("Honda")) {
//			itr.remove();
//		}
//		}
		
		System.out.println("after deleting");
		for(Map.Entry<CompanyDto, BikeDto> ref:maps.entrySet()) {
			System.out.println(ref);
		}
		
		System.out.println("print elements which compnay name contains 't'");
		for(Map.Entry<CompanyDto, BikeDto> ref:maps.entrySet()) {
			String key= ref.getKey().getcName();
			if(key.contains("t")) {
				System.out.println(itr.next());
			}
			
		}
		
		System.out.println("printing elements which  modelno is greater than 2019");
		
		for(Map.Entry<CompanyDto, BikeDto> map:maps.entrySet()) {
			int model=map.getValue().getModelNo();
			if(model>2019) {
				System.out.println(map);
			}
		}
		
		for(Map.Entry<CompanyDto, BikeDto> map:maps.entrySet()) {
			if(map.getKey().getcName().equals("Honda")) {
				maps.put(companyDto4, bikeDto4);
			}
		}
		System.out.println("after adding.....");
		
		maps.forEach((k,v)->System.out.println(k+":"+v));
		}
}
