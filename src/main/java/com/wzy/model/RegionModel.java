package com.wzy.model;

public class RegionModel {
	
	private int ID;
	private String Name;
	private String District;
	private int Population;
	
	//getter and setter
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public int getPopulation() {
		return Population;
	}
	public void setPopulation(int population) {
		Population = population;
	}
	
	//constractor
	public RegionModel(int iD, String name, String district, int population) {
		super();
		ID = iD;
		Name = name;
		District = district;
		Population = population;
	}

	
}
