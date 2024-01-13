package com.xworkz.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.sorting.ThreadDto;

public class ThreadBegin {
public static void main(String[] args) {
	ThreadDto threadDto=new ThreadDto(20, "red", 5, "thread");
	ThreadDto threadDto1=new ThreadDto(15, "black", 6, "cloth");
	ThreadDto threadDto2=new ThreadDto(25, "orange", 2, "plastic");
	ThreadDto threadDto3=new ThreadDto(30, "yellow", 1, "poyster");
	ThreadDto threadDto4=new ThreadDto(10, "white", 9, "thread");
	
	List<ThreadDto> list=new ArrayList<>();
	list.add(threadDto);	
	list.add(threadDto1);	
	list.add(threadDto2);	
	list.add(threadDto3);	
	list.add(threadDto4);
	
	Collections.sort(list);
	
	for(ThreadDto ref:list) {
		System.out.println(ref);
	}
}
}
