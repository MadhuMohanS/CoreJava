package com.xworkz.collectionpractise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifferenceUsingList {
	public static void main(String[] args) {
	int[][] arr=new int[3][3];
	List<List<Integer>> listofLists=new ArrayList<List<Integer>>();
	Scanner sc=new Scanner(System.in);

	List<Integer> list1=new ArrayList<Integer>();
	list1.add(1);
	list1.add(2);
	list1.add(3);
	
	listofLists.add(list1);
	
	List<Integer> list2=new ArrayList<Integer>();
	list2.add(4);
	list2.add(5);
	list2.add(6);
	
	listofLists.add(list2);
	List<Integer> list3=new ArrayList<Integer>();
	list3.add(7);
	list3.add(8);
	list3.add(10);
	
	listofLists.add(list3);
	
	
	int leftSum=0,rightSum=0;
//	System.out.println(listofLists.get(0).get(0));
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			if(i==j) {
			leftSum+=listofLists.get(i).get(j);	
			}
			if(i==3-j-1) {
				rightSum+=listofLists.get(i).get(j);
			}
		}
		
	}
	
//	for(int i=0;i<3;i++) {
//		for(int j=3;j>=0;j--) {
//			rightSum+=arr[i][j-1];	
//		}
//		
//	}
//	int i=0,j=2;
//	for(int k=0;k<3;k++) {
//		if(i<3 || j>=0)
//		rightSum+=arr[i++][j--];
//	}
//	int rightSum=arr[0][2]+arr[1][1]+arr[2][0];
	
	int diff=leftSum-rightSum;
	System.out.println(diff);
}
}
