package com.xworkz.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiseaseBegin {
public static void main(String[] args) {
	DiseaseDto diseaseDto=new DiseaseDto("malariya", "head ache", 10, "acts");
	DiseaseDto diseaseDto1=new DiseaseDto("dengue", "body pains", 15, "aspirin");
	DiseaseDto diseaseDto2=new DiseaseDto("h1n1", "vomit", 5, "tamiflu");
	DiseaseDto diseaseDto3=new DiseaseDto("pneumonia", "vomit", 20, "zithromax");
	DiseaseDto diseaseDto4=new DiseaseDto("ebola", "fever", 20, "inmazeb");
	
	List<DiseaseDto> list=new ArrayList<>();
	list.add(diseaseDto);
	list.add(diseaseDto1);
	list.add(diseaseDto2);
	list.add(diseaseDto3);
	list.add(diseaseDto4);
	
	System.out.println("after sorting name in ascending order");
	Collections.sort(list);
	list.forEach(l->System.out.println(l));
	
	System.out.println("after sorting name in descending order");
	Collections.sort(list,(n1,n2)->n2.getName().compareTo(n1.getName()));
	list.forEach(l->System.out.println(l));
	
	System.out.println("after sorting symptoms in ascending order");
	Collections.sort(list,(s1,s2)->s1.getSymptoms().compareTo(s2.getSymptoms()));
	list.forEach(l->System.out.println(l));
	
	System.out.println("after sorting symptoms in descending order");
	Collections.sort(list,(s1,s2)->s2.getSymptoms().compareTo(s1.getSymptoms()));
	list.forEach(l->System.out.println(l));
	
	System.out.println("after sorting affected days in ascending order");
	Collections.sort(list,(a1,a2)->Integer.compare(a1.getAffecteddays(), a2.getAffecteddays()));
	list.forEach(l->System.out.println(l));
	
	System.out.println("after sorting affected days in descending order");
	Collections.sort(list,(a1,a2)->Integer.compare(a2.getAffecteddays(), a1.getAffecteddays()));
	list.forEach(l->System.out.println(l));
	
}
}
