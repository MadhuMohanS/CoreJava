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
public class DiseaseDto implements Serializable,Comparable<DiseaseDto>{
private String name;
private String symptoms;
private int affecteddays;
private String medicine;
@Override
public int compareTo(DiseaseDto o) {
	// TODO Auto-generated method stub
	return this.name.compareTo(o.getName());
}
}
