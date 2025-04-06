package com.springcore.FirstsMavenProject.listOfObj;

public class Subject {
	private String subName;
	private int price;

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Subject() {
	}

	@Override
	public String toString() {
		return "Subject [subName=" + subName + ", price=" + price + "]";
	}
	
}
