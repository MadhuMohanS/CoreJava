package com.xworkz.maprunner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LandOwnerMap {
public static void main(String[] args) {
	Map<String, String> landOwnerMap=new HashMap<>();
	landOwnerMap.put("20X40", "Manoj");
	landOwnerMap.put("30X40", "Kiran");
	landOwnerMap.put("10X30", "Anil");
	landOwnerMap.put("40X60", "Mubbu");
	landOwnerMap.put("60X100", "Faraz");
	
	System.out.println("list of keys");
	Set<String> keys=landOwnerMap.keySet();
	keys.forEach(System.out::println);
	
	
	System.out.println("================================");
	System.out.println("list of values");
	Collection<String> values=landOwnerMap.values();
	values.forEach(System.out::println);
}
}
