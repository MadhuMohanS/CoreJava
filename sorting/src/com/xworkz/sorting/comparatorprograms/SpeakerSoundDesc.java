package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class SpeakerSoundDesc implements Comparator<SpeakerDto>{

	@Override
	public int compare(SpeakerDto o1, SpeakerDto o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getSounds(), o1.getSounds());
	}

}
