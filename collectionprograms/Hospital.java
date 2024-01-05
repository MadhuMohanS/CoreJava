package com.xworkz.collection.collectionprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Hospital {

	public static void main(String[] args) {
		

        Collection<String> hospitaalName=new ArrayList<String>();
        hospitaalName.add("Apoorva");
        hospitaalName.add("Jaydeva");
        hospitaalName.add("Narayana");
        hospitaalName.add("Subbaia");
        hospitaalName.add("Bhapuji");
        hospitaalName.add("vasan eye care");
        hospitaalName.add("C G ");
        hospitaalName.add("Maxx");
        hospitaalName.add("sarji");
        hospitaalName.add("Suboday");
        hospitaalName.add("Shreya");
        hospitaalName.add("Unity");
        hospitaalName.add("City Central");
        hospitaalName.add("Sparsha");
        hospitaalName.add("Megghan");
        hospitaalName.add("S S");
        hospitaalName.add("Manipal");
        hospitaalName.add("N Pai");
        hospitaalName.add("Apoolo");
        hospitaalName.add("ApoolO");

        Iterator<String> iterator = hospitaalName.iterator();
        while (iterator.hasNext()) {
			String temp=iterator.next();
			if(temp.endsWith("o") || temp.endsWith("O")) {
				System.out.println(temp+" ends with o or O");
			}
		}

	}

}
