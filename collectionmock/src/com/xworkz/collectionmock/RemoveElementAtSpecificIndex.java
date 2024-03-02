package com.xworkz.collectionmock;

import java.util.HashSet;
import java.util.Set;

public class RemoveElementAtSpecificIndex {
public static void main(String[] args) {
	Set<String> set=new HashSet<>();
	set.add("nike");
	set.add("puma");
	set.add("woodland");
	set.add("reebok");
	set.add("ucb");
	
	System.out.println("remvoing element nike");
	set.remove("nike");
	
	set.forEach(l->System.out.println(l));
}
}
