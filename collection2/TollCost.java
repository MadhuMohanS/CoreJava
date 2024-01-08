package com.xworkz.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collection2.sorting.TollCostImpl;

public class TollCost {
public static void main(String[] args) {
	Comparator<Double> comparator=new TollCostImpl();
	List<Double> tollcostCollection=new ArrayList<>();
	tollcostCollection.add(78.9);
	tollcostCollection.add(67.7);
	tollcostCollection.add(35.8);
	tollcostCollection.add(90.9);
	tollcostCollection.add(78.5);
	tollcostCollection.add(67.9);
	tollcostCollection.add(89.6);
	tollcostCollection.add(100.7);
	tollcostCollection.add(45.3);
	
	Collections.sort(tollcostCollection);
	System.out.println("after sorting in ascending order");
	for(double i:tollcostCollection) {
		System.out.println(i);
	}
	
	Collections.sort(tollcostCollection,comparator);
	System.out.println("after sorting in descending order");
	for(double i:tollcostCollection) {
		System.out.println(i);
	}
}
}
