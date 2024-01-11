package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class SpeakerNameAsc implements Comparator<SpeakerDto>{
	@Override
	public int compare(SpeakerDto o1,SpeakerDto o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
