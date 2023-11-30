package com.stringpackage.objectintro;

public class WifiDongle {
String brand;
double transferRate;
int itemWeight;

public WifiDongle(String brand,double transferRate,int itemWeight) {
	this.brand=brand;
	this.transferRate=transferRate;
	this.itemWeight=itemWeight;
}

@Override
public boolean equals(Object obj) {
	WifiDongle wifi=this;
	if(obj!=null) {
		if(obj instanceof WifiDongle) {
			WifiDongle dongle=(WifiDongle)obj;
			if(wifi.transferRate==dongle.transferRate && wifi.itemWeight==dongle.itemWeight) {
				System.out.println("wifidongle and wifidongle1 are same when we compared to transferrate and itemweight");
				return true;
			}else {
				System.err.println("wifidongle and wifidongle1 are not same when we compared to transferrate and itemweight");
			}
		}
	}else {
		System.err.println("object is null");
	}
	return false;
}
}
