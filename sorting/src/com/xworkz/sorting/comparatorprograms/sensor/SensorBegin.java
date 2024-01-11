package com.xworkz.sorting.comparatorprograms.sensor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.sorting.comparatorprograms.parking.ParkingComparator;
import com.xworkz.sorting.comparatorprograms.parking.ParkingDto;

//private String type;
//private String name;
//private double cost;
//private double distance;
public class SensorBegin {
public static void main(String[] args) {
	SensorDto sensorDto=new SensorDto("type1", "aurdino", 300, 100);
	SensorDto sensorDto1=new SensorDto("type2", "accelerometer", 400, 150);
	SensorDto sensorDto2=new SensorDto("type3", "pressure", 350, 50);
	SensorDto sensorDto3=new SensorDto("type4", "ultrasonic", 290, 200);
	SensorDto sensorDto4=new SensorDto("type5", "gas sensor", 130, 70);
	
	List<SensorDto> list=new ArrayList<>();
	list.add(sensorDto);
	list.add(sensorDto1);
	list.add(sensorDto2);
	list.add(sensorDto3);
	list.add(sensorDto4);
	
	System.out.println("================================================");

	Comparator<SensorDto> typeAsc = new SensorComparator();
	Collections.sort(list, typeAsc);
	System.out.println("after sorting in type in ascending order");
	for (SensorDto type : list) {
		System.out.println(type);
	}
	System.out.println("================================================");

	Comparator<SensorDto> typeDesc = new TypeDesc();
	Collections.sort(list, typeDesc);
	System.out.println("after sorting in type in descending order");
	for (SensorDto type : list) {
		System.out.println(type);
	}
	System.out.println("================================================");

	Comparator<SensorDto> nameAsc = new NameAsc();
	Collections.sort(list, nameAsc);
	System.out.println("after sorting in name in ascending order");
	for (SensorDto name : list) {
		System.out.println(name);
	}
	System.out.println("================================================");

	Comparator<SensorDto> nameDesc = new NameDesc();
	Collections.sort(list, nameDesc);
	System.out.println("after sorting in name in descending order");
	for (SensorDto name : list) {
		System.out.println(name);
	}
	System.out.println("================================================");

	Comparator<SensorDto> costAsc = new CostAsc();
	Collections.sort(list, costAsc);
	System.out.println("after sorting in cost in ascending order");
	for (SensorDto cost : list) {
		System.out.println(cost);
	}
	System.out.println("================================================");

	Comparator<SensorDto> costDesc = new CostDesc();
	Collections.sort(list, costDesc);
	System.out.println("after sorting in cost in descending order");
	for (SensorDto cost : list) {
		System.out.println(cost);
	}
	System.out.println("================================================");

	Comparator<SensorDto> distanceAsc = new DistanceAsc();
	Collections.sort(list, distanceAsc);
	System.out.println("after sorting in distance in ascending order");
	for (SensorDto dist : list) {
		System.out.println(dist);
	}
	System.out.println("================================================");

	Comparator<SensorDto> distanceDesc = new DistanceDesc();
	Collections.sort(list, distanceDesc);
	System.out.println("after sorting in distance in Descending order");
	for (SensorDto dist : list) {
		System.out.println(dist);
	}
	
}
}
