package com.xworkz.board.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Plastic{
	@NonNull
private String type;
private String shape;
private double weight;
private String usage;

@Override
public Plastic clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return (Plastic) super.clone();
}


}
