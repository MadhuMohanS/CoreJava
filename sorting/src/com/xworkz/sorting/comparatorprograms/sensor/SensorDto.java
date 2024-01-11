package com.xworkz.sorting.comparatorprograms.sensor;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class SensorDto implements Serializable{
private String type;
private String name;
private double cost;
private double distance;
}
