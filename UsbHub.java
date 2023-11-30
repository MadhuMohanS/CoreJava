package com.stringpackage.objectintro;

public class UsbHub {
int totalPorts;
double transferRate;
double batteryRequired;

public UsbHub(int totalPorts, double transferRate, double batteryRequired) {
	super();
	this.totalPorts = totalPorts;
	this.transferRate = transferRate;
	this.batteryRequired = batteryRequired;
}

@Override
public boolean equals(Object obj) {
	UsbHub usbhub=this;
	if(obj!=null) {
		if(obj instanceof UsbHub) {
			UsbHub usb=(UsbHub)obj;
			if(usbhub.totalPorts==usb.totalPorts && usbhub.transferRate==usb.transferRate && usbhub.batteryRequired==usb.batteryRequired) {
				System.out.println("usbhub and usbhub1 are same when we compared to totalports,transferrate,batteryrequired");
				return true;
			}else {
				System.err.println("usbhub and usbhub1 are not same when we compared to totalports,transferrate,batteryrequired");

			}
		}
	}else {
		System.err.println("object is null");
	}
	return false;
}

}
