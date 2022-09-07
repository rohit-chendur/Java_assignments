package com.sonata.dayfour.q2;

public class Product {
	private int proId;
	private String proName;
	private double proPrice;
	public Product(int id, String name, double price) {
		this.proId = id;
		this.proName = name;
		this.proPrice = price;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProdName() {
		return proName;
	}
	public void setProdName(String proName) {
		this.proName = proName;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}


}
	