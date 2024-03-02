package com.xworkz.collectionmock.bikeshowroom;

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
public class BikeDto implements Serializable{
private String name;
private int pincode;
}
