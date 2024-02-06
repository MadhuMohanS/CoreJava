package com.xworkz.arrays;

import java.util.Scanner;

public class PrintSpiralOrder {
public static void main(String[] args) {
	int row,col;
	Scanner sc=new Scanner(System.in);
	row=sc.nextInt();
	col=sc.nextInt();
	int[][] numbers=new int[row][col];
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			numbers[i][j]=sc.nextInt();
		}
	}
	System.out.println("elements are:");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			System.out.print(numbers[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
