package com.xworkz.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.sorting.ToyDto;

public class ToyBegin {
public static void main(String[] args) {
	ToyDto toyDto=new ToyDto("plastic", "barbie", 2, 120);
	ToyDto toyDto1=new ToyDto("fabric", "water gun", 3, 300);
	ToyDto toyDto2=new ToyDto("mud", "teddy", 7, 200);
	ToyDto toyDto3=new ToyDto("fiber", "train", 1, 150);
	ToyDto toyDto4=new ToyDto("fabric", "barbie", 9, 90);
	
	List<ToyDto> list=new ArrayList<>();
	list.add(toyDto);
	list.add(toyDto1);
	list.add(toyDto2);
	list.add(toyDto3);
	list.add(toyDto4);
	
	Collections.sort(list);
	for(ToyDto ref:list) {
		System.out.println(ref);
	}
}
}
