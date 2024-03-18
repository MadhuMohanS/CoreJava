package com.xworkz.collectionpractise;

import java.util.Scanner;

public class DiagonalDifference {
public static void main(String[] args) {
	int[][] arr=new int[3][3];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array elements");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	int leftSum=0,rightSum=0;
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			if(i==j) {
			leftSum+=arr[i][j];	
			}
		}
		
	}
	
//	for(int i=0;i<3;i++) {
//		for(int j=3;j>=0;j--) {
//			rightSum+=arr[i][j-1];	
//		}
//		
//	}
	int i=0,j=2;
	for(int k=0;k<3;k++) {
		if(i<3 || j>=0)
		rightSum+=arr[i++][j--];
	}
//	int rightSum=arr[0][2]+arr[1][1]+arr[2][0];
	
	int diff=leftSum-rightSum;
	System.out.println(diff);
	
	
	
	
}
}
