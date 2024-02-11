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
public class SkyWalkDto {
	private String place;
	private String connect;
	private int steps;
	private String type;
}
