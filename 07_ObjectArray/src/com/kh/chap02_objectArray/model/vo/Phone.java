package com.kh.chap02_objectArray.model.vo;

public class Phone {
	private String name;
	private String series;
	private String brand;
	private int price;
	
	public Phone(){
		
	}
	
	public Phone(String name, String series, String brand, int price){
		this.name = name;
		this.series = series;
		this.brand = brand;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSeries(String series) {
		this.series = series;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSeries() {
		return series;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String information() {
		return name+", "+series+", "+brand+", "+price;
	}
}
