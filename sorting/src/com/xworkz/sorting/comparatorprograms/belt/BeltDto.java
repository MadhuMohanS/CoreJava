package com.xworkz.sorting.comparatorprograms.belt;

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
public class BeltDto implements Serializable{
private String company;
private int length;
private int buckels;
private String type;
}
