package com.xworkz.lambdapractise;

interface Juice{
	void banana();
}
public class Fruit {
public static void main(String[] args) {
//	Juice juice=new Juice() {
//		
//		@Override
//		public void banana() {
//			System.out.println("running banana in fruit");
//			
//		}
//	};
//	
	Juice juice=()->System.out.println("running banana in fruit");
	juice.banana();
}
}
