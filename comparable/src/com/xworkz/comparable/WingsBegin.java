package com.xworkz.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.sorting.WingsDto;

public class WingsBegin {
public static void main(String[] args) {
	WingsDto wingsDto=new WingsDto(30, 40, 'M', "peacock");
	WingsDto wingsDto1=new WingsDto(20, 35, 'S', "parrot");
	WingsDto wingsDto2=new WingsDto(25, 10, 'L', "sparrow");
	WingsDto wingsDto3=new WingsDto(10, 20, 'X', "ostrich");
	WingsDto wingsDto4=new WingsDto(80, 60, 'l', "wooden cock");
	
	List<WingsDto> list=new ArrayList<>();
	list.add(wingsDto);
	list.add(wingsDto1);
	list.add(wingsDto2);
	list.add(wingsDto3);
	list.add(wingsDto4);
	
	Collections.sort(list);
	for(WingsDto ref:list) {
		System.out.println(ref);
	}
}
}
