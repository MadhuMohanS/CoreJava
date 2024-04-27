package com.xworkz.code;

public class SavingAccount {
double initialBalance=500;
String accountholderName="abc";
int interestRate=3;
double rate=(0.03)*initialBalance;

public double deposit(double amt) {
	System.out.println("account holder Name:"+accountholderName);
	initialBalance+=amt;
	initialBalance+=rate;
	System.out.println("you have deposited:"+amt);
	return initialBalance;
}
public double withDrawing(double amt) {
	System.out.println("account holder Name:"+accountholderName);
	if(initialBalance<=500) {
	initialBalance-=amt;
	System.out.println("you have debited:"+amt);
	return initialBalance;
	}else {
		System.out.println("there is insufficient balance...");
		return -1;
	}
}

public void addInterestRate(double amt) {
	
}
}
