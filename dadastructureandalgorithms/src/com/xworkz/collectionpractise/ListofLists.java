package com.xworkz.collectionpractise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListofLists {
public static void main(String[] args) {
	ArrayList<List<Integer>> listoflists=new ArrayList<List<Integer>>();
	List<Integer> list1=new ArrayList<>();
	list1.add(1);
	list1.add(2);
	list1.add(3);
	
	listoflists.add(list1);
	List<Integer> list2=new ArrayList<>();
	list2.add(101);
	list2.add(102);
	list2.add(103);
	listoflists.add(list2);
	List<Integer> list3=new ArrayList<Integer>();
	list3.add(201);
	list3.add(202);
	list3.add(203);
	
	listoflists.add(list3);
//	for(List<Integer> ref:listoflists) {
//		for (Integer i:ref) {
//			System.out.println(i);
//			
//		}
//	}
	
	listoflists.forEach(ref->
	ref.forEach(l->System.out.println(l)));
	
}
}
