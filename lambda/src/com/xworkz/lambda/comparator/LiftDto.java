package com.xworkz.lambda.comparator;

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
public class LiftDto {
	private String place;
	private int steps;
	private String direction;
	private String type;
}
