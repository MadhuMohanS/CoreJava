package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PaperNameDesc implements Comparator<PaperDto>{

	@Override
	public int compare(PaperDto o1, PaperDto o2) {
		
		return o2.getName().compareTo(o1.getName());
	}

}
