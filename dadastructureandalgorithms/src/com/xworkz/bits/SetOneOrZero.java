package com.xworkz.bits;

import java.util.Scanner;

public class SetOneOrZero {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the operation");
	int operation=sc.nextInt();
	
	int pos=1;
	int n=5;
	int bitMask=1<<pos;
	if(operation==1) {
	int newNum=bitMask | n;
	System.out.println(newNum);
	}else {
		int notBitMask=~(bitMask);
		int newNum=notBitMask & n;
		System.out.println(newNum);
	}
}
}
