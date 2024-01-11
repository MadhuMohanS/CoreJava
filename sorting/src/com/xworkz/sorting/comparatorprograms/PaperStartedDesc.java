package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PaperStartedDesc implements Comparator<Paper>{

	@Override
	public int compare(Paper o1, Paper o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getStarted(), o1.getStarted());
	}

}
