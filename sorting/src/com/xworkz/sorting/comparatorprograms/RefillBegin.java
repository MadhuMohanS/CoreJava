package com.xworkz.sorting.comparatorprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RefillBegin {
	public static void main(String[] args) {
		
	Refill refill=new Refill(20, "blue", "reynolds", 5);
	Refill refill1=new Refill(25, "red", "brite", 7);
	Refill refill2=new Refill(15,"black", "natraj", 6);
	Refill refill3=new Refill(20.5, "orange", "oreo", 5);
	Refill refill4=new Refill(29, "green", "urban", 9);
	
	List<Refill> list=new ArrayList<>();
	list.add(refill);
	list.add(refill1);
	list.add(refill2);
	list.add(refill3);
	list.add(refill4);
	
	for(Refill ref:list) {
		System.out.println(ref);
	}
	System.out.println("==============================================");
	System.out.println("after sorting length in ascending order");
	Comparator<Refill> comparatorLengthAsc=new RefillComparator();
	Collections.sort(list,comparatorLengthAsc);
	for(Refill length:list) {
		System.out.println(length);
	}
	System.out.println("==============================================");
	System.out.println("after sorting length in descending order");

	Comparator<Refill> comparatorLengthDesc=new RefillComparatorLengthDesc();
	Collections.sort(list,comparatorLengthDesc);
	for(Refill length:list) {
		System.out.println(length);
	}
	System.out.println("==============================================");
	System.out.println("after sorting color in ascending order");
	
	Comparator<Refill> colorAsc=new RefillColorAsc();
	Collections.sort(list,colorAsc);
	for(Refill color:list) {
		System.out.println(color);
	}
System.out.println("==============================================");
System.out.println("after sorting color in descending order");

	Comparator<Refill> colorDesc=new RefillColorDesc();
	Collections.sort(list,colorDesc);
	for(Refill color:list) {
		System.out.println(color);
	}
	
	System.out.println("==============================================");
	System.out.println("after sorting company in ascending order");
	Comparator<Refill> companyAsc=new RefillCompanyAsc();
	Collections.sort(list,companyAsc);
	for(Refill company:list) {
		System.out.println(company);
	}
	System.out.println("==============================================");
	System.out.println("after sorting company in descending order");
	
	Comparator<Refill> companyDesc=new RefillCompanyDesc();
	Collections.sort(list,companyDesc);
	for(Refill company:list) {
		System.out.println(company);
	}
	System.out.println("==============================================");
	System.out.println("after sorting cost in ascending order");
	Comparator<Refill> costAsc=new RefillCostAsc();
	Collections.sort(list,costAsc);
	for(Refill cost:list) {
		System.out.println(cost);
	}
	System.out.println("==============================================");
	System.out.println("after sorting cost in descending order");
	Comparator<Refill> costDesc=new RefillCostDesc();
	Collections.sort(list,costDesc);
	for(Refill cost:list) {
		System.out.println(cost);
	}
}
}