package com.xworkz.sortmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class StudentCourse {
	public static HashMap<String, String> sort(HashMap<String, String> hm){
		LinkedList<Map.Entry<String, String>> list=new LinkedList<Map.Entry<String, String>>(hm.entrySet());
//		Collections.sort(list,(Entry<String,String> o1,Entry<String, String> o2)->o1.getKey().compareTo(o2.getKey()));
		Collections.sort(list,(Entry<String, String> o1, Entry<String, String> o2)->o1.getKey().compareTo(o2.getKey()));

		HashMap<String, String> temp=new LinkedHashMap<String, String>();
		
		for(Map.Entry<String, String> map:list) {
			temp.put(map.getKey(), map.getValue());
		}
		return temp;
	}
public static void main(String[] args) {
	HashMap<String, String> maps=new HashMap<String, String>();
	maps.put("anil", "java");
	maps.put("manoj", "c++");
	maps.put("kiran", "python");
	maps.put("ethesh", "c#");
	maps.put("krishna", "ruby");
	
	System.out.println(sort(maps));
	
}
}
