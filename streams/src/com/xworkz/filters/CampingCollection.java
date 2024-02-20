package com.xworkz.filters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class CampingCollection {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("Tent");
	list.add("Sleeping bag");
	list.add("Sleeping pad");
	list.add("Camping stove");
	list.add("Fuel");
	list.add("Cooking utensils");
	list.add("Portable water filter");
	list.add("Cooler");
	list.add("Insulated bag ");
	list.add("Flashlight");
	
	System.out.println("list of items which contains 't' in it");
	list.stream().filter(t->t.contains("t")).forEach(l->System.out.println(l));
	
	System.out.println("list of items in descending order");
	list.stream().sorted(Collections.reverseOrder()).forEach(l->System.out.println(l));
	
	System.out.println("list of items which has least 5 characters sort in descending order");
	list.stream().filter(t->t.length()>=5).sorted(Collections.reverseOrder()).forEach(l->System.out.println(l));
	
	System.out.println("convert all items to upper case and print which has only 'a'");
	List<String> upperList=list.stream().filter(t->t.contains("a")).collect(Collectors.toList());
	upperList.forEach(l->System.out.println(l));
	
	System.out.println("count of items which has 't'");
    System.out.println(list.stream().filter(t->t.contains("t")).count());

    System.out.println("list of items which has 'a' and 'o' in ascending order");
    List<String> list2=list.stream().filter(t->t.contains("a") && t.contains("o")).sorted().collect(Collectors.toList());
    list2.forEach(l->System.out.println(l));
}
}
