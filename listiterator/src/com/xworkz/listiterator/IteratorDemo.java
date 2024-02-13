package com.xworkz.listiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
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
	
	Iterator<String> itr= shoeCollection.iterator();
	
	while(itr.hasNext()) {
		String ref=itr.next();
		System.out.println(ref);
		if("nike".equals(ref)) {
			itr.remove();
		}
	}
	System.out.println("after removing nike");
	shoeCollection.forEach(l->System.out.println(l));
}
}
