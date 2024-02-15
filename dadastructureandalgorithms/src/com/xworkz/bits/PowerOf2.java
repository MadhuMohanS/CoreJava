package com.xworkz.bits;

public class PowerOf2 {
	public static boolean isPwerOf2(int num) {
		while(num!=1) {
			if(num%2!=0) {
				return false;
			}
			num/=2;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=34;
		if(isPwerOf2(num)) {
			System.out.println(num+" is a power of 2");
		}else {
			System.out.println(num+" is not a power of 2");
		}

	}

}
