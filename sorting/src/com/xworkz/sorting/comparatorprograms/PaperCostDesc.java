package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PaperCostDesc implements Comparator<Paper>{

	@Override
	public int compare(Paper o1, Paper o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getCost(), o1.getCost());
	}

}
