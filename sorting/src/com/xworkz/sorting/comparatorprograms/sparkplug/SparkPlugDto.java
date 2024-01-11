package com.xworkz.sorting.comparatorprograms.sparkplug;

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
public class SparkPlugDto implements Serializable{
private String name;
private double heatRange;
private  String type;
private String size;
}
