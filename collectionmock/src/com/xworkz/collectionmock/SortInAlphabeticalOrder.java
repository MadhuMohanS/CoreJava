package com.xworkz.collectionmock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortInAlphabeticalOrder {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("nike");
	list.add("puma");
	list.add("woodland");
	list.add("reebok");
	list.add("ucb");
	
	Collections.sort(list,(p1,p2)->p1.compareTo(p2));
	
	list.forEach(l->System.out.println(l));
}
}
