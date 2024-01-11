package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class SpeakerSoundDesc implements Comparator<Speaker>{

	@Override
	public int compare(Speaker o1, Speaker o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getSounds(), o1.getSounds());
	}

}
