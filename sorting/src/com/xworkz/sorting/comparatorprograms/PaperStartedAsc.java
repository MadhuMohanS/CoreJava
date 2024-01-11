package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PaperStartedAsc implements Comparator<Paper>{

	@Override
	public int compare(Paper o1, Paper o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getStarted(), o2.getStarted());
	}

}
