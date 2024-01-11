package com.xworkz.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.lambda.comparator.LiftDto;

public class LiftBegin {
	public static void main(String[] args) {
		LiftDto liftDto=new LiftDto("banglore", 20, "up", "manual");
		LiftDto liftDto1=new LiftDto("davangere", 25, "down", "automatic");
		LiftDto liftDto2=new LiftDto("hubli", 30, "north", "manualorautomatic");
		LiftDto liftDto3=new LiftDto("udupi", 10, "south", "manual");
		LiftDto liftDto4=new LiftDto("shimoga", 15, "west", "automatic");
		
		List<LiftDto> list=new ArrayList<>();
		list.add(liftDto);
		list.add(liftDto1);
		list.add(liftDto2);
		list.add(liftDto3);
		list.add(liftDto4);
		
		System.out.println("=========================================================");
		Collections.sort(list,(o1,o2)->(o1.getPlace().compareTo(o2.getPlace())));
		System.out.println("after sorting place in ascending order");
		for(LiftDto place:list) {
			System.out.println(place);
		}
		System.out.println("=========================================================");
		Collections.sort(list,(o1,o2)->(o2.getPlace().compareTo(o1.getPlace())));
		System.out.println("after sorting place in descending order");
		for(LiftDto place:list) {
			System.out.println(place);
		}
		System.out.println("=========================================================");
		Collections.sort(list,(o1,o2)->(Integer.compare(o1.getSteps(), o2.getSteps())));
		System.out.println("after sorting steps in ascending order");
		for(LiftDto steps:list) {
			System.out.println(steps);
		}
		System.out.println("=========================================================");
		Collections.sort(list,(o1,o2)->(Integer.compare(o2.getSteps(), o1.getSteps())));
		System.out.println("after sorting steps in descending order");
		for(LiftDto steps:list) {
			System.out.println(steps);
		}
		System.out.println("=========================================================");
		Collections.sort(list,(o1,o2)->(o1.getDirection().compareTo(o2.getDirection())));
		System.out.println("after sorting direction in ascending order");
		for(LiftDto direction:list) {
			System.out.println(direction);
		}
		System.out.println("=========================================================");
		Collections.sort(list,(o1,o2)->(o2.getDirection().compareTo(o1.getDirection())));
		System.out.println("after sorting direction in descending order");
		for(LiftDto direction:list) {
			System.out.println(direction);
		}
		System.out.println("=========================================================");
		Collections.sort(list,(o1,o2)->(o1.getType().compareTo(o2.getType())));
		System.out.println("after sorting type in ascending order");
		for(LiftDto type:list) {
			System.out.println(type);
		}
		System.out.println("=========================================================");
		Collections.sort(list,(o1,o2)->(o2.getType().compareTo(o1.getType())));
		System.out.println("after sorting type in descending order");
		for(LiftDto type:list) {
			System.out.println(type);
		}
		
	}
}
