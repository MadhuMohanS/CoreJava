package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class SpeakerNameDesc implements Comparator<Speaker>{
	@Override
	public int compare(Speaker o1,Speaker o2) {
		return o2.getName().compareTo(o1.getName());
	}

}
