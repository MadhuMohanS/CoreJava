package com.xworkz.mitsogo;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Stepping2 {
public static void displaySteppingNumbers(int n,int m) {
	Queue<Integer> queue=new LinkedList<>();
	for(int i=1;i<=9;i++) {
		queue.add(i);
	}
	while(!(queue.isEmpty())) {
		int stepNum=queue.poll();
		if(stepNum>=n && stepNum<=m) {
			System.out.print(stepNum+" ");
		}
		if(stepNum==0 || stepNum>m) {
			continue;
		}
		int lastDigit=stepNum%10;
		int stepNumA=stepNum*10+(lastDigit-1);
		int stepNumB=stepNum*10+(lastDigit+1);
		
		if(lastDigit==0) {
			queue.add(stepNumB);
		}else if(lastDigit==9) {
			queue.add(stepNumA);
		}else {
			queue.add(stepNumA);
			queue.add(stepNumB);
		}
	}
	
}
public static void main(String[] args) {
	int n=1,m=200;
	System.out.println("stepping numbers bw "+n+" "+m+" are:");
	displaySteppingNumbers(n, m);
}
}
