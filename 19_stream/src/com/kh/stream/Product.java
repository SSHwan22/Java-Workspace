package com.kh.stream;

public class Product {
	private String pName;
	private int price;
	private int stock;
	private String brand;
	
	public Product() {
		super();
	}
	public Product(String pName, int price, int stock, String brand) {
		super();
		this.pName = pName;
		this.price = price;
		this.stock = stock;
		this.brand = brand;
	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Product [pName=" + pName + ", price=" + price + ", stock=" + stock + ", brand=" + brand + "]";
	}
	
	
	
}
