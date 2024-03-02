package com.xworkz.collectionmock.integersoperation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntegersOperation {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(5);
	list.add(10);
	list.add(4);
	list.add(20);
	list.add(3);
	list.add(7);
	
	Iterator<Integer> ref=list.iterator();
	while(ref.hasNext()) {
		int i=ref.next();
		if(i%2==0) {
			ref.remove();
		}
	}
	
	list.forEach(l->System.out.println(l));
	
}
}
