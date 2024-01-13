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
public class CardBoardDto implements Serializable,Comparable<CardBoardDto>{
private String type;
private int length;
private int width;
private double cost;
@Override
public int compareTo(CardBoardDto o) {
	// TODO Auto-generated method stub
	return Integer.compare(this.length,o.getLength());
}

}
