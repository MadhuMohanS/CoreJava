package com.xworkz.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.lambda.comparator.VentilatorDto;

//private String name;
//private double cost;
//private String type;
//private double pressure;
public class VentilatorBegin {
public static void main(String[] args) {
	VentilatorDto ventilatorDto=new VentilatorDto("mechanical", 1000, "type1", 100);
	VentilatorDto ventilatorDto1=new VentilatorDto("drager", 2000, "type1", 120);
	VentilatorDto ventilatorDto2=new VentilatorDto("emergency", 1500, "type1", 80);
	VentilatorDto ventilatorDto3=new VentilatorDto("hamilton", 35000, "type1", 3500);
	VentilatorDto ventilatorDto4=new VentilatorDto("icu", 500, "type1", 500);
	
	List<VentilatorDto> list=new ArrayList<>();
	list.add(ventilatorDto);
	list.add(ventilatorDto1);
	list.add(ventilatorDto2);
	list.add(ventilatorDto3);
	list.add(ventilatorDto4);
	System.out.println("============================================");
	
	Comparator<VentilatorDto> nameAsc =(n1,n2)->{
		return n1.getName().compareTo(n2.getName());
	};
	Collections.sort(list,nameAsc);
	System.out.println("after sorting name in ascending order");
	for(VentilatorDto name:list) {
		System.out.println(name);
	}
	System.out.println("============================================");
	Comparator<VentilatorDto> nameDesc =(n1,n2)->{
		return n2.getName().compareTo(n1.getName());
	};
	Collections.sort(list,nameDesc);
	System.out.println("after sorting name in Descending order");
	for(VentilatorDto name:list) {
		System.out.println(name);
	}
System.out.println("============================================");
	
	Comparator<VentilatorDto> costAsc =(c1,c2)->{
		return Double.compare(c1.getCost(), c2.getCost());
	};
	Collections.sort(list,costAsc);
	System.out.println("after sorting cost in ascending order");
	for(VentilatorDto cost:list) {
		System.out.println(cost);
	}
System.out.println("============================================");
	
	Comparator<VentilatorDto> costDesc =(c1,c2)->{
		return Double.compare(c2.getCost(), c1.getCost());
	};
	Collections.sort(list,costDesc);
	System.out.println("after sorting cost in descending order");
	for(VentilatorDto cost:list) {
		System.out.println(cost);
	}
System.out.println("============================================");
	
	Comparator<VentilatorDto> typeAsc =(t1,t2)->{
		return t1.getType().compareTo(t2.getType());
	};
	Collections.sort(list,typeAsc);
	System.out.println("after sorting type in ascending order");
	for(VentilatorDto type:list) {
		System.out.println(type);
	}
System.out.println("============================================");
	
	Comparator<VentilatorDto> typeDesc =(t1,t2)->{
		return t2.getType().compareTo(t1.getType());
	};
	Collections.sort(list,typeDesc);
	System.out.println("after sorting type in descending order");
	for(VentilatorDto type:list) {
		System.out.println(type);
	}
System.out.println("============================================");
	
	Comparator<VentilatorDto> pressureAsc =(p1,p2)->{
		return Double.compare(p1.getPressure(), p2.getPressure());
	};
	Collections.sort(list,pressureAsc);
	System.out.println("after sorting presssure in ascending order");
	for(VentilatorDto presssure:list) {
		System.out.println(presssure);
	}
System.out.println("============================================");
	
	Comparator<VentilatorDto> pressureDesc =(p1,p2)->{
		return Double.compare(p2.getPressure(), p1.getPressure());
	};
	Collections.sort(list,pressureDesc);
	System.out.println("after sorting presssure in descending order");
	for(VentilatorDto presssure:list) {
		System.out.println(presssure);
	}
	
}
}
