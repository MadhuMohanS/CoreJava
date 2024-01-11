package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PurifierTypeDesc implements Comparator<WaterPurifierDto>{

	@Override
	public int compare(WaterPurifierDto o1, WaterPurifierDto o2) {
		// TODO Auto-generated method stub
		return o2.getType().compareTo(o1.getType());
	}

}
