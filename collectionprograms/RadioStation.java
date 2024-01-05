package com.xworkz.collection.collectionprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.collectionprograms.*;
public class RadioStation {

	public static void main(String[] args) {
		Collection<String> collection=new ArrayList<String>();
	//interface<datatype> ref=new implementationclass();	
		collection.add("RadioCity");
		collection.add("electric radio");
		collection.add("theydal fm");
		collection.add("cologne radio");
		collection.add("deccan radio");
		collection.add("fever");
		collection.add("red fm");
		collection.add("aamaar fm");
		collection.add("candid");
		collection.add("orange fi");
		
		Iterator<String> ref=collection.iterator();
	//interface<datatype> ref=ref.method();	
		while(ref.hasNext()) {
			String refString=ref.next();
			System.out.println("element :"+refString);
			if(refString.endsWith("i")) {
				System.out.println(refString+" ending with: i");
			}else {
				System.out.println(refString+" not ending with: i");
			}
		}
		
//		Collection<Integer> integerCollection=new ArrayList<Integer>();

	}

}
