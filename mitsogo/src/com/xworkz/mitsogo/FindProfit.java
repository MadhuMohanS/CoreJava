package com.xworkz.mitsogo;

public class FindProfit {
public static void main(String[] args) {
	int max=Integer.MIN_VALUE;
	int n=5;
	int id=0;
	int profit=0;
	int[] uniqueId=new int[n];
//	int[] ids=new int[5];
	uniqueId[0]=4;
	uniqueId[1]=6;
	uniqueId[2]=3;
	uniqueId[3]=3;
	uniqueId[4]=4;
	
	int m=5;
	int[] profitarr=new int[m];
	profitarr[0]=-1;
	profitarr[1]=10;
	profitarr[2]=10;
	profitarr[3]=15;
	profitarr[4]=-5;
	
	for(int i=0;i<m;i++) {
		if(profitarr[i]>0) {
			if(uniqueId[i]==uniqueId[i+1]) {
				max=Math.max(profitarr[i], profitarr[i+1]);
				profit+=max;
//				System.out.println(profit);
				i=i+1;
			}
			else {
				profit+=profitarr[i];
//				System.out.println(profit+" hey");
			}
		
		}
	}
	System.out.println(profit);
//	System.out.println(id);
	
}
}
