package com.xworkz.collectionpractise;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class MinMax {
	public static void main(String[] args) {
		int[] find=new int[5];
		int arr[]= {1,2,3,4,5};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
//		Scanner scanner=new Scanner(System.in);
//		int size=scanner.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					continue;
				}
				sum+=arr[j];
			}
			find[i]=sum;
		}
		for(int i=0;i<arr.length;i++) {
			if(find[i]<min)
				min=find[i];
		}
		for(int j=0;j<arr.length;j++) {
			if(find[j]>max) {
				max=find[j];
			}
		}
		System.out.println(min);
		System.out.println(max);
		
	}

}
