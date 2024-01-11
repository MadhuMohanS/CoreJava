package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PurifierTypeAsc implements Comparator<WaterPurifier>{

	@Override
	public int compare(WaterPurifier o1, WaterPurifier o2) {
		// TODO Auto-generated method stub
		return o1.getType().compareTo(o2.getType());
	}

}
