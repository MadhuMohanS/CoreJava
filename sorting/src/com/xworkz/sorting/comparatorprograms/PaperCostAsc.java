package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PaperCostAsc implements Comparator<PaperDto>{
	@Override
	public int compare(PaperDto o1,PaperDto o2) {
		return Double.compare(o1.getCost(), o2.getCost());
	}

}
