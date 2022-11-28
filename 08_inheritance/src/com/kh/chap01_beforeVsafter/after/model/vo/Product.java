package com.kh.chap_01_beforeVsafter.after.model.vo;

public class Product {
	/*
	 * 세 클래스 모두 공통적으로 기술되어있던 요소(필드,메서드들만 추출해서 정의해둔 클래스 : 부모클래스
	 */
	protected String brand;
	protected String pCode;
	protected String pName;
	protected int price;
	
//	protected String brand;
//	protected String pCode;
//	protected String pName;
//	protected int price;
	
	public Product() {
		
	}
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public String getpCode() {
		return pCode;
	}
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	
	public String information() {
		return "brand : "+brand+", pCode : "+pCode+", pName :"+pName+", price : "+price;
	}
}
