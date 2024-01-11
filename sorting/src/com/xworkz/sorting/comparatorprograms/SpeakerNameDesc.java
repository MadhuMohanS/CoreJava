package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class SpeakerNameDesc implements Comparator<SpeakerDto>{
	@Override
	public int compare(SpeakerDto o1,SpeakerDto o2) {
		return o2.getName().compareTo(o1.getName());
	}

}
