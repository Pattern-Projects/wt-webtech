package com.tus.webtech;

public class Product {
	private int id = 1;
	private String  name = "Stapler";
	private double price = 5.99;
	
	public Product() {}
	public Product(int id) {
		this.id = id;
	}

	public double calculateDiscountedPrice(int discount) {
		price = price - (price*discount/100);
		return price;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
}
