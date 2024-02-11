package com.xworkz.collectionpractise.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.lambda.comparator.RadioDto;

public class RadioBegin {
public static void main(String[] args) {
	RadioDto radioDto=new RadioDto("club", 99.9, 1999, "india");
	RadioDto radioDto1=new RadioDto("fever", 98.9, 1998, "newzealand");
	RadioDto radioDto2=new RadioDto("red", 95.9, 1899, "switzerland");
	RadioDto radioDto3=new RadioDto("All", 96.9, 1997, "pakistan");
	RadioDto radioDto4=new RadioDto("listen", 93.9, 1979, "england");
	
	List<RadioDto> list=new ArrayList<>();
	list.add(radioDto);
	list.add(radioDto1);
	list.add(radioDto2);
	list.add(radioDto3);
	list.add(radioDto4);
	
	Collections.sort(list,(n1,n2)->n1.getName().compareTo(n2.getName()));
	System.out.println("after sorting name in ascending order");
	for(RadioDto ref:list) {
		System.out.println(ref);
	}
	
	Collections.sort(list,(n1,n2)->n2.getName().compareTo(n1.getName()));
	System.out.println("after sorting name in descending order");
	for(RadioDto ref:list) {
		System.out.println(ref);
	}
	
	Collections.sort(list,(p1,p2)->Double.compare(p1.getPoint(), p2.getPoint()));
	System.out.println("after sorting point in ascending order");
	for(RadioDto ref:list) {
		System.out.println(ref);
	}
	
	Collections.sort(list,(p1,p2)->Double.compare(p2.getPoint(), p1.getPoint()));
	System.out.println("after sorting point in descending order");
	for(RadioDto ref:list) {
		System.out.println(ref);
	}
	
	Collections.sort(list,(i1,i2)->Integer.compare(i1.getInvented(), i2.getInvented()));
	System.out.println("after sorting invented in ascending order");
	for(RadioDto ref:list) {
		System.out.println(ref);
	}
	
	Collections.sort(list,(i1,i2)->Integer.compare(i2.getInvented(), i1.getInvented()));
	System.out.println("after sorting invented in descending order");
	for(RadioDto ref:list) {
		System.out.println(ref);
	}
	Collections.sort(list,(c1,c2)->c1.getCountry().compareTo(c2.getCountry()));
	System.out.println("after sorting country in ascending order");
	for(RadioDto ref:list) {
		System.out.println(ref);
	}
	
	Collections.sort(list,(c1,c2)->c2.getCountry().compareTo(c1.getCountry()));
	System.out.println("after sorting country in descending order");
	for(RadioDto ref:list) {
		System.out.println(ref);
	}
	
	
	
}
}
