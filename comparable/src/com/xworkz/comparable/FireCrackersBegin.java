package com.xworkz.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.sorting.FireCrackerDto;

public class FireCrackersBegin {
public static void main(String[] args) {
	FireCrackerDto fireCrackerDto=new FireCrackerDto("rocket", 150, 5, "super");
	FireCrackerDto fireCrackerDto1=new FireCrackerDto("lakshmi", 100, 5, "star");
	FireCrackerDto fireCrackerDto2=new FireCrackerDto("snake", 50, 20, "super");
	FireCrackerDto fireCrackerDto3=new FireCrackerDto("smoke", 170, 45, "bosche");
	FireCrackerDto fireCrackerDto4=new FireCrackerDto("green bomb", 150, 5, "super");
	
	List<FireCrackerDto> list=new ArrayList<>();
	list.add(fireCrackerDto);
	list.add(fireCrackerDto1);
	list.add(fireCrackerDto2);
	list.add(fireCrackerDto3);
	list.add(fireCrackerDto4);
	
	Collections.sort(list);
	for(FireCrackerDto ref:list) {
		System.out.println(ref);
	}
}
}
