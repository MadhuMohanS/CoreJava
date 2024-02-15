package com.xworkz.sort;

public class SelectionSort {
public static void main(String[] args) {
	int arr[]= {7,3,2,8,5};
	int small,temp,index=0;
	for(int i=0;i<arr.length-1;i++) {
		small=arr[i];
		for(int j=i+1;j<arr.length;j++) {
		if(arr[j]<small) {
			small=arr[j];
			index=j;
		}
		}
		temp=arr[index];
		arr[index]=arr[i];
		arr[i]=temp;
		
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}
}
}
