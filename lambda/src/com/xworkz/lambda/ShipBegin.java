package com.xworkz.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.lambda.comparator.ShipDto;
//private String name;
//private double length;
//private double width;
//private String constructed;
public class ShipBegin {
public static void main(String[] args) {
	ShipDto shipDto=new ShipDto("titanic", 300, 400, "17-02-1999");
	ShipDto shipDto1=new ShipDto("picaso", 500, 900, "18-03-1999");
	ShipDto shipDto2=new ShipDto("saxena", 400, 200, "19-07-1999");
	ShipDto shipDto3=new ShipDto("vishaka", 200, 450, "20-01-1999");
	ShipDto shipDto4=new ShipDto("zinc", 800, 280, "21-10-1999");
	
	List<ShipDto> list=new ArrayList<>();
	list.add(shipDto);
	list.add(shipDto1);
	list.add(shipDto2);
	list.add(shipDto3);
	list.add(shipDto4);
	
	Comparator<ShipDto> nameAsc=(n1,n2)->{
		return n1.getName().compareTo(n2.getName());
	};
	
	Collections.sort(list,nameAsc);
	System.out.println("====================================================");
	System.out.println("after sorting name in ascending order");
	for(ShipDto name:list) {
		System.out.println(name);
	}
	Comparator<ShipDto> nameDesc=(n1,n2)->{
		return n2.getName().compareTo(n1.getName());
	};
	
	Collections.sort(list,nameDesc);
	System.out.println("====================================================");
	System.out.println("after sorting name in ascending order");
	for(ShipDto name:list) {
		System.out.println(name);
	}
	Comparator<ShipDto> lengthAsc=(n1,n2)->{
		return Double.compare(n1.getLength(), n2.getLength());
	};
	
	Collections.sort(list,lengthAsc);
	System.out.println("====================================================");
	System.out.println("after sorting length in ascending order");
	for(ShipDto length:list) {
		System.out.println(length);
	}
	Comparator<ShipDto> lengthDesc=(n1,n2)->{
		return Double.compare(n2.getLength(), n1.getLength());
	};
	
	Collections.sort(list,lengthDesc);
	System.out.println("====================================================");
	System.out.println("after sorting length in descending order");
	for(ShipDto length:list) {
		System.out.println(length);
	}
	Comparator<ShipDto> widthAsc=(n1,n2)->{
		return Double.compare(n1.getWidth(), n2.getWidth());
	};
	
	Collections.sort(list,widthAsc);
	System.out.println("====================================================");
	System.out.println("after sorting width in ascending order");
	for(ShipDto width:list) {
		System.out.println(width);
	}
	Comparator<ShipDto> widthDesc=(n1,n2)->{
		return Double.compare(n2.getWidth(), n1.getWidth());
	};
	
	Collections.sort(list,widthDesc);
	System.out.println("====================================================");
	System.out.println("after sorting width in descending order");
	for(ShipDto width:list) {
		System.out.println(width);
	}
	Comparator<ShipDto> constrAsc=(n1,n2)->{
		return n1.getConstructed().compareTo(n2.getConstructed());
	};
	
	Collections.sort(list,constrAsc);
	System.out.println("====================================================");
	System.out.println("after sorting constructed in ascending order");
	for(ShipDto constructed:list) {
		System.out.println(constructed);
	}
	Comparator<ShipDto> constrDesc=(n1,n2)->{
		return n2.getConstructed().compareTo(n1.getConstructed());
	};
	
	Collections.sort(list,constrDesc);
	System.out.println("====================================================");
	System.out.println("after sorting constructed in descending order");
	for(ShipDto constructed:list) {
		System.out.println(constructed);
	}
	
	
}
}
