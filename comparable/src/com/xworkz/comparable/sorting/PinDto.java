package com.xworkz.comparable.sorting;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PinDto implements Serializable,Comparable<PinDto>{
	private int length;
	private int width;
	private String type;
	private String use;

	@Override
	public int compareTo(PinDto o) {
		return Integer.compare(this.length, o.getLength());
	}
}
