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
public class RopeDto implements Serializable,Comparable<RopeDto>{
private int length;
private String color;
private int width;
private String type;
@Override
public int compareTo(RopeDto o) {
	// TODO Auto-generated method stub
	return this.color.compareTo(o.getColor());
}

}
