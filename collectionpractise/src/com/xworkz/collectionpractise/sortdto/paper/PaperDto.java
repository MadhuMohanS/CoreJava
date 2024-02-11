package com.xworkz.collectionpractise.sortdto.paper;

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

public class PaperDto {
private double cost;
private String name;
private String state;
private int length;
}
