package com.xworkz.collectionpractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class FindTallest {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(3);
	list.add(2);
	list.add(1);
	list.add(3);
	
	Collections.sort(list);
	int max=Integer.MIN_VALUE;
	int count=0;
	for(int i=0;i<list.size();i++) {
		if(list.get(i)>max)
			max=list.get(i);
	}
	for(int j=0;j<list.size();j++) {
		if(max==list.get(j))
			count++;
	}
	System.out.println(count);
}
}
