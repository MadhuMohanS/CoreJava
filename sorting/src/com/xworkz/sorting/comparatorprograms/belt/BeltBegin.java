package com.xworkz.sorting.comparatorprograms.belt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.sorting.comparatorprograms.charcoal.CharCoalComparator;
import com.xworkz.sorting.comparatorprograms.charcoal.CharCoalDto;

//private String company;
//private int length;
//private int buckels;
//private String type;
public class BeltBegin {
public static void main(String[] args) {
	BeltDto beltDto=new BeltDto("ruby",8,10,"male");
	BeltDto beltDto1=new BeltDto("denim",10,20,"male");
	BeltDto beltDto2=new BeltDto("rolex",9,15,"female");
	BeltDto beltDto3=new BeltDto("woodland",5,17,"trans");
	BeltDto beltDto4=new BeltDto("paragon",7,25,"female");
	
	List<BeltDto> list=new ArrayList<>();
	list.add(beltDto);
	list.add(beltDto1);
	list.add(beltDto2);
	list.add(beltDto3);
	list.add(beltDto4);
	
System.out.println("================================================");
	
	Comparator<BeltDto> companyAsc=new BeltComparator();
	Collections.sort(list,companyAsc);
	System.out.println("after sorting in company in ascending order");
	for(BeltDto company:list) {
		System.out.println(company);
	}
	
System.out.println("================================================");
	
	Comparator<BeltDto> companyDesc=new CompanyDesc();
	Collections.sort(list,companyDesc);
	System.out.println("after sorting in company in Descending order");
	for(BeltDto company:list) {
		System.out.println(company);
	}
System.out.println("================================================");
	
	Comparator<BeltDto> lengthAsc=new LengthAsc();
	Collections.sort(list,lengthAsc);
	System.out.println("after sorting in length in ascending order");
	for(BeltDto length:list) {
		System.out.println(length);
	}
	
System.out.println("================================================");
	
	Comparator<BeltDto> lengthDesc=new LengthDesc();
	Collections.sort(list,lengthDesc);
	System.out.println("after sorting in length in descending order");
	for(BeltDto length:list) {
		System.out.println(length);
	}
	
System.out.println("================================================");
	
	Comparator<BeltDto> buckelsAsc=new BuckelsAsc();
	Collections.sort(list,buckelsAsc);
	System.out.println("after sorting in buckels in ascending order");
	for(BeltDto buckels:list) {
		System.out.println(buckels);
	}
System.out.println("================================================");
	
	Comparator<BeltDto> buckelsDesc=new BuckelsDesc();
	Collections.sort(list,buckelsDesc);
	System.out.println("after sorting in buckels in descending order");
	for(BeltDto buckels:list) {
		System.out.println(buckels);
	}
	
System.out.println("================================================");
	
	Comparator<BeltDto> typeAsc=new TypeAsc();
	Collections.sort(list,typeAsc);
	System.out.println("after sorting in type in ascending order");
	for(BeltDto type:list) {
		System.out.println(type);
	}
	
System.out.println("================================================");
	
	Comparator<BeltDto> typeDesc=new TypeDesc();
	Collections.sort(list,typeDesc);
	System.out.println("after sorting in type in descending order");
	for(BeltDto type:list) {
		System.out.println(type);
	}
	
}
}
