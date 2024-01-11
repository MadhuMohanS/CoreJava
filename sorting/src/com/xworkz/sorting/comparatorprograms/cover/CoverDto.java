package com.xworkz.sorting.comparatorprograms.cover;

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
public class CoverDto implements Serializable{
private String type;
private int length;
private int width;
private String color;

}
