package com.xworkz.equalscontract.runner;

import java.util.HashMap;
import java.util.Map;

import com.xworkz.equalscontract.InventedPersonDto;
import com.xworkz.equalscontract.ProgrammingLanguageDto;

public class ProgramInventorMap {
public static void main(String[] args) {
	ProgrammingLanguageDto programmingLanguageDto=new ProgrammingLanguageDto("java", 1.8, 1985);
	InventedPersonDto inventedPersonDto=new InventedPersonDto("james gosling", 70, "software negineer");
	
	ProgrammingLanguageDto programmingLanguageDto2 = new ProgrammingLanguageDto("Python", 3.9, 1991);
	InventedPersonDto inventedPersonDto2 = new InventedPersonDto("Guido van Rossum", 65, "computer programmer");

	ProgrammingLanguageDto programmingLanguageDto3 = new ProgrammingLanguageDto("JavaScript", 1.0, 1995);
	InventedPersonDto inventedPersonDto3 = new InventedPersonDto("Brendan Eich", 60, "computer scientist");

	ProgrammingLanguageDto programmingLanguageDto4 = new ProgrammingLanguageDto("C++", 98, 1985);
	InventedPersonDto inventedPersonDto4 = new InventedPersonDto("Bjarne Stroustrup", 71, "computer scientist");

	ProgrammingLanguageDto programmingLanguageDto5 = new ProgrammingLanguageDto("Ruby", 2.7, 1995);
	InventedPersonDto inventedPersonDto5 = new InventedPersonDto("Yukihiro Matsumoto", 58, "computer scientist");

	ProgrammingLanguageDto programmingLanguageDto6 = new ProgrammingLanguageDto("C#", 7.3, 2000);
	InventedPersonDto inventedPersonDto6 = new InventedPersonDto("Anders Hejlsberg", 61, "software engineer");
	
	ProgrammingLanguageDto programmingLanguageDto7 = new ProgrammingLanguageDto("Go", 1.17, 2009);
	InventedPersonDto inventedPersonDto7 = new InventedPersonDto("Robert Griesemer", 53, "software engineer");

	ProgrammingLanguageDto programmingLanguageDto8 = new ProgrammingLanguageDto("Swift", 5.5, 2014);
	InventedPersonDto inventedPersonDto8 = new InventedPersonDto("Chris Lattner", 43, "computer scientist");

	ProgrammingLanguageDto programmingLanguageDto9 = new ProgrammingLanguageDto("Rust", 1.57, 2010);
	InventedPersonDto inventedPersonDto9 = new InventedPersonDto("Graydon Hoare", 47, "software developer");

	
	Map<ProgrammingLanguageDto, InventedPersonDto> programInventorMap=new HashMap<>();
	programInventorMap.put(programmingLanguageDto, inventedPersonDto);
	
	programInventorMap.put(programmingLanguageDto2, inventedPersonDto2);
	programInventorMap.put(programmingLanguageDto3, inventedPersonDto3);
	programInventorMap.put(programmingLanguageDto4, inventedPersonDto4);
	programInventorMap.put(programmingLanguageDto5, inventedPersonDto5);
	programInventorMap.put(programmingLanguageDto6, inventedPersonDto6);
	programInventorMap.put(programmingLanguageDto7, inventedPersonDto7);
	programInventorMap.put(programmingLanguageDto8, inventedPersonDto8);
	programInventorMap.put(programmingLanguageDto9, inventedPersonDto9);
	
	ProgrammingLanguageDto programmingLanguageDto10 = new ProgrammingLanguageDto("java", 8.1, 1994);
	InventedPersonDto inventedPersonDto10 = new InventedPersonDto("Rasmus Lerdorf", 52, "software engineer");
	
	programInventorMap.put(programmingLanguageDto10, inventedPersonDto10);
	
	programInventorMap.forEach((k,v)->System.out.println(k+" "+v));
}
}
