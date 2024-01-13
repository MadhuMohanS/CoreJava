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
public class ThreadDto implements Serializable,Comparable<ThreadDto>{
	private int length;
	private String color;
	private int width;
	private String type;
	@Override
	public int compareTo(ThreadDto o) {
		// TODO Auto-generated method stub
		return this.color.compareTo(o.getColor());
	}
}
