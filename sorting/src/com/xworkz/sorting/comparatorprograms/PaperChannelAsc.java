package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PaperChannelAsc implements Comparator<Paper>{

	@Override
	public int compare(Paper o1, Paper o2) {
		// TODO Auto-generated method stub
		return o1.getChannelName().compareTo(o2.getChannelName());
	}

}
