package com.xworkz.collection2.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collection2.VegetablesImpl;

public class Vegetables {

	public static void main(String[] args) {
		List<String> vegetablesCollection=new ArrayList<>();
		Comparator<String> comparator=new VegetablesImpl();
		vegetablesCollection.add("tomato");
		vegetablesCollection.add("beans");
		vegetablesCollection.add("carrot");
		vegetablesCollection.add("spinach");
		vegetablesCollection.add("cauliflowers");
		vegetablesCollection.add("onions");
		vegetablesCollection.add("potatoes");
		vegetablesCollection.add("radishes");
		vegetablesCollection.add("beets");
		vegetablesCollection.add("celery");
		
		Collections.sort(vegetablesCollection);
		
		System.out.println("after sorting in ascending order");
		for(String name:vegetablesCollection) {
			System.out.println(name);
		}
		
     Collections.sort(vegetablesCollection,comparator);
		
		System.out.println("after sorting in descending order");
		for(String name:vegetablesCollection) {
			System.out.println(name);
		}

	}

}
