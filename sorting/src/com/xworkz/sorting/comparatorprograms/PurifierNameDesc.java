package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PurifierNameDesc implements Comparator<WaterPurifierDto>{

	@Override
	public int compare(WaterPurifierDto o1, WaterPurifierDto o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
	}

}
