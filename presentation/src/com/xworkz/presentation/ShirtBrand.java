package com.xworkz.presentation;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Consumer;


public class ShirtBrand {
public static void main(String[] args) {
	NavigableSet<String> shirtCollection=new TreeSet<>();
	shirtCollection.add("puma");
	shirtCollection.add("g-star");
	shirtCollection.add("tommy hilfigher");
	shirtCollection.add("reebok");
	shirtCollection.add("raymond");
	
	Consumer<String> con=new Consumer<String>() {
		
		@Override
		public void accept(String t) {
			// TODO Auto-generated method stub
			System.out.println(t);
			
		}
	};
	
	shirtCollection.forEach(con);
}
}
