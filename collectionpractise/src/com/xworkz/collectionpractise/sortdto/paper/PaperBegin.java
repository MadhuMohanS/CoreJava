package com.xworkz.collectionpractise.sortdto.paper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PaperBegin {
public static void main(String[] args) {
	List<PaperDto> list=new ArrayList<>();
	PaperDto paperDto=new PaperDto(3, "janathavani", "karnataka", 10);
	PaperDto paperDto1=new PaperDto(3.5, "prajavani", "karnataka", 12);
	PaperDto paperDto2=new PaperDto(2.5, "eenadu", "Andhrapradesh", 9);
	PaperDto paperDto3=new PaperDto(4, "News Public", "punjab", 15);
	PaperDto paperDto4=new PaperDto(2, "bbc", "sweden", 11);
	
	list.add(paperDto);
	list.add(paperDto1);
	list.add(paperDto2);
	list.add(paperDto3);
	list.add(paperDto4);
	
	Comparator<PaperDto> costAsc=new PaperComparator();
	Collections.sort(list,costAsc);
	System.out.println("after sorting cost in ascending order");
	
	for(PaperDto ref:list) {
		System.out.println(ref);
	}
	
	Comparator<PaperDto> costDesc=new CostDesc();
	Collections.sort(list,costDesc);
	
	System.out.println("after sorting cost in descending order");
	for(PaperDto ref:list) {
		System.out.println(ref);
	}
	
	Comparator<PaperDto> nameAsc=new NameAsc();
	Collections.sort(list,nameAsc);
	System.out.println("after sorting name in ascending order");
	
	for(PaperDto ref:list) {
		System.out.println(ref);
	}
	
	Comparator<PaperDto> nameDesc=new NameDesc();
	Collections.sort(list,nameDesc);
	
    System.out.println("after sorting name in ascending order");
	
	for(PaperDto ref:list) {
		System.out.println(ref);
	}
	
	Comparator<PaperDto> stateAsc=new StateAsc();
	Collections.sort(list,stateAsc);
	
	System.out.println("after sorting state in ascending order");
	for(PaperDto ref:list) {
		System.out.println(ref);
	}
	
	Comparator<PaperDto> stateDesc=new StateDesc();
	Collections.sort(list,stateDesc);
	System.out.println("after sorting state in descending order");
	for(PaperDto ref:list) {
		System.out.println(ref);
	}
	
	Comparator<PaperDto> lengthAsc=new LengthAsc();
	Collections.sort(list,lengthAsc);
	
	System.out.println("after sorting length in ascending order");
	
	for(PaperDto ref:list) {
		System.out.println(ref);
	}
	
	Comparator<PaperDto> lengthDesc=new LengthDesc();
	Collections.sort(list,lengthDesc);
	
	System.out.println("after sorting length in ascending order");
	for(PaperDto ref:list) {
		System.out.println(ref);
	}
	
	
	
	
	
}
}
