package com.xworkz.collectionpractise.arraylist;

import java.util.ArrayList;

public class AddingIntegers {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
	ArrayList<Integer> list2=new ArrayList<>();
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(8);
	list.add(0,1);
	list.add(0,1);
	list.add(4,8);
	
	list2.add(23);
	list2.add(45);
	list2.add(67);
	list2.add(90);
	
	list.addAll(0,list2);
//	list.clear();
	
	
//	for(Integer i:list) {
//		System.out.println(i);
//	}
	System.out.println(list.indexOf(8));
	System.out.println(list.lastIndexOf(8));
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i)+",");
	}
}
}
