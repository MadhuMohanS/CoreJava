package com.xworkz.maprunner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CarModelMap {
public static void main(String[] args) {
	Map<String,Integer> carModelMap=new HashMap<>();
	carModelMap.put("swift", 2017);
	carModelMap.put("benz", 2020);
	carModelMap.put("skoda", 2018);
	carModelMap.put("creta", 2015);
	carModelMap.put("nexon", 1998);
	
	System.out.println("list of keys");
	Set<String> keys=carModelMap.keySet();
	keys.forEach(System.out::println);
	
	
	System.out.println("================================");
	System.out.println("list of values");
	Collection<Integer> values=carModelMap.values();
	values.forEach(System.out::println);
}
}
