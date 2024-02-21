package com.xworkz.maprunner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TvBrandMap {
public static void main(String[] args) {
	Map<String,String> tvBrandMap=new HashMap<>();
	tvBrandMap.put("oled", "samsung");
	tvBrandMap.put("qled", "tcl");
	tvBrandMap.put("plasma", "sony");
	tvBrandMap.put("led", "hisense");
	tvBrandMap.put("lcd", "panasonic");
	
	System.out.println("list of keys");
	Set<String> keys=tvBrandMap.keySet();
	keys.forEach(System.out::println);
	
	
	System.out.println("==============================");
	System.out.println("list of values");
	Collection<String> value=tvBrandMap.values();
	value.forEach(System.out::println);
}
}
