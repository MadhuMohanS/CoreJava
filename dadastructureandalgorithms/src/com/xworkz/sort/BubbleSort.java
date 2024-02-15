package com.xworkz.sort;

public class BubbleSort {
public static void main(String[] args) {
	int arr[]= {7,3,2,8,5};
	int temp;
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
		if(arr[j]>arr[j+1]) {
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
		}
	}
	System.out.println("after sorting in ascending order");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
		if(arr[j]<arr[j+1]) {
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
		}
	}
	System.out.println("\nafter sorting in descending order");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
