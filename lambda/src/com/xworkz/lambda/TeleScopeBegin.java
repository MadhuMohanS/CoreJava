package com.xworkz.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//private int length;
//private int width;
//private String type;
//private String use;
import com.xworkz.lambda.comparator.TeleScopeDto;
import com.xworkz.lambda.comparator.ThermometerDto;

public class TeleScopeBegin {
public static void main(String[] args) {
	TeleScopeDto teleScopeDto=new TeleScopeDto(100, 200, "type1", "moon");
	TeleScopeDto teleScopeDto1=new TeleScopeDto(150, 250, "type2", "star");
	TeleScopeDto teleScopeDto2=new TeleScopeDto(300, 150, "type3", "sky");
	TeleScopeDto teleScopeDto3=new TeleScopeDto(350, 250, "type4", "sun");
	TeleScopeDto teleScopeDto4=new TeleScopeDto(50, 130, "type5", "hill");
	
	List<TeleScopeDto> list=new ArrayList<>();
	list.add(teleScopeDto);
	list.add(teleScopeDto1);
	list.add(teleScopeDto2);
	list.add(teleScopeDto3);
	list.add(teleScopeDto4);
	
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(Integer.compare(o1.getLength(), o2.getLength())));
	System.out.println("after sorting length in ascending order");
	for(TeleScopeDto length:list) {
		System.out.println(length);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(Integer.compare(o2.getLength(), o1.getLength())));
	System.out.println("after sorting length in descending order");
	for(TeleScopeDto length:list) {
		System.out.println(length);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(Integer.compare(o1.getWidth(), o2.getWidth())));
	System.out.println("after sorting width in ascending order");
	for(TeleScopeDto width:list) {
		System.out.println(width);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(Integer.compare(o2.getWidth(), o1.getWidth())));
	System.out.println("after sorting width in descending order");
	for(TeleScopeDto width:list) {
		System.out.println(width);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(o1.getType().compareTo(o2.getType())));
	System.out.println("after sorting type in ascending order");
	for(TeleScopeDto type:list) {
		System.out.println(type);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(o2.getType().compareTo(o1.getType())));
	System.out.println("after sorting type in descending order");
	for(TeleScopeDto type:list) {
		System.out.println(type);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(o1.getUse().compareTo(o2.getUse())));
	System.out.println("after sorting use in ascending order");
	for(TeleScopeDto use:list) {
		System.out.println(use);
	}
	System.out.println("=========================================================");
	Collections.sort(list,(o1,o2)->(o2.getUse().compareTo(o1.getUse())));
	System.out.println("after sorting use in descending order");
	for(TeleScopeDto use:list) {
		System.out.println(use);
	}
	
}
}
