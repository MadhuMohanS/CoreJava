package com.xworkz.streamandcollectionpractise;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;

public class MedicineDto implements Serializable,Comparable<MedicineDto>{
	private String name;
	private int id;
	@Override
	public String toString() {
		return "MedicineDto [name=" + name + ", id=" + id + ", company=" + company + ", expiryDate=" + expiryDate
				+ ", manfDate=" + manfDate + ", cost=" + cost + ", ingredient=" + Arrays.toString(ingredient) + "]";
	}
	public MedicineDto(String name, int id, String company, LocalDate expiryDate, LocalDate manfDate, double cost,
			String[] ingredient) {
		super();
		this.name = name;
		this.id = id;
		this.company = company;
		this.expiryDate = expiryDate;
		this.manfDate = manfDate;
		this.cost = cost;
		this.ingredient = ingredient;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public LocalDate getManfDate() {
		return manfDate;
	}
	public void setManfDate(LocalDate manfDate) {
		this.manfDate = manfDate;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String[] getIngredient() {
		return ingredient;
	}
	public void setIngredient(String[] ingredient) {
		this.ingredient = ingredient;
	}
	private String company;
	private LocalDate expiryDate;
	private LocalDate manfDate;
	private double cost;
	private String[] ingredient;
	@Override
	public int compareTo(MedicineDto o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
