package com.xworkz.mitsogo;

import java.util.LinkedList;
import java.util.Queue;

public class SteppingNumbers {

	
	    public static void displaySteppingNumbers(int n, int m) {
	        Queue queue = new LinkedList<Integer>();
	        for (int i = 1; i <= 9; i++) {
	        	queue.add(i); 
	        	} 
	        while (!queue.isEmpty()) { 
	        	int stepNum = (int) queue.poll();
	        	if (stepNum >= n && stepNum <= m) {
	        		System.out.print(stepNum + " ");
	        		} 
	        	if (stepNum == 0 || stepNum > m) {
	                continue;
	            }
	            int lastDigit = stepNum % 10;
	            int stepNumA = stepNum * 10 + (lastDigit - 1);
	            int stepNumB = stepNum * 10 + (lastDigit + 1);
	            if (lastDigit == 0) {
	                queue.add(stepNumB);
	            } else if (lastDigit == 9) {
	                queue.add(stepNumA);
	            } else {
	                queue.add(stepNumA);
	                System.out.println("---------------------stepnumA-------------");
	                for(Object i:queue) {
	                	System.out.println(i);
	                }
	                queue.add(stepNumB);
	                System.out.println("---------------------stepnumB-------------");
	                for(Object i:queue) {
	                	System.out.println(i);
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int n = 10, m = 20;
	        System.out.print("Stepping Numbers between " + n + " and " + m + ": ");
	        displaySteppingNumbers(n, m);
	    }
}
