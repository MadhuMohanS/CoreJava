package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PaperNameDesc implements Comparator<Paper>{

	@Override
	public int compare(Paper o1, Paper o2) {
		
		return o2.getName().compareTo(o1.getName());
	}

}
