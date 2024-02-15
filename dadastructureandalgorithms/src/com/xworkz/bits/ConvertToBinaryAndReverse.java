package com.xworkz.bits;

import java.util.Scanner;

public class ConvertToBinaryAndReverse {
	
	public static int[] convertToBinary(int n) {
		int temp=n;
		int[] rem=new int[20];
		int i=0;
		while(n!=0) {
			rem[i]=n%2;
			n/=2;
			i++;
		}
		return rem;
	}
	
	public static int convertToDecimal(int num) {
		int rem=0,sum=0;
		int i=0;
		while(num!=0) {
			rem=num%10;
			sum=sum+(rem*(int)Math.pow(2, i));
			num/=10;
			i++;
		}
		return sum;
	}
public static void main(String[] args) {
	int[] res=new int[20];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	System.out.println("1:convert number to binary");
	System.out.println("2:convert binary to number");
	int choice=sc.nextInt();
	if(choice==1) {
	res=convertToBinary(num);
	System.out.println("converting "+num+" to binary is");
	for(int i=res.length-1;i>=0;i--) {
		System.out.print(res[i]);
	}
	}else if(choice==2){
	int dec=convertToDecimal(num);
	System.out.println("converting "+num+" to decimal is:"+dec);
	}

	
//	System.out.println("converting number "+temp+" to binary is:");
//	for(int j=rem.length-1;j>=0;j--) {
//		System.out.print(rem[j]);
//	}
	


}
}
