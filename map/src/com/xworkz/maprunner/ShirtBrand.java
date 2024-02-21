package com.xworkz.maprunner;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class ShirtBrand {
public static void main(String[] args) {
	Map<String,String> shirtBrandMap=new HashMap<>();
	shirtBrandMap.put("poloshirt", "raymond");
	shirtBrandMap.put("Dress Shirt", "allensolly");
	shirtBrandMap.put("Flannel Shirt", "blackberrys");
	shirtBrandMap.put("Cuban Collar Shirt", "peterengland");
	shirtBrandMap.put("Chambray", "tommyhilfigher");
	
	
	System.out.println("list of keys");
	Set<String> keys=shirtBrandMap.keySet();
	keys.forEach(System.out::println);
	
	System.out.println("==============================");
	System.out.println("list of values");
	Collection<String> values= shirtBrandMap.values();
	values.forEach(System.out::println);
	
	
}
}
