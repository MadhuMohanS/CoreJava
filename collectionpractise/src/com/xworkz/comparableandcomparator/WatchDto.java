package com.xworkz.comparableandcomparator;

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
public class WatchDto implements Serializable,Comparable<WatchDto>{
private String name;
private String brand;
private double cost;
private String shape;

public int compareTo(WatchDto o) {
	return this.name.compareTo(o.getName());
}
}
