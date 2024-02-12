package com.xworkz.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayGroundBegin {
public static void main(String[] args) {
	PlayGroundDto playGroundDto=new PlayGroundDto("davangere stadium", "davangere", 400, "outdoor");
	PlayGroundDto playGroundDto1=new PlayGroundDto("vks playground", "banglore", 800, "outdoor");
	PlayGroundDto playGroundDto2=new PlayGroundDto("spandana", "mysore", 1000, "indoor");
	PlayGroundDto playGroundDto3=new PlayGroundDto("ksr", "banglore", 600, "indoor");
	PlayGroundDto playGroundDto4=new PlayGroundDto("jsr", "jaipur", 1500, "outdoor");
	
	List<PlayGroundDto> list=new ArrayList<>();
	list.add(playGroundDto);
	list.add(playGroundDto1);
	list.add(playGroundDto2);
	list.add(playGroundDto3);
	list.add(playGroundDto4);
	
	Collections.sort(list);
	System.out.println("after sorting name in ascending order");
	list.forEach(l->System.out.println(l));
	
	System.out.println("after sorting name in descending order");
	Collections.sort(list,(n1,n2)->n2.getName().compareTo(n1.getName()));
	list.forEach(l->System.out.println(l));
	
	System.out.println("after sorting location in ascending order");
	Collections.sort(list,(n1,n2)->n1.getLocation().compareTo(n2.getLocation()));
	list.forEach(l->System.out.println(l));
	
	System.out.println("after sorting location in descending order");
	Collections.sort(list,(n1,n2)->n2.getLocation().compareTo(n1.getLocation()));
	list.forEach(l->System.out.println(l));
	
	System.out.println("after sorting length in ascending order");
	Collections.sort(list,(l1,l2)->Double.compare(l1.getLength(), l2.getLength()));
	list.forEach(l->System.out.println(l));
	
	System.out.println("after sorting length in descending order");
	Collections.sort(list,(l1,l2)->Double.compare(l2.getLength(), l1.getLength()));
	list.forEach(l->System.out.println(l));
	
}
}
