package com.xworkz.lambda.comparator;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@AllArgsConstructor
@ToString
public class GeyserDto implements Serializable{
private String company;
private double capacity;
private double temperature;
private int cost;



}
