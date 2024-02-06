package com.xworkz.mitsogo;

import java.util.Scanner;

public class Get {
public static int getMax(int prices[],int money) {
	int count=0,sum=0,max=0;
	for(int i=0;i<prices.length;i++) {
		count=0;sum=0;
		for(int j=i;j<prices.length;j++) {
			if(sum+prices[j]<=money) {
				sum=sum+prices[j];
				count++;
				max=Math.max(max, count);
			}else {
				sum=0;
				count=0;
				break;
			}
		}
	}
	return max;
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int[] prices=new int[size];
	for(int i=0;i<prices.length;i++) {
		prices[i]=sc.nextInt();
	}
	int money=sc.nextInt();
	int max=getMax(prices,money);
	System.out.println(max);
}
}
