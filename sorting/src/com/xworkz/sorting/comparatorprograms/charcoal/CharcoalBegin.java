package com.xworkz.sorting.comparatorprograms.charcoal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CharcoalBegin {
public static void main(String[] args) {
	List<CharCoalDto> list=new ArrayList<>();
	CharCoalDto charCoalDto=new CharCoalDto(25, 30, 40, 50);
	CharCoalDto charCoalDto1=new CharCoalDto(30, 35, 45, 55);
	CharCoalDto charCoalDto2=new CharCoalDto(15, 10, 10, 35);
	CharCoalDto charCoalDto3=new CharCoalDto(3, 33.3, 40.8, 50.45);
	CharCoalDto charCoalDto4=new CharCoalDto(45.2, 19.7, 46.9, 20);
	
	list.add(charCoalDto);
	list.add(charCoalDto1);
	list.add(charCoalDto2);
	list.add(charCoalDto3);
	
	list.add(charCoalDto4);
	
	for(CharCoalDto ref:list) {
		System.out.println(ref);
	}
	
	System.out.println("================================================");
	
	Comparator<CharCoalDto> carbonAsc=new CharCoalComparator();
	Collections.sort(list,carbonAsc);
	System.out.println("after sorting in carbon in ascending order");
	for(CharCoalDto carbon:list) {
		System.out.println(carbon);
	}
	
	Comparator<CharCoalDto> carbonDesc=new CarbonDesc();
	Collections.sort(list,carbonDesc);
	System.out.println("after sorting in carbon in descending order");
	for(CharCoalDto carbon:list) {
		System.out.println(carbon);
	}
System.out.println("================================================");
	
	Comparator<CharCoalDto> densityAsc=new DensityAsc();
	Collections.sort(list,densityAsc);
	System.out.println("after sorting in density in ascending order");
	for(CharCoalDto density:list) {
		System.out.println(density);
	}
	
	Comparator<CharCoalDto> densityDesc=new DensityAsc();
	Collections.sort(list,densityDesc);
	System.out.println("after sorting in density in descending order");
	for(CharCoalDto density:list) {
		System.out.println(density);
	}
	
System.out.println("================================================");
	
	Comparator<CharCoalDto> moistureAsc=new MoistureAsc();
	Collections.sort(list,moistureAsc);
	System.out.println("after sorting in moisture in ascending order");
	for(CharCoalDto moisture:list) {
		System.out.println(moisture);
	}
	System.out.println("================================================");
	
	Comparator<CharCoalDto> moistureDesc=new MoistureDesc();
	Collections.sort(list,moistureDesc);
	System.out.println("after sorting in moisture in descending order");
	for(CharCoalDto moisture:list) {
		System.out.println(moisture);
	}
System.out.println("================================================");
	
	Comparator<CharCoalDto> ashAsc=new AshAsc();
	Collections.sort(list,ashAsc);
	System.out.println("after sorting in ash in ascending order");
	for(CharCoalDto ash:list) {
		System.out.println(ash);
	}
System.out.println("================================================");
	
	Comparator<CharCoalDto> ashDesc=new AshDesc();
	Collections.sort(list,ashDesc);
	System.out.println("after sorting in ash in descending order");
	for(CharCoalDto ash:list) {
		System.out.println(ash);
	}
	
}
}
