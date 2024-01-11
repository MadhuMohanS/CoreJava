package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PaperChannelDesc implements Comparator<PaperDto>{

	@Override
	public int compare(PaperDto o1, PaperDto o2) {
		// TODO Auto-generated method stub
		return o2.getChannelName().compareTo(o1.getChannelName());
	}

}
