package com.xworkz.collectionpractise;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicate {
	public static void printDups(String str) {
		Map<Character, Integer> count=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			if(count.containsKey(str.charAt(i)))
				count.put(str.charAt(i), count.get(str.charAt(i))+1);
			else 
				count.put(str.charAt(i), 1);
		}
		
		for(Map.Entry<Character, Integer> ele:count.entrySet()) {
			if(ele.getValue()>1)
			System.out.println(ele.getKey()+":"+ele.getValue());
		}
	}
public static void main(String[] args) {
	String string="test string";
	printDups(string);
}
}
