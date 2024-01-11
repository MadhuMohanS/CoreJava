package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PaperNameAsc implements Comparator<Paper>{

	@Override
	public int compare(Paper o1, Paper o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
