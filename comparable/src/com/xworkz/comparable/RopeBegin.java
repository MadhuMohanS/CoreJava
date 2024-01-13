package com.xworkz.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.sorting.RopeDto;

public class RopeBegin {
public static void main(String[] args) {
	RopeDto ropeDto=new RopeDto(20, "red", 5, "thread");
	RopeDto ropeDto1=new RopeDto(15, "black", 6, "cloth");
	RopeDto ropeDto2=new RopeDto(25, "orange", 2, "plastic");
	RopeDto ropeDto3=new RopeDto(30, "yellow", 1, "poyster");
	RopeDto ropeDto4=new RopeDto(10, "white", 9, "thread");
	
	List<RopeDto> list=new ArrayList<>();
	list.add(ropeDto);	
	list.add(ropeDto1);	
	list.add(ropeDto2);	
	list.add(ropeDto3);	
	list.add(ropeDto4);
	
	Collections.sort(list);
	
	for(RopeDto ref:list) {
		System.out.println(ref);
	}
}
}
