package com.xworkz.sortmap;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class ShirtCostMap {
	public static HashMap<String, Integer> sort(HashMap<String, Integer> hm){
		LinkedList<Map.Entry<String, Integer> > list =
	               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
		Comparator<Map.Entry<String, Integer>> comparator=new Comparator<Map.Entry<String,Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2) {
				
				return (o1.getValue()).compareTo(o2.getValue());
			}
			
		};
		
		Collections.sort(list,comparator);
		
		HashMap<String, Integer> temp=new LinkedHashMap<String, Integer>();
		for(Map.Entry<String, Integer> ref:list) {
			temp.put(ref.getKey(), ref.getValue());
		}
		
		return temp;
	}
public static void main(String[] args) {
	HashMap<String, Integer> maps=new HashMap<String, Integer>();
	maps.put("allen Solly", 1000);
	maps.put("tommyhilfigher",1500 );
	maps.put("peter England", 2000);
	maps.put("ucb", 1700);
	maps.put("levis", 1300);
	
	Map<String, Integer> map1= sort(maps);
	
	for(Map.Entry<String, Integer> map:map1.entrySet()) {
		System.out.println(map.getKey()+":"+map.getValue());
	}
}
}
