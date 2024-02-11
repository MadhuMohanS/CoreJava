package com.xworkz.collectionpractise.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.lambda.comparator.SkyWalkDto;

public class SkyWalkBegin {
public static void main(String[] args) {
	SkyWalkDto skyWalkDto=new SkyWalkDto("davangere","building", 10, "iron");
	SkyWalkDto skyWalkDto1=new SkyWalkDto("hubli","school", 20, "silver");
	SkyWalkDto skyWalkDto2=new SkyWalkDto("banglore","office", 30, "copper");
	SkyWalkDto skyWalkDto3=new SkyWalkDto("chennai","institute", 25, "iron");
	SkyWalkDto skyWalkDto4=new SkyWalkDto("tirupathi","temple", 100, "mud");
	
	List<SkyWalkDto> list=new ArrayList<>();
	list.add(skyWalkDto);
	list.add(skyWalkDto1);
	list.add(skyWalkDto2);
	list.add(skyWalkDto3);
	list.add(skyWalkDto4);
	
	Comparator<SkyWalkDto> placeAsc=(p1,p2)->{
		return p1.getPlace().compareTo(p2.getPlace());
	};
	
	System.out.println("after sorting place in ascending order");
	Collections.sort(list,placeAsc);
	
	for(SkyWalkDto ref:list) {
		System.out.println(ref);
	}
	
	Comparator<SkyWalkDto> placeDesc=(p1,p2)->{
		return p2.getPlace().compareTo(p1.getPlace());
	};
	
	Collections.sort(list,placeDesc);
	System.out.println("after sorting place in descending order");
	
	for(SkyWalkDto ref:list) {
		System.out.println(ref);
	}
	
	Comparator<SkyWalkDto> connectAsc=(c1,c2)->{
		return c1.getConnect().compareTo(c2.getConnect());
	};
	
	Collections.sort(list,connectAsc);
	System.out.println("after sorting connect in ascending order");
	
	for(SkyWalkDto ref:list) {
		System.out.println(ref);
	}
	
	Comparator<SkyWalkDto> connectDesc=(c1,c2)->{
		return c2.getConnect().compareTo(c1.getConnect());
	};
	
	Collections.sort(list,connectDesc);
	System.out.println("after sorting connect in descending order");
	
	for(SkyWalkDto ref:list) {
		System.out.println(ref);
	}
	
	Comparator<SkyWalkDto> stepAsc=(s1,s2)->{
		return Integer.compare(s1.getSteps(), s2.getSteps());
	};
	
	Collections.sort(list,stepAsc);
    System.out.println("after sorting steps in ascending order");
	
	for(SkyWalkDto ref:list) {
		System.out.println(ref);
	}
	
	Comparator<SkyWalkDto> stepsDesc=(s1,s2)->{
		return Integer.compare(s2.getSteps(), s1.getSteps());
	};
	
	Collections.sort(list,stepsDesc);
System.out.println("after sorting steps in descending order");
	
	for(SkyWalkDto ref:list) {
		System.out.println(ref);
	}
	
	Comparator<SkyWalkDto> typeAsc=(t1,t2)->{
		return t1.getType().compareTo(t2.getType());
	};
	Collections.sort(list,typeAsc);
	System.out.println("after sorting type in ascending order");
	for(SkyWalkDto ref:list) {
		System.out.println(ref);
	}
	
	Comparator<SkyWalkDto> typeDesc=(t1,t2)->{
		return t2.getType().compareTo(t1.getType());
	};
	Collections.sort(list,typeDesc);
	System.out.println("after sorting type in descending order");
	for(SkyWalkDto ref:list) {
		System.out.println(ref);
	}
	
	
}
}
