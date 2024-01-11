package com.xworkz.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.lambda.comparator.StreetDto;
//private int streetNo;
//private String place;
//private String name;
//private int length;
public class StreetBegin {
public static void main(String[] args) {
	StreetDto streetDto=new StreetDto(111, "banglore", "mg road", 300);
	StreetDto streetDto1=new StreetDto(121, "davangere", "pb road", 200);
	StreetDto streetDto2=new StreetDto(311, "hubli", "hubli road", 1000);
	StreetDto streetDto3=new StreetDto(211, "shimoga", "bypass road", 400);
	StreetDto streetDto4=new StreetDto(11, "mysore", "mysore road", 3500);
	
	List<StreetDto> list=new ArrayList<>();
	list.add(streetDto);
	list.add(streetDto1);
	list.add(streetDto2);
	list.add(streetDto3);
	list.add(streetDto4);
	
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(Integer.compare(o1.getStreetNo(), o2.getStreetNo())));
	System.out.println("after sorting streetno in ascending order");
	for(StreetDto streetno:list) {
		System.out.println(streetno);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(Integer.compare(o2.getStreetNo(), o1.getStreetNo())));
	System.out.println("after sorting streetno in descending order");
	for(StreetDto streetno:list) {
		System.out.println(streetno);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(o1.getPlace().compareTo(o2.getPlace())));
	System.out.println("after sorting place in ascending order");
	for(StreetDto place:list) {
		System.out.println(place);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(o2.getPlace().compareTo(o1.getPlace())));
	System.out.println("after sorting place in descending order");
	for(StreetDto place:list) {
		System.out.println(place);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(o1.getName().compareTo(o2.getName())));
	System.out.println("after sorting name in ascending order");
	for(StreetDto name:list) {
		System.out.println(name);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(o2.getName().compareTo(o1.getName())));
	System.out.println("after sorting name in descending order");
	for(StreetDto name:list) {
		System.out.println(name);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(Integer.compare(o1.getLength(), o2.getLength())));
	System.out.println("after sorting length in ascending order");
	for(StreetDto length:list) {
		System.out.println(length);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(Integer.compare(o2.getLength(), o1.getLength())));
	System.out.println("after sorting length in descending order");
	for(StreetDto length:list) {
		System.out.println(length);
	}
}
}
