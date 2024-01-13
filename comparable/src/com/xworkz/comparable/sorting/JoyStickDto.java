package com.xworkz.comparable.sorting;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor@NoArgsConstructor@ToString
public class JoyStickDto implements Comparable<JoyStickDto>,Serializable{
	private String name;
	private double cost;
	private int quantity;
	private String company;
	@Override
	public int compareTo(JoyStickDto o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}
}
