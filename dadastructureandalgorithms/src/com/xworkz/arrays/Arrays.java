package com.xworkz.arrays;

import java.util.Scanner;

public class Arrays {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	boolean flag=false;
	int index=0;
	System.out.println("enter the size of array");
	int size=sc.nextInt();
	int[] array=new int[size];
	System.out.println("enter the value of the array");
	for(int i=0;i<array.length;i++) {
		array[i]=sc.nextInt();
	}
	System.out.println("elements of the array:");
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+" ");
	}
	
	System.out.println("enter the value to be searched:");
	int search=sc.nextInt();
	for(int i=0;i<array.length;i++) {
		if(array[i]==search) {
			flag=true;
			index=i+1;
//			System.out.println("the element "+array[i]+" was found at index "+i);
		}
	}
	if(flag) {
		System.out.println("the element "+search+" was found at index "+index);
	}else {
		System.out.println("the element was not found");
	}
}
}
