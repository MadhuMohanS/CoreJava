package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class SpeakerCostAsc implements Comparator<Speaker>{

	@Override
	public int compare(Speaker o1, Speaker o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getCost(), o2.getCost());
	}

}
