package com.xworkz.collectionpractise.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Vegetables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("tomato");
		list.add("beans");
		list.add("onion");
		list.add("carrot");
		list.add("cucumber");
		
		Collections.sort(list);
		
		System.out.println("after sorting in ascending order");
		
		for(String ref:list) {
			System.out.println(ref);
		}
		
		System.out.println("after sorting in descending order");
		Comparator<String> comparator=new VegetablesImpl();
		Collections.sort(list,comparator);
		
		for(String ref:list) {
			System.out.println(ref);
		}
		

	}

}
