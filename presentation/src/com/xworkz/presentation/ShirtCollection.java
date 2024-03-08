package com.xworkz.presentation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ShirtCollection {
public static void main(String[] args) {
	List<String> shirtList=new ArrayList<>();
	shirtList.add("puma");
	shirtList.add("hrx");
	shirtList.add("raymond");
	shirtList.add("lenin");
	
	Collections.sort(shirtList);
	shirtList.forEach(l->System.out.println(l));
	
//	Comparator<String> comparator=(o1,o2)-> o2.compareTo(o1);

	
	Collections.sort(shirtList,(o1,o2)-> o2.compareTo(o1));
	System.out.println("desending order");
//	shirtList.forEach(l->System.out.println(l));
//	Consumer<String> consumer=(t)-> System.out.println(t);

	
	shirtList.forEach((t)-> System.out.println(t));
}
}
