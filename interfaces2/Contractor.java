package com.xworkz.classroom.interfaces2;

public class Contractor extends AbstractSewageRule implements BBMPRule{
 @Override
 public void homeTax() {
	 System.out.println("running homeTax in Contractor");
 }
 @Override
 public void waterTax() {
	 System.out.println("running watertax in Contractor");
 }
 @Override
	public void clean() {
		System.out.println("running clean in AbstractSewageRule");
	}
	@Override
	public void regularCheckup() {
		System.out.println("running regularCheckup in AbstractSewageRule");
	}
	@Override
	public void development() {
		System.out.println("running development in Contractor");
		
	}
	@Override
	public void siteRegistration() {
		System.out.println("running siteRegistration in Contractor");
		
	}
	@Override
	public void trafficTax() {
		System.out.println("running trafficTax in Contractor");
		
	}
	@Override
	public void hotelTax() {
		System.out.println("running hotelTax in Contractor");
		
	}

 
}
