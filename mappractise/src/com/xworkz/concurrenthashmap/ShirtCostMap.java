package com.xworkz.concurrenthashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ShirtCostMap {
public static void main(String[] args) {
	ConcurrentHashMap<String, Integer> maps=new ConcurrentHashMap<String, Integer>();
	maps.put("allen Solly", 1000);
	maps.put("tommyhilfigher",1500 );
	maps.put("peter England", 2000);
	maps.put("ucb", 1700);
	maps.put("levis", 1300);
	
	for(Map.Entry<String, Integer> map:maps.entrySet()) {
		if(map.getKey().equals("ucb")) {
			maps.put("raymond", 2500);
			maps.remove("ucb", 1700);
		}
	}
	
	maps.forEach((k,v)->System.out.println(k+":"+v));
}
}
