package com.xworkz.equalscontract;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.*;
@Setter
@Getter

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

public CompanyDto(String cName, String location, String ceo) {
	super();
	this.cName = cName;
	this.location = location;
	this.ceo = ceo;
}

public String getCName() {
	return cName;
}

public void setCName(String cName) {
	this.cName = cName;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getCeo() {
	return ceo;
}

public void setCeo(String ceo) {
	this.ceo = ceo;
}

@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(getCName());
	}
}
