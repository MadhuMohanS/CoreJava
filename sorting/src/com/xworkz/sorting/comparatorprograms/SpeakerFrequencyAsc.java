package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class SpeakerFrequencyAsc implements Comparator<SpeakerDto>{

	@Override
	public int compare(SpeakerDto o1, SpeakerDto o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getFrequency(), o2.getFrequency());
	}

}
