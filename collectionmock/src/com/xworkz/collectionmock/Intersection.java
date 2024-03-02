package com.xworkz.collectionmock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Intersection {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("nike");
	list.add("puma");
	list.add("woodland");
	list.add("reebok");
	list.add("ucb");
	
	List<String> list2=new ArrayList<>();
	list2.add("ganesh");
	list2.add("puma");
	list2.add("remesh");
	list2.add("woodland");
	list2.add("ethesh");
	
	List<String> finalList=new ArrayList<>();
	finalList.addAll(list);
	finalList.addAll(list2);
	
	
	
}
}
