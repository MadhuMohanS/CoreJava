package com.xworkz.mitsogo;

import java.util.Scanner;

public class FindTreeHeight {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] waterL=new int[n];
	int treeHeight=0;
	
	for(int i=0;i<n;i++) {
		waterL[i]=sc.nextInt();
	}
	
	int min=Integer.MAX_VALUE;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
	  if(waterL[j]<min) {
		  min=waterL[j];
	  }
		}
		if(min>treeHeight) {
			treeHeight+=waterL[i];
		}
	}
	System.out.println(treeHeight);
}
}
