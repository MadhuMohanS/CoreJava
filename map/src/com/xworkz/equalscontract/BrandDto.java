package com.xworkz.equalscontract;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class BrandDto {
private String bName;
private String ceo;
private String branch;

public boolean equals(Object obj) {
	BrandDto brand=this;
	if(obj!=null) {
		if(obj instanceof BrandDto) {
			BrandDto brandDto=(BrandDto)obj;
			if(brandDto.getBName().equals(this.getBName())) {
				return true;
			}
		}
	}
	return false;
}

@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(getBName());
	}
}
