package com.xworkz.sorting.comparatorprograms.sensor;

import java.util.Comparator;
//private String type;
//private String name;
//private double cost;
//private double distance;
public class SensorComparator implements Comparator<SensorDto>{

	@Override
	public int compare(SensorDto o1, SensorDto o2) {
		// TODO Auto-generated method stub
		return o1.getType().compareTo(o2.getType());
	}

}
class TypeDesc implements Comparator<SensorDto>{

	@Override
	public int compare(SensorDto o1, SensorDto o2) {
		// TODO Auto-generated method stub
		return o2.getType().compareTo(o1.getType());
	}

}
class NameAsc implements Comparator<SensorDto>{

	@Override
	public int compare(SensorDto o1, SensorDto o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
class NameDesc implements Comparator<SensorDto>{

	@Override
	public int compare(SensorDto o1, SensorDto o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
	}

}
class CostAsc implements Comparator<SensorDto>{

	@Override
	public int compare(SensorDto o1, SensorDto o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getCost(), o2.getCost());
	}

}
class CostDesc implements Comparator<SensorDto>{

	@Override
	public int compare(SensorDto o1, SensorDto o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getCost(), o1.getCost());
	}

}
class DistanceAsc implements Comparator<SensorDto>{

	@Override
	public int compare(SensorDto o1, SensorDto o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getDistance(), o2.getDistance());
	}

}
class DistanceDesc implements Comparator<SensorDto>{

	@Override
	public int compare(SensorDto o1, SensorDto o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getDistance(), o1.getDistance());
	}

}
