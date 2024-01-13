package com.xworkz.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.comparable.sorting.AlaramDto;

public class AlaramBegin {
public static void main(String[] args) {
	AlaramDto alaramDto=new AlaramDto("tabla", 3, 4,"mobile");
	AlaramDto alaramDto1=new AlaramDto("piano", 4, 2,"home");
	AlaramDto alaramDto2=new AlaramDto("guitar", 2, 8,"office");
	AlaramDto alaramDto3=new AlaramDto("flute", 9, 1,"shop");
	AlaramDto alaramDto4=new AlaramDto("song", 6, 3,"house");
	
	List<AlaramDto> list=new ArrayList<>();
	list.add(alaramDto);
	list.add(alaramDto1);
	list.add(alaramDto2);
	list.add(alaramDto3);
	list.add(alaramDto4);
	
	Collections.sort(list);
	System.out.println("after sorting tune in ascending order");
	for(AlaramDto ref:list) {
		System.out.println(ref);
	}
	
	Collections.sort(list,(o1,o2)->o2.getTune().compareTo(o1.getTune()));
	System.out.println("after sorting tune in descending order");
	for(AlaramDto ref:list) {
		System.out.println(ref);
	}
}
}
