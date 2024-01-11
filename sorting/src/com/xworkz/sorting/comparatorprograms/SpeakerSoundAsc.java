package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class SpeakerSoundAsc implements Comparator<SpeakerDto>{

@Override
public int compare(SpeakerDto o1, SpeakerDto o2) {
	// TODO Auto-generated method stub
	return Integer.compare(o1.getSounds(), o2.getSounds());
}
}