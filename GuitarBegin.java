package com.stringpackage.objectintro.main;
import com.stringpackage.objectintro.*;
public class GuitarBegin {

	public static void main(String[] args) {
		Guitar guitar=new Guitar(1,200,"wood");
		Guitar guitar1=new Guitar(1,2000,"wood");
		
		boolean same=guitar.equals(guitar1);
		System.out.println("guitar.equals(guitar1) "+same);		
		WifiDongle wifidongle=new WifiDongle("Airtel",300,20);
		WifiDongle wifidongle1=new WifiDongle("Airtel",300,20);
		
		same=wifidongle.equals(wifidongle1);
		System.out.println("wifidongle.equals(wifidongle1) "+same);
		
		UsbHub usbhub=new UsbHub(2,300,80.5);
		UsbHub usbhub1=new UsbHub(2,300,80);
		
		same=usbhub.equals(usbhub1);
		System.out.println("usbhub.equals(usbhub1) "+same);
		

	}

}
