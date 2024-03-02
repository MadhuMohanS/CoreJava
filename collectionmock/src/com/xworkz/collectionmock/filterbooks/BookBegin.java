package com.xworkz.collectionmock.filterbooks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BookBegin {
public static void main(String[] args) {
	BookDto bookDto=new BookDto("chalana chitra","horror", 1995, "kuvempu", 3.5, 100);
	BookDto bookDto1=new BookDto("sanchalana","comedy", 1998, "d r bendre", 4, 150);
	BookDto bookDto2=new BookDto("makkalselvan","comedy", 1940, "marks", 3.2, 200);
	BookDto bookDto3=new BookDto("sllpingdoll","thriller", 2000, "marks", 3.1, 50);
	BookDto bookDto4=new BookDto("jummanthar","thriller", 1999, "sathish", 2.8, 120);
	
	List<BookDto> list=new ArrayList<>();
	list.add(bookDto);
	list.add(bookDto1);
	list.add(bookDto2);
	list.add(bookDto3);
	list.add(bookDto4);
	
	System.out.println("filter by genre comedy");
	
	list.stream().filter(l->l.getGenre().equals("comedy")).forEach(l->System.out.println(l));
	
	
	System.out.println("filter book by range from 1995 and 2000");
	list.stream().filter(l->l.getPublicationYear()>1995 && l.getPublicationYear()<2000).forEach(l->System.out.println(l));
	
	System.out.println("filter books written by marks");
 System.out.println(list.stream().filter(l->l.getAuthor()=="marks").count());
 
 System.out.println("find book by highest rating");
List<BookDto> ratings= list.stream().sorted((p1,p2)->Double.compare(p2.getRating(), p1.getRating())).collect(Collectors.toList());

System.out.println(ratings.get(0));
 

System.out.println("total price of all books");
List<Double> price=  list.stream().map(l->l.getPrice()).collect(Collectors.toList());
double sum=0;
for(double i:price) {
       sum+=i;
}
System.out.println(sum);
	
	
}
}
