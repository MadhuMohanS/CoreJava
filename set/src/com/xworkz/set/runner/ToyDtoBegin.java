package com.xworkz.set.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.xworkz.set.ToyDto;

public class ToyDtoBegin {
public static void main(String[] args) {
//	Set<ToyDto> set=new HashSet<>();
	List<ToyDto> list=new ArrayList<>();
	ToyDto toyDto=new ToyDto("train", "plastic", 100);
	ToyDto toyDto1=new ToyDto("teddy", "cotton", 150);
	ToyDto toyDto2=new ToyDto("hulk", "mud", 300);
	ToyDto toyDto3=new ToyDto("ironman", "fiber", 700);
	ToyDto toyDto4=new ToyDto("train", "plastic", 200);
	
//	set.add(toyDto);
//	set.add(toyDto1);
//	set.add(toyDto2);
//	set.add(toyDto3);
//	set.add(toyDto4);
	
	list.add(toyDto);
	list.add(toyDto1);
	list.add(toyDto2);
	list.add(toyDto3);
	list.add(toyDto4);
	
	System.out.println(toyDto.hashCode());
	System.out.println(toyDto4.hashCode());
//	System.out.println(toyDto3.hashCode());
	System.out.println(toyDto.equals(toyDto4));
//	set.forEach(l->System.out.println(l));
	
//	System.out.println("ascending order");
//	Collections.sort(list);
//	list.forEach(l->System.out.println(l));
	
//	System.out.println("ascending order");
//	set.stream().sorted((n1,n2)->n1.getName().compareTo(n2.getName())).forEach(l->System.out.println(l));
//	list.stream().sorted((n1,n2)->n1.getName().compareTo(n2.getName())).forEach(l->System.out.println(l));
//	Comparator<ToyDto> con=(p1,p2)->p2.getName().compareTo(p1.getName());
//	list.stream().sorted(con).forEach(l->System.out.println(l));
//	System.out.println("descending order");
//	set.stream().sorted(con).forEach(l->System.out.println(l));
	
	Iterator<ToyDto> ref=list.iterator();
	while(ref.hasNext()) {
//		ToyDto ref1=ref.next();
//		System.out.println(ref1);
		String name=ref.next().getName();
		System.out.println(name);
		if(name.equals("train")) {
			ref.remove();
		}
	}
	
	System.out.println("after removing");
	list.forEach(l->System.out.println(l));
	
	
	
}
}
