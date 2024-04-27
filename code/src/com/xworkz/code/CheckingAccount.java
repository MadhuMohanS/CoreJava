package com.xworkz.code;

public class CheckingAccount {
	double initialBalance=500;
	String accountholderName="abc";
	double overDraftLimit=3;
	
	public double deposit(double amt) {
		initialBalance+=amt;
		System.out.println("you have deposited "+amt);
		return initialBalance;
	}
	public double withDrawing(double amt) {
		if(initialBalance<=500) {
			if(overDraftLimit>0) {
		initialBalance-=amt;
		System.out.println("you have debited:"+amt);
		overDraftLimit--;
		
		}else {
			System.out.println("todays limit is excedded");
		}
			return initialBalance;
		}else {
			System.out.println("there is insufficient balance...");
			return -1;
		}
	}
	
	
	
	
}
