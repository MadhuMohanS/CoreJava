package com.stringpackage.objectintro;

import java.util.Objects;

public class Guitar {
int id;
double price;
String material;

public Guitar(int id,double price,String material) {
	this.id=id;
	this.price=price;
	this.material=material;
}

@Override
public boolean equals(Object obj) {

	Guitar guitar=this;
	if(obj!=null) {
		if(obj instanceof Guitar) {
			Guitar ref=(Guitar)obj;
			if(guitar.id==ref.id && guitar.price==ref.price) {
				System.out.println("guitar and guitar1 are same when we compared id and price");
				return true;
			}else {
				System.err.println("guitar and guitar1 are not same when we compared id and price");
			}
		}
	}else {
		System.err.println("object is null");
	}
	return false;
}

}
