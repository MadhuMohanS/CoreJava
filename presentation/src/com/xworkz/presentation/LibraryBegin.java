package com.xworkz.presentation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//interface Library{
//	int silence(int x);
//}
interface Library{
	int silence(int i);
}

public class LibraryBegin {
public static void main(String[] args) {
//	Library ref=(t)-> {
//			// TODO Auto-generated method stub
//			System.out.println("running silence in main "+t);
//			return 10;
//	};
//	
//	int var=ref.silence(20);
//	System.out.println(var);
	
	Library library=(i)-> {
		System.out.println("running silence in main "+i);
	  return 20;
	};
	

	
int ref=library.silence(10);
System.out.println(ref);


	
}
}
