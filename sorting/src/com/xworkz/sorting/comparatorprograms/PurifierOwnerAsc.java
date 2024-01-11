package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PurifierOwnerAsc implements Comparator<WaterPurifierDto>{

	@Override
	public int compare(WaterPurifierDto o1, WaterPurifierDto o2) {
		// TODO Auto-generated method stub
		return o1.getOwner().compareTo(o2.getOwner());
	}

}
