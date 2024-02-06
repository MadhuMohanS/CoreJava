package com.xworkz.Strings;

import java.util.Scanner;

public class FindLengthofArrayStrings {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	String[] arr=new String[size];
	int totalLength=0;
	for(int i=0;i<size;i++) {
		arr[i]=sc.next();
		totalLength+=arr[i].length();
	}
    System.out.println("total length of the array strings:"+totalLength);
}
}
