package com.xworkz.maprunner.hashcode;



class Laptop{
	String brand;
	double price;
	public Laptop(String brand,double price) {
		// TODO Auto-generated constructor stub
		this.brand=brand;
		this.price=price;
	}
//	@Override
//	public boolean equals(Object obj) {
//        return (this == obj);
//    }
	public boolean equals(Object obj) {
		Laptop laptop=this;
	    if(obj !=null)
	    {
	        if(obj instanceof Laptop)
	        {
	            Laptop equalsPractise=(Laptop) obj;
	            if(this.brand.equals(equalsPractise.brand) && this.price==equalsPractise.price)
	            {
	            	System.out.println("both are equal");
	                return true;
	            }
	            else {
	            	System.err.println("both are not equal");
	            }
	        }
	    }
		return false;
	    }
	
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return 200;
//	}
	
	    
}
public class EqualsPractise {
	public static void main(String[] args) {
  Laptop laptop=new Laptop("dell", 30000);
  Laptop laptop1=new Laptop("dell", 30000);
  System.out.println(laptop.hashCode());
  System.out.println(laptop1.hashCode());
   System.out.println(laptop.equals(laptop1));
//		Integer obj=new Integer(10);
//		Integer obj1=new Integer(10);
//		System.out.println(obj.equals(obj1));
//		String str1=new String("java");
//		String string=new String("java");
//		System.out.println(str1.equals(string));
//		System.out.println(str1.hashCode());
//		System.out.println(string.hashCode());
 
	} 
}
