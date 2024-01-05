package com.xworkz.collection.collectionprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Airports {
	public static void main(String[] args) {
	String[] airportNames = {
            "John F. Kennedy International Airport",
            "Heathrow Airport",
            "Los Angeles International Airport",
            "Tokyo Haneda Airport",
            "Paris Charles de Gaulle Airport",
            "Dubai International Airport",
            "Beijing Capital International Airport",
            "O'Hare International Airport",
            "Frankfurt Airport",
            "Singapore Changi Airport",
            "Sydney Kingsford Smith Airport",
            "Hong Kong International Airport",
            "Denver International Airport",
            "Toronto Pearson International Airport",
            "San Francisco International Airport",
            "Amsterdam Schiphol Airport",
            "Seoul Incheon International Airport",
            "Munich Airport",
            "Dallas/Fort Worth International Airport",
            "Barcelona–El Prat Airport",
            "Rome Fiumicino Airport",
            "Istanbul Airport",
            "Hartsfield-Jackson Atlanta International Airport",
            "Suvarnabhumi Airport",
            "Shanghai Pudong International Airport",
            "Vancouver International Airport",
            "Zurich Airport",
            "Madrid–Barajas Adolfo Suárez Airport",
            "San Diego International Airport",
            "Dublin Airport",
            "Minneapolis–Saint Paul International Airport",
            "Manchester Airport",
            "Vienna International Airport",
            "Brussels Airport",
            "Seattle–Tacoma International Airport",
            "Mexico City International Airport",
            "Kuala Lumpur International Airport",
            "Abu Dhabi International Airport",
            "Mumbai Chhatrapati Shivaji Maharaj International Airport",
            "Copenhagen Airport",
            "Athens International Airport",
            "Phoenix Sky Harbor International Airport",
            "Detroit Metropolitan Wayne County Airport",
            "Brisbane Airport",
            "Johannesburg OR Tambo International Airport",
            "Moscow Sheremetyevo International Airport",
            "Munich Airport",
            "Oslo Gardermoen Airport",
            "Stockholm Arlanda Airport",
            "Doha Hamad International Airport",
            "Guangzhou Baiyun International Airport",
            "Perth Airport",
            "Philadelphia International Airport",
            "Boston Logan International Airport",
            "Melbourne Tullamarine Airport",
            "São Paulo/Guarulhos–Governador André Franco Montoro International Airport",
            "Warsaw Chopin Airport",
            "Helsinki-Vantaa Airport",
            "Marseille Provence Airport",
            "Geneva Airport",
            "Berlin Brandenburg Airport",
            "Cairo International Airport",
            "Bengaluru Kempegowda International Airport",
            "Raleigh-Durham International Airport",
            "Newark Liberty International Airport",
            "Washington Dulles International Airport",
            "Nice Côte d'Azur Airport",
            "Salt Lake City International Airport",
            "Lisbon Humberto Delgado Airport",
            "Stuttgart Airport",
            "Calgary International Airport",
            "Baltimore/Washington International Thurgood Marshall Airport",
            "Ottawa Macdonald–Cartier International Airport",
            "Tampa International Airport",
            "Budapest Ferenc Liszt International Airport",
            "Austin-Bergstrom International Airport",
            "Athens Eleftherios Venizelos International Airport",
            "Auckland Airport",
            "Cologne Bonn Airport",
            "Cancún International Airport",
            "Birmingham Airport",
            "Edmonton International Airport",
            "Nashville International Airport",
            "Pittsburgh International Airport",
            "Montreal Pierre Elliott Trudeau International Airport",
            "Brasília International Airport",
            "Adelaide Airport",
            "San Jose International Airport",
            "Lyon-Saint-Exupéry Airport",
            "Christchurch Airport",
            "Fort Lauderdale-Hollywood International Airport",
            "St. Petersburg/Clearwater International Airport"};
	
	Collection<String> collection=new ArrayList<>();
	for(int i=0;i<airportNames.length;i++) {
		collection.add(airportNames[i]);
	}
	Iterator<String> ref=collection.iterator();
	while(ref.hasNext()) {
		String temp=ref.next();
		System.out.println(temp.toUpperCase());
	}
}
}
