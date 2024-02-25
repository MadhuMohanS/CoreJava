package com.xworkz.presentation;

@FunctionalInterface
interface Action{
//	public void show(int i);
	public abstract int add(int a,int b);
}

//class ActionImpl implements Action{
//
//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		System.out.println("running show in ActionImpl");
//		
//	}
//	
//}
public class LambdaPractice {
public static void main(String[] args) {
//	Action action=(i)->System.out.println("running show in action"+i);
	Action action=(a,b)->a+b;


	int ref=action.add(5,6);
	System.out.println(ref);
}
}
