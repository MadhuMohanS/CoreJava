package com.xworkz.collectionpractise.comparable;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AlarmDto implements Serializable,Comparable<AlarmDto>{
	private String tune;
	private int timings;
	private double duration;
	private String type;
	@Override
	public int compareTo(AlarmDto o) {
		// TODO Auto-generated method stub
		return this.tune.compareTo(o.getTune());
	}
}
