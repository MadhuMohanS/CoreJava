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
public class CardBoardDto implements Serializable,Comparable<CardBoardDto>{
	private String type;
	private int length;
	private int width;
	private double cost;
	
	public int compareTo(CardBoardDto o) {
		return Integer.compare(this.length, o.getLength());
	}
	
	
}
