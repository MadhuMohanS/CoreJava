package com.xworkz.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.sorting.comparatorprograms.PaperChannelAsc;
import com.xworkz.sorting.comparatorprograms.PaperChannelDesc;
import com.xworkz.sorting.comparatorprograms.PaperCostAsc;
import com.xworkz.sorting.comparatorprograms.PaperCostDesc;
import com.xworkz.sorting.comparatorprograms.PaperDto;
import com.xworkz.sorting.comparatorprograms.PaperNameAsc;
import com.xworkz.sorting.comparatorprograms.PaperNameDesc;
import com.xworkz.sorting.comparatorprograms.PaperStartedAsc;
import com.xworkz.sorting.comparatorprograms.PaperStartedDesc;
import com.xworkz.sorting.comparatorprograms.SpeakerSoundAsc;

public class PaperBegin{

	public static void main(String[] args) {
		PaperDto paper=new PaperDto("janathavani", 1999, "janatha", 2);
		PaperDto paper1=new PaperDto("prajavani", 1987, "praja", 3.5);
		PaperDto paper2=new PaperDto("tv9", 1900, "dina pathrike", 3);
		PaperDto paper3=new PaperDto("davanagere", 2000, "davangere", 1);
		PaperDto paper4=new PaperDto("sanjavani", 1995, "sanje", 4);
		
		List<PaperDto> list=new ArrayList<>();
		list.add(paper);
		list.add(paper1);
		list.add(paper2);
		list.add(paper3);
		list.add(paper4);
		
		Comparator<PaperDto> comparatorNameAsc=new PaperNameAsc();
		Collections.sort(list,comparatorNameAsc);
		System.out.println("after sorting name in ascending order");
		for(PaperDto name:list) {
			System.out.println(name);
		}
		System.out.println("======================================================");
		
		Comparator<PaperDto> comparatorNameDesc=new PaperNameDesc();
		Collections.sort(list,comparatorNameDesc);
		System.out.println("after sorting name in descending order");
		for(PaperDto name:list) {
			System.out.println(name);
		}
		
		System.out.println("======================================================");
        Comparator<PaperDto> comparatorStartedAsc=new PaperStartedAsc();
        Collections.sort(list,comparatorStartedAsc);
        System.out.println("after sorting started year in ascending order");
		for(PaperDto year:list) {
			System.out.println(year);
		}
		System.out.println("======================================================");
		
		Comparator<PaperDto> comparatorStartedDecs=new PaperStartedDesc();
		System.out.println("after sorting started in descending order");
		Collections.sort(list,comparatorStartedDecs);
		for(PaperDto year:list) {
			System.out.println(year);
		}
		
		System.out.println("======================================================");
		
		Comparator<PaperDto> comparatorChannelAsc=new PaperChannelAsc();
		System.out.println("after sorting channle in ascending order");
		Collections.sort(list,comparatorChannelAsc);
		for(PaperDto channle:list) {
			System.out.println(channle);
		}
		
		System.out.println("======================================================");
		Comparator<PaperDto> comparatorChannelDesc=new PaperChannelDesc();
		System.out.println("after sorting channle in descending order");
		Collections.sort(list,comparatorChannelDesc);
		for(PaperDto channle:list) {
			System.out.println(channle);
		}
		System.out.println("======================================================");
		
		Comparator<PaperDto> comparatorCostAsc=new PaperCostAsc();
		Collections.sort(list,comparatorCostAsc);
		System.out.println("after sorting cost in ascending order");
		for(PaperDto cost:list) {
			System.out.println(cost);
		}
		System.out.println("======================================================");
		
		Comparator<PaperDto> comparatorCostDesc=new PaperCostDesc();
		Collections.sort(list,comparatorCostDesc);
		System.out.println("after sorting cost in descending order");
		for(PaperDto cost:list) {
			System.out.println(cost);
		}
		
		
		
	}
	
	

}
