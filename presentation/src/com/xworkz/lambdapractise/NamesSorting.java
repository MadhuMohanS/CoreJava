package com.xworkz.lambdapractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class NamesSorting {
public static void main(String[] args) {
	List<String> name=new ArrayList<>();
	name.add("madhu");
	name.add("mohan");
	name.add("anil");
	name.add("kiran");
	name.add("manoj");
	
	Comparator<String> com=new Comparator<String>() {
		
		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}
	};
	
	Collections.sort(name,com);
Consumer<String> con=new Consumer<String>() {
	
	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println(t);
		
	}
};
name.forEach(con);
//	name.forEach(s->System.out.println(s));
}
}
