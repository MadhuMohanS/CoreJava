package com.xworkz.sorting.comparatorprograms.parking;

import java.util.Comparator;
//private String place;
//private String type;
//private int length;
//private int cost;
public class ParkingComparator implements Comparator<ParkingDto>{

	@Override
	public int compare(ParkingDto o1, ParkingDto o2) {
		// TODO Auto-generated method stub
		return o1.getPlace().compareTo(o2.getPlace());
	}

}

class PlaceDesc implements Comparator<ParkingDto>{

	@Override
	public int compare(ParkingDto o1, ParkingDto o2) {
		// TODO Auto-generated method stub
		return o2.getPlace().compareTo(o1.getPlace());
	}

}
class TypeAsc implements Comparator<ParkingDto>{

	@Override
	public int compare(ParkingDto o1, ParkingDto o2) {
		// TODO Auto-generated method stub
		return o1.getType().compareTo(o2.getType());
	}

}
class TypeDesc implements Comparator<ParkingDto>{

	@Override
	public int compare(ParkingDto o1, ParkingDto o2) {
		// TODO Auto-generated method stub
		return o2.getType().compareTo(o1.getType());
	}

}
class LengthAsc implements Comparator<ParkingDto>{

	@Override
	public int compare(ParkingDto o1, ParkingDto o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getLength(), o2.getLength());
	}

}

class LengthDesc implements Comparator<ParkingDto>{

	@Override
	public int compare(ParkingDto o1, ParkingDto o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getLength(), o1.getLength());
	}

}

class CostAsc implements Comparator<ParkingDto>{

	@Override
	public int compare(ParkingDto o1, ParkingDto o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getCost(), o2.getCost());
	}

}
class CostDesc implements Comparator<ParkingDto>{

	@Override
	public int compare(ParkingDto o1, ParkingDto o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getCost(), o1.getCost());
	}

}
