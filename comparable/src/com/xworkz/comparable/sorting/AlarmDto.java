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
public class AlaramDto implements Serializable,Comparable<AlaramDto>{
private String tune;
private int timings;
private double duration;
private String type;
@Override
public int compareTo(AlaramDto o) {
	// TODO Auto-generated method stub
	return this.tune.compareTo(o.getTune());
}


}
