package com.xworkz.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collection2.sorting.TreeAgeCollectionImpl;

public class TreeAge {
public static void main(String[] args) {
	List<Integer> treeCollection=new ArrayList<>();
	Comparator<Integer> comparator=new TreeAgeCollectionImpl();
	treeCollection.add(50);
	treeCollection.add(55);
	treeCollection.add(79);
	treeCollection.add(90);
	treeCollection.add(37);
	treeCollection.add(89);
	treeCollection.add(14);
	treeCollection.add(88);
	treeCollection.add(67);
	treeCollection.add(58);
	
	System.out.println("after sorting in ascending order");
	Collections.sort(treeCollection);
	for(Integer i:treeCollection) {
		System.out.println(i);
	}
	
	System.out.println("after sorting in descending order");
	Collections.sort(treeCollection,comparator);
	for(Integer i:treeCollection) {
		System.out.println(i);
	}
}
}
