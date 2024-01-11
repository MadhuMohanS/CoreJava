package com.xworkz.sorting.comparatorprograms.sparkplug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SparkPlugBegin {
public static void main(String[] args) {
	SparkPlugDto sparkPlugDto=new SparkPlugDto("copper plug", 120, "terminal type", "5cm");
	SparkPlugDto sparkPlugDto1=new SparkPlugDto("silver plug", 130, "gap type", "7cm");
	SparkPlugDto sparkPlugDto2=new SparkPlugDto("ngk plug", 150, "sealing type", "5.5cm");
	SparkPlugDto sparkPlugDto3=new SparkPlugDto("denso plug", 120.5, "size type", "8cm");
	SparkPlugDto sparkPlugDto4=new SparkPlugDto("iridium plug", 135, "hexa type", "5.7cm");
	
	
	List<SparkPlugDto> list=new ArrayList<>();
	list.add(sparkPlugDto);
	list.add(sparkPlugDto1);
	list.add(sparkPlugDto2);
	list.add(sparkPlugDto3);
	list.add(sparkPlugDto4);
	
	for(SparkPlugDto ref:list) {
		System.out.println(ref);
	}
	
	System.out.println("=========================================");
	
	Comparator<SparkPlugDto> nameAsc=new SparkPlugComparator();
	Collections.sort(list,nameAsc);
	System.out.println("after sorting name in ascending order");
	for(SparkPlugDto name:list) {
		System.out.println(name);
	}
System.out.println("=========================================");
	
	Comparator<SparkPlugDto> nameDesc=new SparkPlugComparatorNameDesc();
	Collections.sort(list,nameDesc);
	System.out.println("after sorting name in descending order");
	for(SparkPlugDto name:list) {
		System.out.println(name);
	}
	System.out.println("=========================================");
	Comparator<SparkPlugDto> heatAsc=new HeatRangeAsc();
	Collections.sort(list,heatAsc);
	System.out.println("after sorting heat in asscending order");
	for(SparkPlugDto heat:list) {
		System.out.println(heat);
	}
	
	System.out.println("=========================================");
	Comparator<SparkPlugDto> heatDesc=new HeatRangeDesc();
	Collections.sort(list,heatDesc);
	System.out.println("after sorting heat in Descending order");
	for(SparkPlugDto heat:list) {
		System.out.println(heat);
	}
	
	System.out.println("=========================================");
	Comparator<SparkPlugDto> TypeAsc=new TypeAsc();
	Collections.sort(list,TypeAsc);
	System.out.println("after sorting type in asscending order");
	for(SparkPlugDto type:list) {
		System.out.println(type);
	}
	
	System.out.println("=========================================");
	Comparator<SparkPlugDto> TypeDesc=new TypeDesc();
	Collections.sort(list,TypeDesc);
	System.out.println("after sorting type in Descending order");
	for(SparkPlugDto type:list) {
		System.out.println(type);
	}
	
	System.out.println("=========================================");
	Comparator<SparkPlugDto> sizeAsc=new SizeAsc();
	Collections.sort(list,sizeAsc);
	System.out.println("after sorting size in asscending order");
	for(SparkPlugDto size:list) {
		System.out.println(size);
	}
	
	System.out.println("=========================================");
	Comparator<SparkPlugDto> sizeDesc=new SizeDesc();
	Collections.sort(list,sizeDesc);
	System.out.println("after sorting size in Descending order");
	for(SparkPlugDto size:list) {
		System.out.println(size);
	}
	
}
}
