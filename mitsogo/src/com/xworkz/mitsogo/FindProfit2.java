package com.xworkz.mitsogo;

import java.util.Scanner;

public class FindProfit2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int uniqueID[]=new int[n];
	int m=sc.nextInt();
	int profit[]=new int[m];
	
	for(int i=0;i<uniqueID.length;i++) {
		uniqueID[i]=sc.nextInt();
	}
	
	for(int i=0;i<profit.length;i++) {
		profit[i]=sc.nextInt();
	}
	
	int max_value=0,ans=0;
	for(int i=0;i<n;i++) {
		max_value=Math.max(max_value, profit[i]);
		for(int j=i+1;j<n;j++) {
			if(uniqueID[i]==uniqueID[j]) {
				max_value=Math.max(max_value, profit[j]);
			}else {
				i=j-1;
				break;
			}
		}
		ans+=max_value;
		max_value=0;
	}
	System.out.println(ans);
	
}
}
