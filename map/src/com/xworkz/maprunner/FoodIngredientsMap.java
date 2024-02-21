package com.xworkz.maprunner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class FoodIngredientsMap {
public static void main(String[] args) {
	Map<String, String[]> foodIngredientsMap=new HashMap<>();
	String[] ingredients= {"masala","chicken","salt","chilli"};
	foodIngredientsMap.put("chicken kabab", ingredients);
	String[] parotaIngredients= {"water","wheat","salt"};
	foodIngredientsMap.put("Parota", parotaIngredients);
	String[] puriIngredients= {"salt","water","kornflower"};
	foodIngredientsMap.put("puri", puriIngredients);
	
	System.out.println("list of keys");
	Set<String> key=foodIngredientsMap.keySet();
	key.forEach(l->System.out.println(l));
	
	System.out.println("===================================");
	System.out.println("list of values");
	Collection<String[]> ingredientsCollection=foodIngredientsMap.values();
	ingredientsCollection.forEach(list->{
	for(String i:list) {
	System.out.println(i);
	}
	});
	
}
}
