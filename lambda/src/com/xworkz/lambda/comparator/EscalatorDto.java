package com.xworkz.lambda.comparator;

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
public class EscalatorDto implements Serializable{
private String place;
private int steps;
private String direction;
private String type;
}
