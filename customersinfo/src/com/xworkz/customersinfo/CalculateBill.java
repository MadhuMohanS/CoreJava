package com.xworkz.customersinfo;

import java.util.Scanner;

public class CalculateBill {
	public static double claculate(int size,double cost) {
		
		double sum=0;
		sum=size*cost;
		return sum;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the cost of banana");
	double cost=sc.nextDouble();
	System.out.println("enter the no of items of banana");
	int count=sc.nextInt();
	
	double sum=claculate(count, cost);
	
	System.out.println("enter the cost of Apple");
	cost=sc.nextDouble();
	System.out.println("enter the no of items of banana");
	count=sc.nextInt();
	sum+=claculate(count, cost);
	System.out.println("bill is:"+sum);
	
}
}
