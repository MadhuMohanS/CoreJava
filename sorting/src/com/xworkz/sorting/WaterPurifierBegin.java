package com.xworkz.sorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.sorting.comparatorprograms.WaterPurifier;

public class WaterPurifierBegin {
public static void main(String[] args) {
	WaterPurifier waterPurifier=new WaterPurifier("Kent", "ro", 5.5, "Mahesh Guptha");
	WaterPurifier waterPurifier1=new WaterPurifier("prestige", "uv", 6.5, "irfan");
	WaterPurifier waterPurifier2=new WaterPurifier("butterfly", "ro+uv", 7.0, "Lakshmi narayannan");
	WaterPurifier waterPurifier3=new WaterPurifier("whirlpool", "ro", 4, "March");
	WaterPurifier waterPurifier4=new WaterPurifier("samsung", "Uv", 8, "Lee");
	
	List<WaterPurifier> list=new ArrayList<>();
	list.add(waterPurifier);
	list.add(waterPurifier1);
	list.add(waterPurifier2);
	list.add(waterPurifier3);
	list.add(waterPurifier4);
	
	for(WaterPurifier ref:list) {
		System.out.println(ref);
	}
}
}
