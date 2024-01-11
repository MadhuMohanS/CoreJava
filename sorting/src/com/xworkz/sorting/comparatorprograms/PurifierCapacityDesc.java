package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PurifierCapacityDesc implements Comparator<WaterPurifier>{

	@Override
	public int compare(WaterPurifier o1, WaterPurifier o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getCapacity(), o1.getCapacity());
	}

}
