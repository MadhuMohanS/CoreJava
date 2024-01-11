package com.xworkz.sorting.comparatorprograms.parking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.sorting.comparatorprograms.cover.CoverComparator;
import com.xworkz.sorting.comparatorprograms.cover.CoverDto;

//private String place;
//private String type;
//private int length;
//private int cost;
public class ParkingBegin {
	public static void main(String[] args) {
		ParkingDto parkingDto = new ParkingDto("davangere", "bike", 300, 100);
		ParkingDto parkingDto1 = new ParkingDto("banglore", "car", 500, 500);
		ParkingDto parkingDto2 = new ParkingDto("udupi", "cycle", 200, 50);
		ParkingDto parkingDto3 = new ParkingDto("hebbal", "aeroplane", 1000, 10000);
		ParkingDto parkingDto4 = new ParkingDto("hubli", "electric", 350, 350);
		List<ParkingDto> list = new ArrayList<>();
		list.add(parkingDto);
		list.add(parkingDto1);
		list.add(parkingDto2);
		list.add(parkingDto3);
		list.add(parkingDto4);

		System.out.println("================================================");

		Comparator<ParkingDto> placeAsc = new ParkingComparator();
		Collections.sort(list, placeAsc);
		System.out.println("after sorting in place in ascending order");
		for (ParkingDto place : list) {
			System.out.println(place);
		}
		System.out.println("================================================");

		Comparator<ParkingDto> placeDesc = new PlaceDesc();
		Collections.sort(list, placeDesc);
		System.out.println("after sorting in place in descending order");
		for (ParkingDto place : list) {
			System.out.println(place);
		}

		System.out.println("================================================");

		Comparator<ParkingDto> typeAsc = new TypeAsc();
		Collections.sort(list, typeAsc);
		System.out.println("after sorting in type in ascending order");
		for (ParkingDto type : list) {
			System.out.println(type);
		}

		System.out.println("================================================");

		Comparator<ParkingDto> typeDesc = new TypeDesc();
		Collections.sort(list, typeDesc);
		System.out.println("after sorting in type in descending order");
		for (ParkingDto type : list) {
			System.out.println(type);
		}
		System.out.println("================================================");

		Comparator<ParkingDto> lengthAsc = new LengthAsc();
		Collections.sort(list, lengthAsc);
		System.out.println("after sorting in length in ascending order");
		for (ParkingDto length : list) {
			System.out.println(length);
		}

		System.out.println("================================================");

		Comparator<ParkingDto> lengthDesc = new LengthDesc();
		Collections.sort(list, lengthDesc);
		System.out.println("after sorting in length in descending order");
		for (ParkingDto length : list) {
			System.out.println(length);
		}
		System.out.println("================================================");

		Comparator<ParkingDto> costAsc = new CostAsc();
		Collections.sort(list, costAsc);
		System.out.println("after sorting in cost in ascending order");
		for (ParkingDto cost : list) {
			System.out.println(cost);
		}
		System.out.println("================================================");

		Comparator<ParkingDto> costDesc = new CostDesc();
		Collections.sort(list, costDesc);
		System.out.println("after sorting in cost in descending order");
		for (ParkingDto cost : list) {
			System.out.println(cost);
		}
	}
}
