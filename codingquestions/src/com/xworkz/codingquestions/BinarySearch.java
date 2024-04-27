package com.xworkz.codingquestions;

public class BinarySearch {
public static int findElement(int arr[],int x) {
	int f=0,l=arr.length-1,m;
	while(f<l) {
	  m=f+(l-f)/2;
	  if(arr[m]==x) {
		  return m;
	  }else if(arr[m]<x) {
		  f=m+1;
	  }else {
		  l=m-1;
	  }
	}
	return -1;
}
public static void main(String[] args) {
	int arr[]= {1,2,3,4};
	int x=1;
	int ele=BinarySearch.findElement(arr, x);
	if(ele==-1) {
		System.out.println("element is not present");
	}else {
		System.out.println("element is present at "+(ele+1));
	}
}
}
