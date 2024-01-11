package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PurifierCapacityDesc implements Comparator<WaterPurifierDto>{

	@Override
	public int compare(WaterPurifierDto o1, WaterPurifierDto o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getCapacity(), o1.getCapacity());
	}

}
