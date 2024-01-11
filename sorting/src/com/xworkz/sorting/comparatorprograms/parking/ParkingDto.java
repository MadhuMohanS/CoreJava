package com.xworkz.sorting.comparatorprograms.parking;

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
public class ParkingDto implements Serializable{
private String place;
private String type;
private int length;
private int cost;
}
