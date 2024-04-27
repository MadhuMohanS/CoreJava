package com.xworkz.mappractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentCourseMap {
public static void main(String[] args) {
//	Map<String, String> studentCourseMap=new HashMap<String, String>();
//	studentCourseMap.put("kiran", "cs");
//	studentCourseMap.put("anil", "bio");
//	studentCourseMap.put("manoj", "math");
//	studentCourseMap.put("ethesh", "commerce");
//	
//	for(Map.Entry<String, String> map:studentCourseMap.entrySet()) {
//		String key=map.getKey();
//		if(key.equals("kiran"))
//			studentCourseMap.remove(map);
//	}
//	
//	System.out.println("after deleting...");
//	for(Map.Entry<String, String> map:studentCourseMap.entrySet()) {
//		System.out.println(map);
//	}
	Map<String,Integer> map = new HashMap<>(); 
	
	map.put("A", 65);
	map.put("B", 66);
	map.put("C", 67);
	map.put("D", 68);
	map.put("E", 69);
	// removing
	int result = map.remove("D"); 
	System.out.println("Removed Element is : "+result);
	
	Iterator<Map.Entry<String, Integer>> itr=map.entrySet().iterator();
	while(itr.hasNext()) {
		Map.Entry<String, Integer> ref=itr.next();
		
		if(ref.getKey().equals("B")) {
			itr.remove();
		}
		
	}
	System.out.println("after deleting.....");
	
	for(Map.Entry<String, Integer> ref:map.entrySet()) {
		System.out.println(ref);
	}
	
	System.out.println("print elements which contains 't'");
	map.containsKey("A");
	
	
	
}
}
