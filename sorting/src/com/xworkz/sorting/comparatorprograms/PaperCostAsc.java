package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PaperCostAsc implements Comparator<Paper>{
	@Override
	public int compare(Paper o1,Paper o2) {
		return Double.compare(o1.getCost(), o2.getCost());
	}

}
