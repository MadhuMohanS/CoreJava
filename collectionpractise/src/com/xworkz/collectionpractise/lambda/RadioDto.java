package com.xworkz.collectionpractise.lambda;

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
public class RadioDto {
	private String name;
	private double point;
	private int invented;
	private String country;
}
