package com.xworkz.lambda.comparator;

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
public class RadioDto implements Serializable{
private String name;
private double point;
private int invented;
private String country;

}
