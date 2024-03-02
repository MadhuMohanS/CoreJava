package com.xworkz.collectionmock;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateUsingIterator {
public static void main(String[] args) {
	Set<String> set=new HashSet<>();
	set.add("nike");
	set.add("puma");
	set.add("woodland");
	set.add("reebok");
	set.add("ucb");
	
	Iterator<String> ref= set.iterator();
	while(ref.hasNext()) {
		System.out.println(ref.next());
	}
}
}
