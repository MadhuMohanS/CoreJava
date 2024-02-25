package com.xworkz.lambdapractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAndListIterator {
public static void main(String[] args) {
	List<String> names=new ArrayList<>();
	names.add("madhu");
	names.add("mohan");
	names.add("kiran");
	names.add("anil");
	names.add("dhanush");
	
	Collections.sort(names);
	
	Iterator<String> ref= names.iterator();
	while(ref.hasNext()) {
		String s=ref.next();
		if(s.equals("madhu"))
			ref.remove();
		System.out.println(s);
		
	}
	names.forEach(s->System.out.println(s));
	
	System.out.println("list iterator-------------------------------------");
	
	ListIterator<String> listref=names.listIterator();
	while(listref.hasPrevious()) {
//		listref.add("manoj");
		if(listref.equals("madhu"))
			listref.remove();
		System.out.println(listref.previous());
	}
	
	System.out.println("after removing-----------------------");
	names.forEach(s->System.out.println(s));
	
}
}
