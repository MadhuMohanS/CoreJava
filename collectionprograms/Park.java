package com.xworkz.collection.collectionprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Park {
public static void main(String[] args) {
	Collection<String> parkNames=new ArrayList<>();
	 parkNames.add("Vishweshwarayya");
     parkNames.add("Central");
     parkNames.add("Golden Gate");
     parkNames.add("Hyde");
     parkNames.add("Yosemite National");
     parkNames.add("Yellowstone National");
     parkNames.add("Grand Canyon National");
     parkNames.add("Everglades National");
     parkNames.add("Banff National");
     parkNames.add("Zion National");
     parkNames.add("Rocky Mountain National");
     parkNames.add("Serengeti National");
     parkNames.add("Denali National");
     parkNames.add("Acadia National");
     parkNames.add("Glacier National");
     parkNames.add("Arches National");
     parkNames.add("Sequoia National");
     parkNames.add("Bryce Canyon National");
     parkNames.add("Grand Teton National");
     parkNames.add("Mount Rainier National");
     parkNames.add("Kruger National");
     parkNames.add("Great Smoky Mountains National");
     parkNames.add("Mesa Verde National");
     parkNames.add("Death Valley National");
     parkNames.add("Joshua Tree National");
     parkNames.add("Redwood National and State");
     parkNames.add("Cuyahoga Valley National ");
     parkNames.add("Great Sand Dunes National");
     parkNames.add("Pinnacles National");
     parkNames.add("Shenandoah National");
     parkNames.add("Waterton Lakes National");
     parkNames.add("Biscayne National");
     parkNames.add("Kakadu National");
     parkNames.add("Haleakalā National");
     parkNames.add("Petrified Forest National");
     parkNames.add("Wind Cave National");
     parkNames.add("Badlands National");
     parkNames.add("Isle Royale National");
     parkNames.add("Lassen Volcanic National");
     parkNames.add("Voyageurs National Park");
     parkNames.add("Canyonlands National Park");
     parkNames.add("Kings Canyon National Park");
     parkNames.add("Hot Springs National Park");
     parkNames.add("black Canyon of the Gunnison National");
     parkNames.add("Theodore Roosevelt National Park");
     parkNames.add("Capitol Reef National Park");
     parkNames.add("Congaree National Park");
     parkNames.add("Virgin Islands National Park");
     parkNames.add("Guadalupe Mountains National Park");
     parkNames.add("Olympic National Park");
     parkNames.add("North Cascades National");
     parkNames.add("big Bend National");
     parkNames.add("Cajas National");
     parkNames.add("Lahemaa National");
     parkNames.add("Göreme National Park");
     parkNames.add("Erawan National Park");
     parkNames.add("Yoho National Park");
     parkNames.add("Mauricie National Park");
     parkNames.add("Jiuzhaigou Valley National");
     parkNames.add("Mesa Verde National");
     parkNames.add("Komodo National");
     parkNames.add("Snowdonia National");
     parkNames.add("Kluane National");
     parkNames.add("Galápagos National");
     parkNames.add("Hwange National");
     parkNames.add("Daintree National");
     parkNames.add("Plitvice Lakes National");
     parkNames.add("Torres del Paine National");
     parkNames.add("Mulu National");
     parkNames.add("Aoraki / Mount Cook National");
     parkNames.add("Kruger National");
     parkNames.add("Yosemite National");
     parkNames.add("Cubbon Park");
     parkNames.add("Childrans");
     parkNames.add("Gas gase");
     parkNames.add("Rock garden");
     parkNames.add("kaziranga National");
     parkNames.add("Bannergatta");
     parkNames.add("Gandi Park");
     parkNames.add("Rammanna setty");
     parkNames.add("Maharaja");
     
     Iterator<String> iterator=parkNames.iterator();
     while(iterator.hasNext()) {
    	 String temp=iterator.next();
    	 if(temp.startsWith("b") || temp.endsWith("k")) {
    	 System.out.println(temp);
    	 }
     }
}
}
