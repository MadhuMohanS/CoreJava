package com.xworkz.arrays;

public class CheckSortedOrNot {
public static void main(String[] args) {
	int arr[]= {1,2,3,4};
	boolean isAscending=true;
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]>arr[i+1]) {
			isAscending=false;
		}
	}
	if(isAscending) {
		System.out.println("sorted");
	}else {
		System.out.println("not sorted");
	}
}
}
