package com.xworkz.customersinfo;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerBegin {
public static void main(String[] args) {
	String[] items= {"apples","milk","banana"};
	CustomerDto customerDto=new CustomerDto("c1", items, 300);
	 String[] items1 = {"apples", "eggs", "cheese"};
     CustomerDto customerDto1 = new CustomerDto("c2", items1, 150);

     String[] items2 = {"coffee", "sugar", "tea"};
     CustomerDto customerDto2 = new CustomerDto("c3", items2, 80);

     String[] items3 = {"apples", "rice", "vegetables"};
     CustomerDto customerDto3 = new CustomerDto("c4", items3, 250);

     String[] items4 = {"orange juice", "cereal", "milk"};
     CustomerDto customerDto4 = new CustomerDto("c5", items4, 120);

     String[] items5 = {"cookies", "chips", "soda"};
     CustomerDto customerDto5 = new CustomerDto("c6", items5, 70);

     String[] items6 = {"beef", "apples", "tomato sauce"};
     CustomerDto customerDto6 = new CustomerDto("c7", items6, 180);

     String[] items7 = {"apples", "apples", "granola bars"};
     CustomerDto customerDto7 = new CustomerDto("c8", items7, 100);

     String[] items8 = {"salmon", "quinoa", "asparagus"};
     CustomerDto customerDto8 = new CustomerDto("c9", items8, 300);

     String[] items9 = {"bagels", "cream cheese", "lox"};
     CustomerDto customerDto9 = new CustomerDto("c10", items9, 90);

     String[] items10 = {"peanut butter", "apples", "bread"};
     CustomerDto customerDto10 = new CustomerDto("c11", items10, 60);
     
     List<CustomerDto> list=new ArrayList<CustomerDto>();
     list.add(customerDto);
     list.add(customerDto1);
     list.add(customerDto2);
     list.add(customerDto3);
     list.add(customerDto4);
     list.add(customerDto5);
     list.add(customerDto6);
     list.add(customerDto7);
     list.add(customerDto8);
     list.add(customerDto9);
     list.add(customerDto10);
     
     System.out.println("Customer Name\t Items\t Bill");
     
     for(int i=0;i<list.size();i++) {
    	 System.out.print(list.get(i).getName()+" ");
    	 for(String j:list.get(i).getItems()) {
    		 System.out.print(j+" ");
    	 }
    	 System.out.print(list.get(i).getBill());
    	 System.out.println();
     }
     List<String> itemsList=new ArrayList<String>();
     list.stream().map(CustomerDto::getItems).forEach(t->{
    	 for(String i:t) {
    		 itemsList.add(i);
    	 }
     });
     
     int max_count=0;
     String maxFreq="";
     for(int i=0;i<itemsList.size();i++) {
    	int count=0;
    	for(int j=0;j<itemsList.size();j++) {
    		if(itemsList.get(i).equals(itemsList.get(j))) {
    			count++;
    		}
    	}
    	if(count>max_count) {
    		max_count=count;
    		maxFreq=itemsList.get(i);
    	}
     }
     System.out.println("most sold item is:"+maxFreq);
}
}
