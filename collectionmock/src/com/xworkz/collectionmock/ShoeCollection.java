package com.xworkz.collectionmock;

import java.util.ArrayList;
import java.util.List;

public class ShoeCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("nike");
		list.add("puma");
		list.add("woodland");
		list.add("reebok");
		list.add("ucb");
		
		list.forEach(l->System.out.println(l));
	}

}
