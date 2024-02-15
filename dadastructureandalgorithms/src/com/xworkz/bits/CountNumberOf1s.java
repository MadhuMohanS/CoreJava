package com.xworkz.bits;

public class CountNumberOf1s {

	public static int count1s(int n) {
		int count=0;
		while(n>0) {
			count+=n&1;
			n>>=1;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=9;
      int res=count1s(num);
      System.out.println("number of 1s in "+num+" is :"+res);
		
	}

}
