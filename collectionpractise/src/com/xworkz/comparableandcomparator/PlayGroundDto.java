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
public class PlayGroundDto implements Serializable,Comparable<PlayGroundDto>{
private String name;
private String location;
private double length;
private String type;

public int compareTo(PlayGroundDto o) {
	return this.name.compareTo(o.getName());

}
}
