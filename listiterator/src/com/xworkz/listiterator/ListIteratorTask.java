package com.xworkz.listiterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTask {
public static void main(String[] args) {
	List<String> shoeCollection=new ArrayList<>();
	shoeCollection.add("paragon");
	shoeCollection.add("woodland");
	shoeCollection.add("reebok");
	shoeCollection.add("nike");
	shoeCollection.add("puma");
	shoeCollection.add("adidas");
	shoeCollection.add("crocs");
	shoeCollection.add("bata");
	shoeCollection.add("fila");
	shoeCollection.add("skechers");
	
	ListIterator<String> itr=shoeCollection.listIterator();
	while(itr.hasNext()) {
		String ref=itr.next();
		System.out.println(ref);
	}
	
	System.out.println("loop in backward direction");
	while(itr.hasPrevious()) {
		String ref=itr.previous();
		System.out.println(ref);
	}
	
	ListIterator<String> itrIndex=shoeCollection.listIterator(3);
	System.out.println("loop in by using index in forward direction");
	
	while(itrIndex.hasNext()) {
		System.out.println(itrIndex.next());
	}
	
    System.out.println("loop in by using index in backward direction");
    ListIterator<String> itrBackIndex=shoeCollection.listIterator(3);
	while(itrBackIndex.hasPrevious()) {
		System.out.println(itrBackIndex.previous());
	}
	
	System.out.println("adding gucci while looping");
	ListIterator<String> itr1=shoeCollection.listIterator();
	while(itr1.hasNext()) {
		String ref=itr1.next();
		System.out.println(ref);
		itr1.add("gucci");
	}
	
	System.out.println("after adding gucci");
	ListIterator<String> itr2=shoeCollection.listIterator();
	while(itr2.hasNext()) {
		String ref=itr2.next();
		System.out.println(ref);
	}
	
	ListIterator<String> itrRemove=shoeCollection.listIterator();
	System.out.println("after removing nike");
	while(itrRemove.hasNext()) {
		String ref=itrRemove.next();
		if(ref.equals("gucci")) {
			itrRemove.remove();
		}
//		System.out.println(ref);
	}
	
	shoeCollection.forEach(l->System.out.println(l));
	
	System.out.println("sorting in descending order");
	Collections.sort(shoeCollection,(s1,s2)->s2.compareTo(s1));
	shoeCollection.forEach(l->System.out.println(l));
//	Comparator<String> desc=(s1,s2)->{
//		return s2.compareTo(s1);
//	};
	
//	Collections.sort(shoeCollection,desc);
//	shoeCollection.forEach(l->System.out.println(l));
	
	
}
}
