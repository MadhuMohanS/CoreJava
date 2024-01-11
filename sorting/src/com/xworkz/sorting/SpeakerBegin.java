package com.xworkz.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.sorting.comparatorprograms.SpeakerDto;
import com.xworkz.sorting.comparatorprograms.SpeakerCostAsc;
import com.xworkz.sorting.comparatorprograms.SpeakerCostDesc;
import com.xworkz.sorting.comparatorprograms.SpeakerFrequencyAsc;
import com.xworkz.sorting.comparatorprograms.SpeakerFrequencyDesc;
import com.xworkz.sorting.comparatorprograms.SpeakerNameAsc;
import com.xworkz.sorting.comparatorprograms.SpeakerNameDesc;
import com.xworkz.sorting.comparatorprograms.SpeakerSoundAsc;
import com.xworkz.sorting.comparatorprograms.SpeakerSoundDesc;

public class SpeakerBegin {
public static void main(String[] args) {
	List<SpeakerDto> speakerCollection=new ArrayList<>();
	
	SpeakerDto speaker=new SpeakerDto("bose", 3000, 100, 180.5);
	SpeakerDto speaker1=new SpeakerDto("sony", 4000, 120, 132.7);
	SpeakerDto speaker2=new SpeakerDto("klipsh", 4500, 130, 166.6);
	SpeakerDto speaker3=new SpeakerDto("jbl", 3500, 500, 280.8);
	SpeakerDto speaker4=new SpeakerDto("kef", 5000, 190, 480.4);
	
	speakerCollection.add(speaker);
	speakerCollection.add(speaker1);
	speakerCollection.add(speaker2);
	speakerCollection.add(speaker3);
	speakerCollection.add(speaker4);
	
	for(SpeakerDto ref:speakerCollection) {
		System.out.println(ref);
	}
	
	System.out.println("=======================================================");
	Comparator<SpeakerDto> comparatorNameAsc=new SpeakerNameAsc();
	Collections.sort(speakerCollection,comparatorNameAsc);
	System.out.println("after sorting name in ascending order");
	for(SpeakerDto name:speakerCollection) {
		System.out.println(name);
	}
	System.out.println("=======================================================");
	System.out.println("after sorting name in descending order");
	Comparator<SpeakerDto> comparatorNameDesc=new SpeakerNameDesc();
	Collections.sort(speakerCollection,comparatorNameDesc);
	for(SpeakerDto name:speakerCollection) {
		System.out.println(name);
	}
	System.out.println("=======================================================");
	System.out.println("after sorting cost in ascending order");
	Comparator<SpeakerDto> comparatorCostAsc=new SpeakerCostAsc();
	Collections.sort(speakerCollection,comparatorCostAsc);
	for(SpeakerDto cost:speakerCollection) {
		System.out.println(cost);
	}
	System.out.println("=======================================================");
	System.out.println("after sorting cost in descending order");
	Comparator<SpeakerDto> comparatorCostDesc=new SpeakerCostDesc();
	Collections.sort(speakerCollection,comparatorCostDesc);
	for(SpeakerDto cost:speakerCollection) {
		System.out.println(cost);
	}
	System.out.println("=======================================================");
	Comparator<SpeakerDto> comparatorSoundAsc=new SpeakerSoundAsc();
	System.out.println("after sorting sound in ascending order");
	Collections.sort(speakerCollection,comparatorSoundAsc);
	for(SpeakerDto sound:speakerCollection) {
		System.out.println(sound);
	}
	System.out.println("=======================================================");
	Comparator<SpeakerDto> comparatorSoundDesc=new SpeakerSoundDesc();
	System.out.println("after sorting sound in descending order");
	Collections.sort(speakerCollection,comparatorSoundDesc);
	for(SpeakerDto sound:speakerCollection) {
		System.out.println(sound);
	}
	
	System.out.println("=======================================================");
    Comparator<SpeakerDto> comparatorFrequencyAsc=new SpeakerFrequencyAsc();
    Collections.sort(speakerCollection,comparatorFrequencyAsc);
    System.out.println("after sorting frequency in ascending order");
    for(SpeakerDto frequency:speakerCollection) {
    	System.out.println(frequency);
    }
    
    System.out.println("=======================================================");
    Comparator<SpeakerDto> comparatorFrequencyDesc=new SpeakerFrequencyDesc();
    Collections.sort(speakerCollection,comparatorFrequencyDesc);
    System.out.println("after sorting frequency in descending order");
    for(SpeakerDto frequency:speakerCollection) {
    	System.out.println(frequency);
    }
}
}
