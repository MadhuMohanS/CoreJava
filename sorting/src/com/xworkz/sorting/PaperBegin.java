package com.xworkz.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.sorting.comparatorprograms.PaperChannelAsc;
import com.xworkz.sorting.comparatorprograms.PaperChannelDesc;
import com.xworkz.sorting.comparatorprograms.PaperCostAsc;
import com.xworkz.sorting.comparatorprograms.PaperCostDesc;
import com.xworkz.sorting.comparatorprograms.Paper;
import com.xworkz.sorting.comparatorprograms.PaperNameAsc;
import com.xworkz.sorting.comparatorprograms.PaperNameDesc;
import com.xworkz.sorting.comparatorprograms.PaperStartedAsc;
import com.xworkz.sorting.comparatorprograms.PaperStartedDesc;
import com.xworkz.sorting.comparatorprograms.SpeakerSoundAsc;

public class PaperBegin{

	public static void main(String[] args) {
		Paper paper=new Paper("janathavani", 1999, "janatha", 2);
		Paper paper1=new Paper("prajavani", 1987, "praja", 3.5);
		Paper paper2=new Paper("tv9", 1900, "dina pathrike", 3);
		Paper paper3=new Paper("davanagere", 2000, "davangere", 1);
		Paper paper4=new Paper("sanjavani", 1995, "sanje", 4);
		
		List<Paper> list=new ArrayList<>();
		list.add(paper);
		list.add(paper1);
		list.add(paper2);
		list.add(paper3);
		list.add(paper4);
		
		Comparator<Paper> comparatorNameAsc=new PaperNameAsc();
		Collections.sort(list,comparatorNameAsc);
		System.out.println("after sorting name in ascending order");
		for(Paper name:list) {
			System.out.println(name);
		}
		System.out.println("======================================================");
		
		Comparator<Paper> comparatorNameDesc=new PaperNameDesc();
		Collections.sort(list,comparatorNameDesc);
		System.out.println("after sorting name in descending order");
		for(Paper name:list) {
			System.out.println(name);
		}
		
		System.out.println("======================================================");
        Comparator<Paper> comparatorStartedAsc=new PaperStartedAsc();
        Collections.sort(list,comparatorStartedAsc);
        System.out.println("after sorting started year in ascending order");
		for(Paper year:list) {
			System.out.println(year);
		}
		System.out.println("======================================================");
		
		Comparator<Paper> comparatorStartedDecs=new PaperStartedDesc();
		System.out.println("after sorting started in descending order");
		Collections.sort(list,comparatorStartedDecs);
		for(Paper year:list) {
			System.out.println(year);
		}
		
		System.out.println("======================================================");
		
		Comparator<Paper> comparatorChannelAsc=new PaperChannelAsc();
		System.out.println("after sorting channle in ascending order");
		Collections.sort(list,comparatorChannelAsc);
		for(Paper channle:list) {
			System.out.println(channle);
		}
		
		System.out.println("======================================================");
		Comparator<Paper> comparatorChannelDesc=new PaperChannelDesc();
		System.out.println("after sorting channle in descending order");
		Collections.sort(list,comparatorChannelDesc);
		for(Paper channle:list) {
			System.out.println(channle);
		}
		System.out.println("======================================================");
		
		Comparator<Paper> comparatorCostAsc=new PaperCostAsc();
		Collections.sort(list,comparatorCostAsc);
		System.out.println("after sorting cost in ascending order");
		for(Paper cost:list) {
			System.out.println(cost);
		}
		System.out.println("======================================================");
		
		Comparator<Paper> comparatorCostDesc=new PaperCostDesc();
		Collections.sort(list,comparatorCostDesc);
		System.out.println("after sorting cost in descending order");
		for(Paper cost:list) {
			System.out.println(cost);
		}
		
		
		
	}
	
	

}
