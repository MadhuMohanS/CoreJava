package com.xworkz.sortmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ShopOwnerMap {
	public static HashMap<String, String> sort(HashMap<String, String> hm){
		ArrayList<Map.Entry<String, String>> list=new ArrayList<Map.Entry<String,String>>(hm.entrySet());
//		Comparator<Map.Entry<String, String>> comparator=(Entry<String, String> o1, Entry<String, String> o2)->o1.getValue().compareTo(o2.getValue());
		
		list.forEach(t->System.out.println(t));
		
		Collections.sort(list,(Entry<String, String> o1, Entry<String, String> o2)->o1.getKey().compareTo(o2.getKey()));
		
		HashMap<String, String> temp=new LinkedHashMap<String, String>();
		
		for(Map.Entry<String, String> map:list) {
			temp.put(map.getKey(), map.getValue());
		}
		
		return temp;
	}
public static void main(String[] args) {
	HashMap<String, String> maps=new HashMap<String, String>();
	maps.put("coffee shop", "venkatesh");
	maps.put("tea shop", "suresh");
	maps.put("grocery shop", "mahesh");
	maps.put("stationary shop", "girish");
	
	System.out.println(sort(maps));
}
}
