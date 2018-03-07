package com.example.maventest;

public class EmergencyContact {

	private String name;
	private String phnNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhnNumber() {
		return phnNumber;
	}

	public void setPhnNumber(String phnNumber) {
		this.phnNumber = phnNumber;
	}

	@Override
	public String toString() {
		return "EmergencyContact [name=" + name + ", phnNumber=" + phnNumber + "]";
	}
	

}
