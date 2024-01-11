package com.xworkz.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.lambda.comparator.EscalatorDto;
import com.xworkz.lambda.comparator.StreetDto;
//private String place;
//private int steps;
//private String direction;
//private String type;
public class EscalatorBegin {
public static void main(String[] args) {
	EscalatorDto escalatorDto=new EscalatorDto("banglore", 20, "up", "manual");
	EscalatorDto escalatorDto1=new EscalatorDto("davangere", 25, "down", "automatic");
	EscalatorDto escalatorDto2=new EscalatorDto("hubli", 30, "north", "manualorautomatic");
	EscalatorDto escalatorDto3=new EscalatorDto("udupi", 10, "south", "manual");
	EscalatorDto escalatorDto4=new EscalatorDto("shimoga", 15, "west", "automatic");
	
	List<EscalatorDto> list=new ArrayList<>();
	list.add(escalatorDto);
	list.add(escalatorDto1);
	list.add(escalatorDto2);
	list.add(escalatorDto3);
	list.add(escalatorDto4);
	
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(o1.getPlace().compareTo(o2.getPlace())));
	System.out.println("after sorting place in ascending order");
	for(EscalatorDto place:list) {
		System.out.println(place);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(o2.getPlace().compareTo(o1.getPlace())));
	System.out.println("after sorting place in descending order");
	for(EscalatorDto place:list) {
		System.out.println(place);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(Integer.compare(o1.getSteps(), o2.getSteps())));
	System.out.println("after sorting steps in ascending order");
	for(EscalatorDto steps:list) {
		System.out.println(steps);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(Integer.compare(o2.getSteps(), o1.getSteps())));
	System.out.println("after sorting steps in descending order");
	for(EscalatorDto steps:list) {
		System.out.println(steps);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(o1.getDirection().compareTo(o2.getDirection())));
	System.out.println("after sorting direction in ascending order");
	for(EscalatorDto direction:list) {
		System.out.println(direction);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(o2.getDirection().compareTo(o1.getDirection())));
	System.out.println("after sorting direction in descending order");
	for(EscalatorDto direction:list) {
		System.out.println(direction);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(o1.getType().compareTo(o2.getType())));
	System.out.println("after sorting type in ascending order");
	for(EscalatorDto type:list) {
		System.out.println(type);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(o2.getType().compareTo(o1.getType())));
	System.out.println("after sorting type in descending order");
	for(EscalatorDto type:list) {
		System.out.println(type);
	}
	
}
}
