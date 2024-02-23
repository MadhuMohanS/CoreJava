package com.xworkz.equalscontract;

import java.io.Serializable;
import java.util.Objects;

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
public class StudentDto implements Serializable{
private String name;
private int age;
private double height;

public boolean equals(Object obj) {
	StudentDto studentDto=this;
	if(obj!=null) {
		if(obj instanceof StudentDto) {
			StudentDto student=(StudentDto)obj;
			if(student.getName()==studentDto.getName()) {
				return true;
			}
		}
	}
	return false;
}


@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(getName());
	}
}
