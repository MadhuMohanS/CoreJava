package com.xworkz.collectionpractise.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.sorting.AlarmDto;

public class AlarmBegin {
public static void main(String[] args) {
	AlarmDto alaramDto=new AlarmDto("tabla", 3, 4,"mobile");
	AlarmDto alaramDto1=new AlarmDto("piano", 4, 2,"home");
	AlarmDto alaramDto2=new AlarmDto("guitar", 2, 8,"office");
	AlarmDto alaramDto3=new AlarmDto("flute", 9, 1,"shop");
	AlarmDto alaramDto4=new AlarmDto("song", 6, 3,"house");
	
	List<AlarmDto> list=new ArrayList<>();
	list.add(alaramDto);
	list.add(alaramDto1);
	list.add(alaramDto2);
	list.add(alaramDto3);
	list.add(alaramDto4);
	
	Collections.sort(list);
	for(AlarmDto ref:list) {
		System.out.println(ref);
	}
}
}
