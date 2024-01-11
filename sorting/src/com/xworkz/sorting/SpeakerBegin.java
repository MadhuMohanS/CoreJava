package com.xworkz.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.sorting.comparatorprograms.Speaker;
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
	List<Speaker> speakerCollection=new ArrayList<>();
	
	Speaker speaker=new Speaker("bose", 3000, 100, 180.5);
	Speaker speaker1=new Speaker("sony", 4000, 120, 132.7);
	Speaker speaker2=new Speaker("klipsh", 4500, 130, 166.6);
	Speaker speaker3=new Speaker("jbl", 3500, 500, 280.8);
	Speaker speaker4=new Speaker("kef", 5000, 190, 480.4);
	
	speakerCollection.add(speaker);
	speakerCollection.add(speaker1);
	speakerCollection.add(speaker2);
	speakerCollection.add(speaker3);
	speakerCollection.add(speaker4);
	
	for(Speaker ref:speakerCollection) {
		System.out.println(ref);
	}
	
	System.out.println("=======================================================");
	Comparator<Speaker> comparatorNameAsc=new SpeakerNameAsc();
	Collections.sort(speakerCollection,comparatorNameAsc);
	System.out.println("after sorting name in ascending order");
	for(Speaker name:speakerCollection) {
		System.out.println(name);
	}
	System.out.println("=======================================================");
	System.out.println("after sorting name in descending order");
	Comparator<Speaker> comparatorNameDesc=new SpeakerNameDesc();
	Collections.sort(speakerCollection,comparatorNameDesc);
	for(Speaker name:speakerCollection) {
		System.out.println(name);
	}
	System.out.println("=======================================================");
	System.out.println("after sorting cost in ascending order");
	Comparator<Speaker> comparatorCostAsc=new SpeakerCostAsc();
	Collections.sort(speakerCollection,comparatorCostAsc);
	for(Speaker cost:speakerCollection) {
		System.out.println(cost);
	}
	System.out.println("=======================================================");
	System.out.println("after sorting cost in descending order");
	Comparator<Speaker> comparatorCostDesc=new SpeakerCostDesc();
	Collections.sort(speakerCollection,comparatorCostDesc);
	for(Speaker cost:speakerCollection) {
		System.out.println(cost);
	}
	System.out.println("=======================================================");
	Comparator<Speaker> comparatorSoundAsc=new SpeakerSoundAsc();
	System.out.println("after sorting sound in ascending order");
	Collections.sort(speakerCollection,comparatorSoundAsc);
	for(Speaker sound:speakerCollection) {
		System.out.println(sound);
	}
	System.out.println("=======================================================");
	Comparator<Speaker> comparatorSoundDesc=new SpeakerSoundDesc();
	System.out.println("after sorting sound in descending order");
	Collections.sort(speakerCollection,comparatorSoundDesc);
	for(Speaker sound:speakerCollection) {
		System.out.println(sound);
	}
	
	System.out.println("=======================================================");
    Comparator<Speaker> comparatorFrequencyAsc=new SpeakerFrequencyAsc();
    Collections.sort(speakerCollection,comparatorFrequencyAsc);
    System.out.println("after sorting frequency in ascending order");
    for(Speaker frequency:speakerCollection) {
    	System.out.println(frequency);
    }
    
    System.out.println("=======================================================");
    Comparator<Speaker> comparatorFrequencyDesc=new SpeakerFrequencyDesc();
    Collections.sort(speakerCollection,comparatorFrequencyDesc);
    System.out.println("after sorting frequency in descending order");
    for(Speaker frequency:speakerCollection) {
    	System.out.println(frequency);
    }
}
}
