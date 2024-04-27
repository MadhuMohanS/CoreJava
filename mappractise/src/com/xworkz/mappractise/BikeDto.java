package com.xworkz.mappractise;

public class BikeDto {
	private String bName;
	private int modelNo;
	private int mileage;
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "BikeDto [bName=" + bName + ", modelNo=" + modelNo + ", mileage=" + mileage + "]";
	}
	public BikeDto(String bName, int modelNo, int mileage) {
		super();
		this.bName = bName;
		this.modelNo = modelNo;
		this.mileage = mileage;
	}
}
