package com.xworkz.mapabstractmethods;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BankBranchMap {
public static void main(String[] args) {
	BankDto bankDto=new BankDto("icici", 123);
	BranchDto branchDto=new BranchDto("banglore", "ramesh");
	
	BankDto bankDto1=new BankDto("canara", 113);
	BranchDto branchDto1=new BranchDto("banglore", "suresh");
	BankDto bankDto2=new BankDto("bank of baroda", 102);
	BranchDto branchDto2=new BranchDto("davangere", "vignesh");
	BankDto bankDto3=new BankDto("yes", 900);
	BranchDto branchDto3=new BranchDto("mysore", "sathish");
	BankDto bankDto4=new BankDto("punjab national ", 444);
	BranchDto branchDto4=new BranchDto("gulbarga", "lokesh");
	
	Map<BankDto, BranchDto> bankBranchMap=new HashMap<>();
	bankBranchMap.put(bankDto, branchDto);
	bankBranchMap.put(bankDto1, branchDto1);
	bankBranchMap.put(bankDto2, branchDto2);
	bankBranchMap.put(bankDto3, branchDto3);
	
	bankBranchMap.put(bankDto4, branchDto4);
	
	bankBranchMap.forEach((k,v)->System.out.println(k+":"+v));
	
Set<Map.Entry<BankDto, BranchDto>> mapEntries=bankBranchMap.entrySet();

System.out.println("-----------------------keys and values------------");

mapEntries.forEach(l->System.out.println(l.getKey()+":"+l.getValue()));

System.out.println("contains key");
System.out.println(bankBranchMap.containsKey(bankDto3));

System.out.println("contains value");
System.out.println(bankBranchMap.containsValue(branchDto4));
System.out.println("get method");
System.out.println(bankBranchMap.get(bankDto4));

System.out.println("after replacing bankdto4 with branchdto3");
bankBranchMap.replace(bankDto4, branchDto3);
bankBranchMap.forEach((k,v)->System.out.println(k+":"+v));

System.out.println("is empty method");
System.out.println(bankBranchMap.isEmpty());


}
}
