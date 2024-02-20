package com.xworkz.filters;

import java.io.Serializable;
import java.time.LocalDate;

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


public class MedicineDto implements Serializable,Comparable<MedicineDto> {
private String name;
private int id;
private String company;
private LocalDate expiryDate;
private LocalDate manfDate;
private double cost;
private String[] ingredient;
@Override
public int compareTo(MedicineDto o) {
	// TODO Auto-generated method stub
	return this.company.compareTo(o.getCompany());
}
}
