package com.xworkz.collectionpractise.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ocean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("india ocean");
		list.add("pacific ocean");
		list.add("arabian ocean");
		list.add("bay of bengal");
		list.add("antartica ocean");
		
		Collections.sort(list);
		System.out.println("collections after sorting in ascending order");
		for(String ref:list) {
			System.out.println(ref);
		}
		
		Comparator<String> comparator=new OceanImpl();
		System.out.println("collections after sorting in descending order");

		Collections.sort(list,comparator);
		for(String ref:list) {
			System.out.println(ref);
		}

	}

}
