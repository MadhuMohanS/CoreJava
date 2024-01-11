package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PaperChannelDesc implements Comparator<Paper>{

	@Override
	public int compare(Paper o1, Paper o2) {
		// TODO Auto-generated method stub
		return o2.getChannelName().compareTo(o1.getChannelName());
	}

}
