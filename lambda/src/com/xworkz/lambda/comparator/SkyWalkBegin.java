package com.xworkz.lambda.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
	
	for(SkyWalkDto ref:list) {
		System.out.println(ref);
	}
	System.out.println("===================================================");
	Comparator<SkyWalkDto> placeAsc=(p1,p2)->{
		return p1.getPlace().compareTo(p2.getPlace());
	};
	System.out.println("aafter sorting place in asc");
	Collections.sort(list,placeAsc);
	for(SkyWalkDto place:list) {
		System.out.println(place);
	}
	
	System.out.println("===================================================");
	Comparator<SkyWalkDto> placeDesc=(p1,p2)->{
		return p2.getPlace().compareTo(p1.getPlace());
	};
	System.out.println("aafter sorting place in Desc");
	Collections.sort(list,placeDesc);
	for(SkyWalkDto place:list) {
		System.out.println(place);
	}
	
	System.out.println("===================================================");
	System.out.println("aafter sorting connect in asc");
	Comparator<SkyWalkDto> connectAsc=(c1,c2)->{
		return c1.getConnect().compareTo(skyWalkDto2.getConnect());
	};
	Collections.sort(list,connectAsc);
	for(SkyWalkDto connect:list) {
		System.out.println(connect);
	}
	System.out.println("===================================================");
	System.out.println("aafter sorting connect in desc");
	Comparator<SkyWalkDto> connectDesc=(c1,c2)->{
		return c2.getConnect().compareTo(c1.getConnect());
	};
	Collections.sort(list,connectDesc);
	for(SkyWalkDto connect:list) {
		System.out.println(connect);
	}
	System.out.println("===================================================");
	System.out.println("aafter sorting steps in asc");
	Comparator<SkyWalkDto> stepsAsc=(s1,s2)->{
		return Integer.compare(s1.getSteps(),s2.getSteps());
	};
	Collections.sort(list,stepsAsc);
	for(SkyWalkDto steps:list) {
		System.out.println(steps);
	}
	System.out.println("===================================================");
	System.out.println("aafter sorting steps in desc");
	Comparator<SkyWalkDto> stepsDesc=(s1,s2)->{
		return Integer.compare(s2.getSteps(),s1.getSteps());
	};
	Collections.sort(list,stepsDesc);
	for(SkyWalkDto steps:list) {
		System.out.println(steps);
	}
	Comparator<SkyWalkDto> typeAsc=(t1,t2)->{
		return t1.getType().compareTo(t2.getType());
	};
	System.out.println("===================================================");
	System.out.println("aafter sorting type in asc");
	Collections.sort(list,typeAsc);
	for(SkyWalkDto type:list) {
		System.out.println(type);
	}
	
	System.out.println("===================================================");
	Comparator<SkyWalkDto> typeDesc=(t1,t2)->{
		return t2.getPlace().compareTo(t1.getPlace());
	};
	System.out.println("aafter sorting type in Desc");
	Collections.sort(list,typeDesc);
	for(SkyWalkDto type:list) {
		System.out.println(type);
	}
	
}
}
