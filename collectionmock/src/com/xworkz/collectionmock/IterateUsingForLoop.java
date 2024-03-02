package com.xworkz.collectionmock;

import java.util.ArrayList;
import java.util.List;

public class IterateUsingForLoop {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("nike");
	list.add("puma");
	list.add("woodland");
	list.add("reebok");
	list.add("ucb");
	
	for(String ref:list) {
		System.out.println(ref);
	}
}
}
