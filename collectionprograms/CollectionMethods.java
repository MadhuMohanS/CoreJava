package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.collectionprograms.MovieCollection;

public class CollectionMethods {
public static void main(String[] args) {
	MovieCollection movie=new MovieCollection();
	Collection<String> movieC=movie.movieCollection();
	Iterator iterator=movieC.iterator();
//		while(iterator.hasNext()) {
//			String refString=iterator.next();
//			if(refString.equals("salaar")) {
//				System.out.println("present:"+refString.equals("salaar"));
//			}
//			
//		}
//	while(iterator.hasNext()) {
//		String refString=iterator.next();
//		if(refString.contains("salaar")) {
//			System.out.println("contains:"+refString.contains("salaar"));
//		}
//	}
	
	Collection<String> collection=new ArrayList<String>();
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
	

//for(String ref:movieC) {
//	System.out.println(ref);
//}
	Object[] obArray=collection.toArray();
	
//	for(Object ref:obArray) {
//		System.out.println(ref);
//	}
	
    String[] arrStrings=collection.toArray(new String[collection.size()]);
    for(String ref:arrStrings) {
    	System.out.println(ref);
    }
	
	boolean value=movieC.addAll(collection);//after addAll method we cannot use iterator method because there is differ in the length ,we can only use foreach
//	System.out.println("is radio collection added to movieC:"+value);
//	for(String ref:movieC) {
//		System.out.println(ref);
//	}
	
	
	value=movieC.removeAll(collection);//the movieC will remove the radio collection
//	System.out.println("is collection removed from movieC:"+value);
//	for(String ref:movieC) {
//		System.out.println(ref);
//	}
//	
//	value=movieC.containsAll(collection);
//	System.out.println("is movie contains radio collection:"+value);
//	
//	value=movieC.retainAll(collection);//the movieC will hold the elements which are there in the collection and remaining all will be deleted in the movieC
//	System.out.println("retain:"+value);
//	for(String ref:movieC) {
//		System.out.println(ref);
//	}
	
}

}
