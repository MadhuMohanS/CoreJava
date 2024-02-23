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
public class CompanyDto implements Serializable{
private String cName;
private String location;
private String ceo;

public boolean equals(Object obj) {
	CompanyDto company=this;
	if(obj!=null) {
		if(obj instanceof CompanyDto) {
			CompanyDto companyDto=(CompanyDto)obj;
			if(companyDto.getCName().equals(this.getCName())) {
				return true;
			}
		}
	}
	return false;
	
}

@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(getCName());
	}
}
