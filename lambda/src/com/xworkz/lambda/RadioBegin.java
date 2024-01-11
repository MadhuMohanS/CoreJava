package com.xworkz.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.lambda.comparator.RadioDto;
//private String name;
//private double point;
//private int invented;
//private String country;
public class RadioBegin {
public static void main(String[] args) {
	RadioDto radioDto=new RadioDto("club", 99.9, 1999, "india");
	RadioDto radioDto1=new RadioDto("fever", 98.9, 1998, "newzealand");
	RadioDto radioDto2=new RadioDto("red", 95.9, 1899, "switzerland");
	RadioDto radioDto3=new RadioDto("All", 96.9, 1997, "pakistan");
	RadioDto radioDto4=new RadioDto("listen", 93.9, 1979, "england");
	
	List<RadioDto> list=new ArrayList<>();
	list.add(radioDto);
	list.add(radioDto1);
	list.add(radioDto2);
	list.add(radioDto3);
	list.add(radioDto4);
	
	System.out.println("========================================");
	System.out.println("after sorting name in ascending order");
	Collections.sort(list,(o1,o2)->(o1.getName().compareTo(o2.getName())));
	for(RadioDto name:list) {
		System.out.println(name);
	}
	System.out.println("========================================");
	System.out.println("after sorting name in descending order");
	Collections.sort(list,(o1,o2)->(o2.getName().compareTo(o1.getName())));
	for(RadioDto name:list) {
		System.out.println(name);
	}
	System.out.println("========================================");
	System.out.println("after sorting point in ascending order");
	Collections.sort(list,(o1,o2)->(Double.compare(o1.getPoint(), o2.getPoint())));
	for(RadioDto point:list) {
		System.out.println(point);
	}
	System.out.println("========================================");
	System.out.println("after sorting point in descending order");
	Collections.sort(list,(o1,o2)->(Double.compare(o2.getPoint(), o1.getPoint())));
	for(RadioDto point:list) {
		System.out.println(point);
	}
	
	System.out.println("========================================");
	System.out.println("after sorting invented in ascending order");
	Collections.sort(list,(o1,o2)->(Integer.compare(o1.getInvented(), o2.getInvented())));
	for(RadioDto invented:list) {
		System.out.println(invented);
	}
	System.out.println("========================================");
	System.out.println("after sorting invented in descending order");
	Collections.sort(list,(o1,o2)->(Integer.compare(o2.getInvented(), o1.getInvented())));
	for(RadioDto invented:list) {
		System.out.println(invented);
	}
	System.out.println("========================================");
	System.out.println("after sorting country in ascending order");
	Collections.sort(list,(o1,o2)->(o1.getCountry().compareTo(o2.getCountry())));
	for(RadioDto country:list) {
		System.out.println(country);
	}
	System.out.println("========================================");
	System.out.println("after sorting country in descending order");
	Collections.sort(list,(o1,o2)->(o2.getCountry().compareTo(o1.getCountry())));
	for(RadioDto country:list) {
		System.out.println(country);
	}
}
}
