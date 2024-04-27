package com.xworkz.codingquestions;

public class CheckPrimaryorNot {
public static void main(String[] args) {
	int n=9;
	boolean flag=false;
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			flag=true;
		}
	}
	if(flag) {
		System.out.println("it is not prime");
	}else {
		System.out.println("it is prime");
	}
}
}
