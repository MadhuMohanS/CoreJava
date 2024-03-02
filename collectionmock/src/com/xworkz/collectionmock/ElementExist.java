package com.xworkz.collectionmock;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ElementExist {
public static void main(String[] args) {
	boolean flag=false;
	Set<String> set=new HashSet<>();
	set.add("nike");
	set.add("puma");
	set.add("woodland");
	set.add("reebok");
	set.add("ucb");
	
	Iterator<String> ref= set.iterator();
	while(ref.hasNext()) {
		String name=ref.next();
		if("puma"==name)
		     flag=true;
	}
	
	if(flag) {
		System.out.println("element is present");
	}else {
		System.out.println("element is not present");
	}
}
}
