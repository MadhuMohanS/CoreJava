package com.stringpackage.objectintro.main;
import com.stringpackage.objectintro.*;

public class ObjectBegin {

	public static void main(String[] args) {
		System.out.println("starting main in ObjectBegin");
		Lens lens=new Lens();
		System.out.println(lens.toString());
		System.out.println("hash code of lens is:"+lens.hashCode());
		System.out.println("original hash code of lens is:"+System.identityHashCode(lens));
		
		Lens lens1=new Lens();
		System.out.println(lens1.toString());
		
		Locker locker=new Locker();
		System.out.println(locker.toString());
		System.out.println("hash code of locker is:"+locker.hashCode());
		System.out.println("original hash code of lens is:"+System.identityHashCode(locker));
		
		Locker locker1=new Locker();
		System.out.println(locker1.toString());
		
		
		Cotton cotton=new Cotton();
		System.out.println(cotton.toString());
		System.out.println("hash code of cotton is:"+cotton.hashCode());
		System.out.println("original hash code of cotton is:"+System.identityHashCode(cotton));
		
		Cotton cotton1=new Cotton();
		System.out.println(cotton1.toString());
		
		Mic mic=new Mic();
		System.out.println(mic.toString());
		
		Mic mic1=new Mic();
		System.out.println(mic1.toString());
		
		Heart heart=new Heart();
		System.out.println(heart.toString());
		
		Heart heart1=new Heart();
		System.out.println(heart1.toString());
		
		Seed seed=new Seed();
		System.out.println(seed.toString());
		
		Seed seed1=new Seed();
		System.out.println(seed.toString());
		
		Chain chain=new Chain();
		System.out.println(chain.toString());
		
		Chain chain1=new Chain();
		System.out.println(chain1.toString());
		
		Rice rice=new Rice();
		System.out.println(rice.toString());
		
		Rice rice1=new Rice();
		System.out.println(rice1.toString());
		
		Bucket bucket=new Bucket();
		System.out.println(bucket.toString());
		
		Bucket bucket1=new Bucket();
		System.out.println(bucket1.toString());
		
		Basket basket=new Basket();
		System.out.println(basket.toString());
		
		Basket basket1=new Basket();
		System.out.println(basket1.toString());
		
		bowl bowl=new bowl();
		System.out.println(bowl.toString());
		
		bowl bowl1=new bowl();
		System.out.println(bowl1.toString());
		
		Spoon spoon=new Spoon();
		System.out.println(spoon.toString());
		
		Spoon spoon1=new Spoon();
		System.out.println(spoon1.toString());
		
		Money money=new Money();
		System.out.println(money.toString());
		
		Money money1=new Money();
		System.out.println(money1.toString());
		
		Geyser geyser=new Geyser();
		System.out.println(geyser.toString());
		
		Geyser geyser1=new Geyser();
		System.out.println(geyser1.toString());
		System.out.println("ending main in ObjectBegin");
 
	}

}
