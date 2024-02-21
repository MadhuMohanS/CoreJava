package com.xworkz.maprunner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WallColorMap {
public static void main(String[] args) {
	Map<String, String> wallColorMap=new HashMap<>();
	wallColorMap.put("Load Bearing Walls", "red");
	wallColorMap.put("Non-Load Bearing Walls", "yellow");
	wallColorMap.put("Cavity Walls", "blue");
	wallColorMap.put("Shear Walls.", "green");
	wallColorMap.put("Partition Walls.", "white");
	
	
	System.out.println("list of keys");
	Set<String> keys=wallColorMap.keySet();
	keys.forEach(System.out::println);
	
	
	System.out.println("==============================");
	System.out.println("list of values");
	Collection<String> value=wallColorMap.values();
	value.forEach(System.out::println);
}
}
