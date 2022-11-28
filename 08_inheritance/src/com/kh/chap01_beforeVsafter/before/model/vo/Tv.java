package com.kh.chap_01_beforeVsafter.before.model.vo;

public class Tv {
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private int inch;
	
	public Tv(){
		
	}
	
	public Tv(String brand, String pCode, String pName, int price, int inch){
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.inch = inch;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPcode(String pCode) {
		this.pCode = pCode;
	}
	
	public void setPname(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	
	public String getBarnd() {
		return brand;
	}
	public String getPcode() {
		return pCode;
	}
	public String getPname() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public int getInch() {
		return inch;
	}

	
	public String information() {
		return brand+", "+pCode+", "+pName+", "+price+", "+inch;
	}
}
