package com.kh.chap_01_beforeVsafter.before.model.vo;

public class SmartPhone {
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private String mobileAgenct; 
	
	public SmartPhone(){
		
	}
	
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgenct){
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgenct = mobileAgenct;
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
	
	public void setMobileAgenct(String mobileAgenct) {
		this.mobileAgenct = mobileAgenct;
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
	public String getMoileAgenct() {
		return mobileAgenct;
	}
	
	public String information() {
		return brand+", "+pCode+", "+pName+", "+price+", "+mobileAgenct;
	}
}
