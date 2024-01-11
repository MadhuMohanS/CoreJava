package com.xworkz.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.lambda.comparator.LiftDto;
import com.xworkz.lambda.comparator.ThermometerDto;

//private int temperature;
//private int celcius;
//private String fever;
//private String type;
public class ThermometerBegin {
public static void main(String[] args) {
	ThermometerDto thermometerDto=new ThermometerDto(30, 10, "dengue", "type1");
	ThermometerDto thermometerDto1=new ThermometerDto(20, 15, "malaria", "type2");
	ThermometerDto thermometerDto2=new ThermometerDto(40, 30, "h1n1", "type3");
	ThermometerDto thermometerDto3=new ThermometerDto(35, 20, "chickengunia", "type5");
	ThermometerDto thermometerDto4=new ThermometerDto(32, 50, "nimonia", "type4");
	
	List<ThermometerDto> list=new ArrayList<>();
	list.add(thermometerDto);
	list.add(thermometerDto1);
	list.add(thermometerDto2);
	list.add(thermometerDto3);
	list.add(thermometerDto4);
	
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(Integer.compare(o1.getTemperature(), o2.getTemperature())));
	System.out.println("after sorting temperature in ascending order");
	for(ThermometerDto temperature:list) {
		System.out.println(temperature);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(Integer.compare(o2.getTemperature(), o1.getTemperature())));
	System.out.println("after sorting temperature in descending order");
	for(ThermometerDto temperature:list) {
		System.out.println(temperature);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(Integer.compare(o1.getCelcius(), o2.getCelcius())));
	System.out.println("after sorting celisius in ascending order");
	for(ThermometerDto celisius:list) {
		System.out.println(celisius);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(Integer.compare(o2.getCelcius(), o1.getCelcius())));
	System.out.println("after sorting celisius in descending order");
	for(ThermometerDto celisius:list) {
		System.out.println(celisius);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(o1.getFever().compareTo(o2.getFever())));
	System.out.println("after sorting fever in ascending order");
	for(ThermometerDto fever:list) {
		System.out.println(fever);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(o2.getFever().compareTo(o1.getFever())));
	System.out.println("after sorting fever in descending order");
	for(ThermometerDto fever:list) {
		System.out.println(fever);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(o1.getType().compareTo(o2.getType())));
	System.out.println("after sorting type in ascending order");
	for(ThermometerDto type:list) {
		System.out.println(type);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(o2.getType().compareTo(o1.getType())));
	System.out.println("after sorting type in descending order");
	for(ThermometerDto type:list) {
		System.out.println(type);
	}
}
}
