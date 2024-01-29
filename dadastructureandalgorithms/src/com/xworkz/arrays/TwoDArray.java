package com.xworkz.arrays;

import java.util.Scanner;

public class TwoDArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
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
}
}
