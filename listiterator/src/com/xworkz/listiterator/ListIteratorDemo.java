package com.xworkz.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
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
	
	ListIterator<String> listItr=shoeCollection.listIterator();
	
	while(listItr.hasNext()) {
		String ref=listItr.next();
		System.out.println(ref);
		if(ref.equals("nike")) {
			listItr.remove();
		}
		listItr.add("gucci");
	}
	
	System.out.println("after removing nike");
	
	shoeCollection.forEach(l->System.out.println(l));
	
	System.out.println("descenbding order");
	while(listItr.hasPrevious()) {
		String ref=listItr.previous();
		System.out.println(ref);
	}
	
	ListIterator<String> listIndex=shoeCollection.listIterator(2);
	System.out.println("starting from two");
	
	while(listIndex.hasNext()) {
		String ref=listIndex.next();
		System.out.println(ref);
	}
}
}
