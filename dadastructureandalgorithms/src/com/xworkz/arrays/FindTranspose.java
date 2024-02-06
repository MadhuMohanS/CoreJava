package com.xworkz.arrays;

import java.util.Scanner;

public class FindTranspose {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	int col=sc.nextInt();
	int numbers[][]=new int[row][col];
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			numbers[i][j]=sc.nextInt();
		}
	}
	System.out.println("matrix in transpose are");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
	System.out.print(numbers[j][i]+" ");	
		}
		System.out.println();
	}
}
}
