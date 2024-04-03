package com.xworkz.collectionpractise;



class TvDish{
	public void run() {
		System.out.println("running run method");
		hop();
	}
	public void hop() {
		System.out.println("running hop....");
	}
}
public class TataTvDish extends TvDish{
@Override
public void hop() {
	System.out.println("changin in sub classs");
}
public static void main(String[] args) {
	TvDish tcDish=new TataTvDish();
	tcDish.run();
}
}
