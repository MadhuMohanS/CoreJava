package com.xworkz.board.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Setter
@ToString
@NoArgsConstructor
public class Light implements Cloneable{
	@NonNull
	private String brand;
	@NonNull
	private String color;
	private String voulte;
	private String shape;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
