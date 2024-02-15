package com.xworkz.bits;

public class GetBits {
public static void main(String[] args) {
	int n=6;
	int pos=2;
	int bitMask=1<<pos;
	
	if((bitMask & n)==0) {
		System.out.println("the "+pos+" bit of "+n+" is zero");
	}else {
		System.out.println("the "+pos+" bit of "+n+" is 1");
	}
}
}
