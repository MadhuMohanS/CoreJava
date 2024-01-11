package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PurifierNameDesc implements Comparator<WaterPurifier>{

	@Override
	public int compare(WaterPurifier o1, WaterPurifier o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
	}

}
