package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PaperCostDesc implements Comparator<PaperDto>{

	@Override
	public int compare(PaperDto o1, PaperDto o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getCost(), o1.getCost());
	}

}
