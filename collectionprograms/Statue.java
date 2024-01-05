package com.xworkz.collection.collectionprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Statue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Collection<String> statue=new ArrayList<>();
	        statue.add("Kempegowda");
	        statue.add("kaveri");
	        statue.add("rayanna");
	        statue.add("chennamma");
	        statue.add("unity");
	        statue.add("make in india");
	        statue.add("kuvempu");
	        statue.add("ambedkar");
	        statue.add("visweswarayya");
	        statue.add("kaariyappa");
	        statue.add("bhuvaneshwari");
	        statue.add("gandhi");
	        statue.add("vallabhay patel");
	        statue.add("statue of liberty");
	        statue.add("budda");
	        statue.add("adhiyogi shiva");
	        statue.add("lord murugan ");
	        statue.add("shivaji maharaj");
	        statue.add("hanuman");
	        statue.add("basava");
	        statue.add("basavanna");
	        statue.add("Dr.rajkumar");
	        statue.add("dr.vishnuvardhan");
	        statue.add("dr.ambarish");
	        statue.add("shankarnag");
	        statue.add("appu");
	        statue.add("vivekananda");
	        statue.add("indira gandhi");
	        statue.add("rajeev gandhi");
	        statue.add("kaveri");
	        statue.add("bahubali");
	        statue.add("neharu");
	        statue.add("mother teresa");
	        statue.add("bhagath singh");
	        statue.add("sachin tendulkar");
	        statue.add("subash chandra bose");
	        statue.add("veer savarkar");
	        statue.add("mangal pandy");
	        statue.add("rani lakshmibhai");
	        statue.add("KGF garuda");
	        statue.add("kengal hanumantayya");
	        statue.add("devaraj urs");
	        statue.add("HD devegowda");
	        statue.add("rajeev gandhi");
	        statue.add("jawaharlal nehru");
	        statue.add("nada prabhu kempegowda");
	        statue.add("krantiveera sangolli rayanna");
	        statue.add("MGR");
	        statue.add("Krishnadevaraya");
	        statue.add("wadeyar");
	        statue.add("wadeyaR");
	        
	        Iterator<String> ref=statue.iterator();
	        
	        while(ref.hasNext()) {
	        	String temp=ref.next();
	        	if(temp.endsWith("r")) {
	        		System.out.println(temp+" ends with r");
	        	}
	        }
	        

	}

}

     



