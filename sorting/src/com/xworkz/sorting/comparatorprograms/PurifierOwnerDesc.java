package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PurifierOwnerDesc implements Comparator<WaterPurifierDto>{

	@Override
	public int compare(WaterPurifierDto o1, WaterPurifierDto o2) {
		// TODO Auto-generated method stub
		return o2.getOwner().compareTo(o1.getOwner());
	}

}
