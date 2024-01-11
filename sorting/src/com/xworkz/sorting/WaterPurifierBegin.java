package com.xworkz.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.xworkz.sorting.comparatorprograms.PurifierCapacityAsc;
import com.xworkz.sorting.comparatorprograms.PurifierCapacityDesc;
import com.xworkz.sorting.comparatorprograms.PurifierNameAsc;
import com.xworkz.sorting.comparatorprograms.PurifierNameDesc;
import com.xworkz.sorting.comparatorprograms.PurifierOwnerAsc;
import com.xworkz.sorting.comparatorprograms.PurifierOwnerDesc;
import com.xworkz.sorting.comparatorprograms.PurifierTypeAsc;
import com.xworkz.sorting.comparatorprograms.PurifierTypeDesc;
import com.xworkz.sorting.comparatorprograms.WaterPurifierDto;

public class WaterPurifierBegin {
public static void main(String[] args) {
	WaterPurifierDto waterPurifier=new WaterPurifierDto("kent", "ro", 5.5, "Mahesh Guptha");
	WaterPurifierDto waterPurifier1=new WaterPurifierDto("prestige", "uv", 6.5, "Irfan");
	WaterPurifierDto waterPurifier2=new WaterPurifierDto("butterfly", "ro+uv", 7.0, "Lakshmi narayannan");
	WaterPurifierDto waterPurifier3=new WaterPurifierDto("whirlpool", "ro", 4, "March");
	WaterPurifierDto waterPurifier4=new WaterPurifierDto("samsung", "uv", 8, "Lee");
	
	List<WaterPurifierDto> list=new ArrayList<>();
	list.add(waterPurifier);
	list.add(waterPurifier1);
	list.add(waterPurifier2);
	list.add(waterPurifier3);
	list.add(waterPurifier4);
	
	for(WaterPurifierDto ref:list) {
		System.out.println(ref);
	}
	System.out.println("=========================================");
	
	Comparator<WaterPurifierDto> comparatorOwnerAsc=new PurifierOwnerAsc();
	Collections.sort(list,comparatorOwnerAsc);
	System.out.println("after sorting owner in asc");
	for(WaterPurifierDto ref:list) {
		System.out.println(ref);
	}
	System.out.println("===========================================");
	Comparator<WaterPurifierDto> comparatorOwnerDesc=new PurifierOwnerDesc();
	Collections.sort(list,comparatorOwnerDesc);
	System.out.println("after sorting owner in desc");
	for(WaterPurifierDto ref:list) {
		System.out.println(ref);
	}
	System.out.println("==================================================");
	Comparator<WaterPurifierDto> comparatorNameAsc=new PurifierNameAsc();
	Collections.sort(list,comparatorNameAsc);
	System.out.println("after sorting name in asc");
	for(WaterPurifierDto ref:list) {
		System.out.println(ref);
	}
	System.out.println("===========================================");
	Comparator<WaterPurifierDto> comparatorNameDesc=new PurifierNameDesc();
	Collections.sort(list,comparatorNameDesc);
	System.out.println("after sorting name in desc");
	for(WaterPurifierDto ref:list) {
		System.out.println(ref);
	}
	
	System.out.println("==================================================");
	Comparator<WaterPurifierDto> comparatorTypeAsc=new PurifierTypeAsc();
	Collections.sort(list,comparatorTypeAsc);
	System.out.println("after sorting type in asc");
	for(WaterPurifierDto ref:list) {
		System.out.println(ref);
	}
	System.out.println("===========================================");
	Comparator<WaterPurifierDto> comparatorTypeDesc=new PurifierTypeDesc();
	Collections.sort(list,comparatorTypeDesc);
	System.out.println("after sorting type in desc");
	for(WaterPurifierDto ref:list) {
		System.out.println(ref);
	}
	System.out.println("==================================================");
	Comparator<WaterPurifierDto> comparatorCapacityAsc=new PurifierCapacityAsc();
	Collections.sort(list,comparatorCapacityAsc);
	System.out.println("after sorting capacity in asc");
	for(WaterPurifierDto ref:list) {
		System.out.println(ref);
	}
	System.out.println("===========================================");
	Comparator<WaterPurifierDto> comparatorCapacityDesc=new PurifierCapacityDesc();
	Collections.sort(list,comparatorCapacityDesc);
	System.out.println("after sorting capacity in desc");
	for(WaterPurifierDto ref:list) {
		System.out.println(ref);
	}
	
	
}
}
