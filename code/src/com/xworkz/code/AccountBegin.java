package com.xworkz.code;

public class AccountBegin {
public static void main(String[] args) {
	double mon;
	SavingAccount savingAccount=new SavingAccount();
	CheckingAccount checkingAccount=new CheckingAccount();
	System.out.println("saving account.....");
mon=savingAccount.deposit(500);
System.out.println("the balance is:"+mon);
mon=savingAccount.withDrawing(-100);
System.out.println("the balance is:"+mon);

System.out.println("checking account.....");
double checkMon;
checkMon=checkingAccount.deposit(500);
System.out.println("the balance is:"+checkMon);
mon=savingAccount.withDrawing(7);
System.out.println("the balance is:"+mon);
mon=savingAccount.withDrawing(7);
System.out.println("the balance is:"+mon);
mon=savingAccount.withDrawing(7);
System.out.println("the balance is:"+mon);
mon=savingAccount.withDrawing(7);
System.out.println("the balance is:"+mon);

// checkMon= checkingAccount.withDrawing(700);
// System.out.println("the balance is:"+checkMon);
 
}
}
