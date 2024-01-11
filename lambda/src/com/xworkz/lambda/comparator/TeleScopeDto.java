package com.xworkz.lambda.comparator;

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
public class TeleScopeDto implements Serializable{
private int length;
private int width;
private String type;
private String use;
}
