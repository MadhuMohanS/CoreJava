package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PurifierNameAsc implements Comparator<WaterPurifier>{

	@Override
	public int compare(WaterPurifier o1, WaterPurifier o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
