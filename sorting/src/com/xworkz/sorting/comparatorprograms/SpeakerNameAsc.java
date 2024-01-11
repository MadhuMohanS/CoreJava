package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class SpeakerNameAsc implements Comparator<Speaker>{
	@Override
	public int compare(Speaker o1,Speaker o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
