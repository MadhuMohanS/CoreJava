package com.xworkz.mappractise;

import java.util.Objects;

public class CompanyDto {
	private String cName;
	private String location;
	private String ceo;
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
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
	public String toString() {
		return "CompanyDto [cName=" + cName + ", location=" + location + ", ceo=" + ceo + "]";
	}
	public CompanyDto(String cName, String location, String ceo) {
		super();
		this.cName = cName;
		this.location = location;
		this.ceo = ceo;
	}

//	public boolean equals(Object obj) {
//		CompanyDto company=this;
//		if(obj!=null) {
//			if(obj instanceof CompanyDto) {
//				CompanyDto ref=(CompanyDto)obj;
//				if(ref.getcName().equals(this.getcName())) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
	public boolean equals(Object obj) {
		CompanyDto company=this;
		if(obj!=null) {
			if(obj instanceof CompanyDto) {
				CompanyDto companyDto=(CompanyDto)obj;
				if(companyDto.getcName().equals(this.getcName())) {
					return true;
				}
			}
		}
		return false;
		
	}

	@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return Objects.hash(getcName());
		}
}
