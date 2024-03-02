package com.xworkz.collectionmock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeTwoSortedCollection {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("nike");
	list.add("puma");
	list.add("woodland");
	list.add("reebok");
	list.add("ucb");
	
	Collections.sort(list,(p1,p2)->p1.compareTo(p2));
	
	List<String> list2=new ArrayList<>();
	list2.add("ganesh");
	list2.add("suresh");
	list2.add("remesh");
	list2.add("mahesh");
	list2.add("ethesh");
	
	Collections.sort(list2,(p1,p2)->p1.compareTo(p2));
	
	List<String> finalList=new ArrayList<>();
	finalList.addAll(list);
	finalList.addAll(list2);
	
	Collections.sort(finalList,(p1,p2)->p1.compareTo(p2));
	
	finalList.forEach(l->System.out.println(l));
	
}
}
