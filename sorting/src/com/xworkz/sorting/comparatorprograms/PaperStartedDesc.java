package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PaperStartedDesc implements Comparator<PaperDto>{

	@Override
	public int compare(PaperDto o1, PaperDto o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getStarted(), o1.getStarted());
	}

}
