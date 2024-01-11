package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PurifierTypeAsc implements Comparator<WaterPurifierDto>{

	@Override
	public int compare(WaterPurifierDto o1, WaterPurifierDto o2) {
		// TODO Auto-generated method stub
		return o1.getType().compareTo(o2.getType());
	}

}
