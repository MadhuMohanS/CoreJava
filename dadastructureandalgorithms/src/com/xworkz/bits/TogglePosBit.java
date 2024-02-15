package com.xworkz.bits;

public class TogglePosBit {

	static void toggleKthBit(int num,int pos) {
		int bitMask=1<<pos;
		int newNum=bitMask ^ num;
		
		System.out.println(newNum);
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toggleKthBit(5, 1);

	}

}
