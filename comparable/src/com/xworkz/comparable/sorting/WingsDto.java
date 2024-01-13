package com.xworkz.comparable.sorting;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class WingsDto implements Serializable,Comparable<WingsDto>{
	private int length;
	private int width;
	private char size;
	private String bird;

	@Override
	public int compareTo(WingsDto o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.length, o.getLength());
	}

}
