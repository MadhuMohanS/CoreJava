package com.xworkz.set;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ToyDto implements Serializable,Comparable<ToyDto>{
private String name;
private String material;
private int cost;

public int compareTo(ToyDto o) {
	return name.compareTo(o.getName());
}
@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(getName(),getMaterial());
	}

public boolean equals(Object obj) {
	ToyDto toyDto=this;
	if(obj!=null) {
		if(obj instanceof ToyDto) {
			ToyDto ref=(ToyDto)obj;
			if(ref.getName().equals(this.name) && ref.getMaterial().equals(this.material)) {
				return true;
			}
		}
	}
	return false;
}
}
