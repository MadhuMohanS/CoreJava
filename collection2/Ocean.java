package com.xworkz.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collection2.sorting.OceanImpl;

public class Ocean {

	public static void main(String[] args) {
		List<String> oceanCollection=new ArrayList<>();
		Comparator<String> comparator=new OceanImpl();
		oceanCollection.add("pacific ocean");
		oceanCollection.add("indian ocean");
		oceanCollection.add("atlantic ocean");
		oceanCollection.add("southern ocean");
		oceanCollection.add("mediterranian ocean");
		oceanCollection.add("arctic ocean");
		oceanCollection.add("carribean ocean");
		oceanCollection.add("bering ocean");
         
		System.out.println("after sorting in ascending order");
		Collections.sort(oceanCollection);
		for(String name:oceanCollection) {
			System.out.println(name);
		}
		
		System.out.println("after sorting in desceding order");
		Collections.sort(oceanCollection,comparator);
		for(String name:oceanCollection) {
			System.out.println(name);
		}
		
	}

}
