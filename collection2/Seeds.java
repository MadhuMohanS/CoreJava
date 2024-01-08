package com.xworkz.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collection2.sorting.SeedsImpl;

public class Seeds {
public static void main(String[] args) {
	List<String> seedsCollection=new ArrayList<>();
	Comparator<String> comparator=new SeedsImpl();
	seedsCollection.add("apple seed");
	seedsCollection.add("chicko seed");
	seedsCollection.add("watermelon seed");
	seedsCollection.add("musk seed");
	seedsCollection.add("tulsi seed");
	seedsCollection.add("pumpkin seed");
	seedsCollection.add("flax seed");
	seedsCollection.add("poppy seed");
	seedsCollection.add("sunflower seed");
	seedsCollection.add("chia seed");
	
	Collections.sort(seedsCollection);
	System.out.println("after sorting in ascending order");
	for(String str:seedsCollection) {
		System.out.println(str);
	}
	
	Collections.sort(seedsCollection,comparator);
	System.out.println("after sorting in descending order");
	for(String str:seedsCollection) {
		System.out.println(str);
	}
}
}
