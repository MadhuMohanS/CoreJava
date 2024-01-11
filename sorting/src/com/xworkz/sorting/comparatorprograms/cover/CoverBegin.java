package com.xworkz.sorting.comparatorprograms.cover;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.sorting.comparatorprograms.belt.BeltComparator;
import com.xworkz.sorting.comparatorprograms.belt.BeltDto;

//private String type;
//private int length;
//private int width;
//private String color;
public class CoverBegin {
public static void main(String[] args) {
	CoverDto coverDto=new CoverDto("plastic",20,10,"blue");
	CoverDto coverDto1=new CoverDto("elastic",10,5,"orange");
	CoverDto coverDto2=new CoverDto("paper",25,30,"yellow");
	CoverDto coverDto3=new CoverDto("cloth",30,40,"black");
	CoverDto coverDto4=new CoverDto("fabric",5,5,"skyblue");
	
	List<CoverDto> list=new ArrayList<>();
	list.add(coverDto);
	list.add(coverDto1);
	list.add(coverDto2);
	list.add(coverDto3);
	list.add(coverDto4);
	
System.out.println("================================================");
	
	Comparator<CoverDto> typeAsc=new CoverComparator();
	Collections.sort(list,typeAsc);
	System.out.println("after sorting in type in ascending order");
	for(CoverDto type:list) {
		System.out.println(type);
	}
	
System.out.println("================================================");
	
	Comparator<CoverDto> typeDesc=new TypeDesc();
	Collections.sort(list,typeDesc);
	System.out.println("after sorting in type in descending order");
	for(CoverDto type:list) {
		System.out.println(type);
	}
System.out.println("================================================");
	
	Comparator<CoverDto> lengthAsc=new LengthAsc();
	Collections.sort(list,lengthAsc);
	System.out.println("after sorting in length in ascending order");
	for(CoverDto length:list) {
		System.out.println(length);
	}
System.out.println("================================================");
	
	Comparator<CoverDto> lengthDesc=new LengthDesc();
	Collections.sort(list,lengthDesc);
	System.out.println("after sorting in length in descending order");
	for(CoverDto length:list) {
		System.out.println(length);
	}
	
System.out.println("================================================");
	
	Comparator<CoverDto> widthAsc=new WidthAsc();
	Collections.sort(list,widthAsc);
	System.out.println("after sorting in width in ascending order");
	for(CoverDto width:list) {
		System.out.println(width);
	}
	
System.out.println("================================================");
	
	Comparator<CoverDto> widthDesc=new WidthDesc();
	Collections.sort(list,widthDesc);
	System.out.println("after sorting in width in descending order");
	for(CoverDto width:list) {
		System.out.println(width);
	}
System.out.println("================================================");
	
	Comparator<CoverDto> colorAsc=new ColorAsc();
	Collections.sort(list,colorAsc);
	System.out.println("after sorting in color in ascending order");
	for(CoverDto color:list) {
		System.out.println(color);
	}
System.out.println("================================================");
	
	Comparator<CoverDto> colorDesc=new ColorDesc();
	Collections.sort(list,colorDesc);
	System.out.println("after sorting in color in descending order");
	for(CoverDto color:list) {
		System.out.println(color);
	}
	
}
}
