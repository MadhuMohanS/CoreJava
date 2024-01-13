package com.xworkz.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.sorting.NeedleDto;

public class NeedleBegin {
public static void main(String[] args) {
	NeedleDto needleDto=new NeedleDto(30, 20, "type1", "stitching");
	NeedleDto needleDto1=new NeedleDto(20, 15, "type2", "cutting");
	NeedleDto needleDto2=new NeedleDto(50, 25, "type4", "piecing");
	NeedleDto needleDto3=new NeedleDto(10, 5, "type5", "stitching");
	NeedleDto needleDto4=new NeedleDto(5, 2, "type3", "kill");
	
	List<NeedleDto> list=new ArrayList<>();
	list.add(needleDto);
	list.add(needleDto1);
	list.add(needleDto2);
	list.add(needleDto3);
	list.add(needleDto4);
	
	Collections.sort(list);
	for(NeedleDto ref:list) {
		System.out.println(ref);
	}
}
}
