package com.xworkz.sort;

public class SelectionSort {
public static void main(String[] args) {
	int arr[]= {7,3,2,8,5};
	int small,temp,index=0;
	for(int i=0;i<arr.length-1;i++) {
		small=i;
		for(int j=i+1;j<arr.length;j++) {
		if(arr[j]<arr[small]) {
			small=j;
		}
		}
		temp=arr[small];
		arr[small]=arr[i];
		arr[i]=temp;
		
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}
}
}
