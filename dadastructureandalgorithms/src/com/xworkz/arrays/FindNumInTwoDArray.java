package com.xworkz.arrays;

import java.util.Scanner;

public class FindNumInTwoDArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	boolean flag=false;
	int ro=0,co=0;
	int rows=sc.nextInt();
	int cols=sc.nextInt();
	int[][] array=new int[rows][cols];
	
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			array[i][j]=sc.nextInt();
		}
	}
	System.out.println("elements are:");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.print(array[i][j]+" ");
		}
		System.out.println();
	}
	
	System.out.println("enter search element");
	int search=sc.nextInt();
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			if(array[i][j]==search) {
				flag=true;
			    ro=i;
			    co=j;
			    break;
			}
		}
	}
	if(flag) {
		System.out.println("element "+search+" found at:"+ro+" "+co);
	}else {
		System.out.println("element was not found");
	}
}
}
