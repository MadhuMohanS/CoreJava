package com.xworkz.equalscontract;

import java.util.Objects;

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
public class ProgrammingLanguageDto {
private String name;
private double version;
private int invented;

public boolean equals(Object obj) {
	ProgrammingLanguageDto program=this;
	if(obj!=null) {
		if(obj instanceof ProgrammingLanguageDto) {
			ProgrammingLanguageDto programDto=(ProgrammingLanguageDto)obj;
			if(programDto.getName().equals(this.getName())) {
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
