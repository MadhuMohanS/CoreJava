package com.xworkz.collectionmock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentIdMap {
public static void main(String[] args) {
	Map<String, Integer> studentIdMap=new HashMap<>();
	studentIdMap.put("kiran", 101);
	studentIdMap.put("manoj", 110);
	studentIdMap.put("anil", 105);
	studentIdMap.put("shambu", 106);
	studentIdMap.put("nithin", 120);
	
	studentIdMap.forEach((k,v)->System.out.println(k+" "+v));
}
}
