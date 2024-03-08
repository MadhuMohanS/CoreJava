package com.xworkz.presentation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class NamesCollection {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("ramesh");
	list.add("suresh");
	list.add("sahil");
	list.add("nandhish");
	list.add("deepthi");
	
	Collections.sort(list);
	list.forEach(l->System.out.println(l));
	
	System.out.println("descending order");
//	Comparator<String> comparator=(o1,o2)->o2.compareTo(o1);

//	Collections.sort(list,(p1,p2)->p2.compareTo(p1));
	Collections.sort(list,(o1,o2)->o2.compareTo(o1));
//	list.forEach(l->System.out.println(l));
//	Consumer<String> consumer=(t)->System.out.println(t);
	
	list.forEach((t)->System.out.println(t));
	
	
}
}
