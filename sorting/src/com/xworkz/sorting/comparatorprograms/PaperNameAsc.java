package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PaperNameAsc implements Comparator<PaperDto>{

	@Override
	public int compare(PaperDto o1, PaperDto o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
