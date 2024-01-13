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
public class ToyDto implements Serializable,Comparable<ToyDto>{
private String material;
private String name;
private int quantity;
private double cost;
@Override
public int compareTo(ToyDto o) {
	// TODO Auto-generated method stub
	return this.material.compareTo(o.getMaterial());
}

}
