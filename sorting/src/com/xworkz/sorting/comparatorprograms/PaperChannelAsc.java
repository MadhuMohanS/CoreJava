package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class PaperChannelAsc implements Comparator<PaperDto>{

	@Override
	public int compare(PaperDto o1, PaperDto o2) {
		// TODO Auto-generated method stub
		return o1.getChannelName().compareTo(o2.getChannelName());
	}

}
