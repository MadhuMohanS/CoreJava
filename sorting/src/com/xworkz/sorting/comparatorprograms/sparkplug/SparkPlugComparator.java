package com.xworkz.sorting.comparatorprograms.sparkplug;

import java.util.Comparator;

public class SparkPlugComparator implements Comparator<SparkPlugDto>{

	@Override
	public int compare(SparkPlugDto o1, SparkPlugDto o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}

class SparkPlugComparatorNameDesc implements Comparator<SparkPlugDto>{

	@Override
	public int compare(SparkPlugDto o1, SparkPlugDto o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
	}

}

class HeatRangeAsc implements Comparator<SparkPlugDto>{

	@Override
	public int compare(SparkPlugDto o1, SparkPlugDto o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getHeatRange(), o2.getHeatRange());
	}

}
class HeatRangeDesc implements Comparator<SparkPlugDto>{

	@Override
	public int compare(SparkPlugDto o1, SparkPlugDto o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getHeatRange(), o1.getHeatRange());
	}

}

class TypeAsc implements Comparator<SparkPlugDto>{

	@Override
	public int compare(SparkPlugDto o1, SparkPlugDto o2) {
		// TODO Auto-generated method stub
		return o1.getType().compareTo(o2.getType());
	}
	
}
class TypeDesc implements Comparator<SparkPlugDto>{

	@Override
	public int compare(SparkPlugDto o1, SparkPlugDto o2) {
		// TODO Auto-generated method stub
		return o2.getType().compareTo(o1.getType());
	}
	
}
class SizeAsc implements Comparator<SparkPlugDto>{

	@Override
	public int compare(SparkPlugDto o1, SparkPlugDto o2) {
		// TODO Auto-generated method stub
		return o1.getSize().compareTo(o2.getSize());
	}

}
class SizeDesc implements Comparator<SparkPlugDto>{

	@Override
	public int compare(SparkPlugDto o1, SparkPlugDto o2) {
		// TODO Auto-generated method stub
		return o2.getSize().compareTo(o1.getSize());
	}

}
