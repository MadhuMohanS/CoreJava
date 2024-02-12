package com.xworkz.comparableandcomparator;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WatchBegin {
public static void main(String[] args) {
	WatchDto watchDto=new WatchDto("quantom", "quantom", 500, "square");
	WatchDto watchDto1=new WatchDto("ajantha", "ajantha", 300, "square");
	WatchDto watchDto2=new WatchDto("fasttrack", "fst", 1500, "circle");
	WatchDto watchDto3=new WatchDto("bulgari", "bulgari", 5500, "diamond");
	WatchDto watchDto4=new WatchDto("blancpain", "blancpain", 4000, "egg");
	
	List<WatchDto> list=new ArrayList<>();
	list.add(watchDto);
	list.add(watchDto1);
	list.add(watchDto2);
	list.add(watchDto3);
	list.add(watchDto4);
	
	Collections.sort(list);
	
	list.forEach(l->System.out.println(l));
	
	System.out.println("after sortig name in descending order");
	
	Collections.sort(list,(n1,n2)->n2.getName().compareTo(n1.getName()));
	
	list.forEach(l->System.out.println(l));
	
	System.out.println("after sorting brand in ascending order");
	
	Collections.sort(list,(b1,b2)->b1.getBrand().compareTo(b2.getBrand()));
	
	list.forEach(l->System.out.println(l));
	
	System.out.println("after sorting brand in descending order");
	
	Collections.sort(list,(b1,b2)->b2.getBrand().compareTo(b1.getBrand()));
	
	
	list.forEach(l->System.out.println(l));
	
	System.out.println("after sorting cost in ascending order");
	Collections.sort(list,(c1,c2)->Double.compare(c1.getCost(), c2.getCost()));
	list.forEach(l->System.out.println(l));
	
	System.out.println("after sorting cost in descending order");
	Collections.sort(list,(c1,c2)->Double.compare(c2.getCost(), c1.getCost()));
	list.forEach(l->System.out.println(l));
}
}
