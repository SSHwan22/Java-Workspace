package com.kh.chap_01_beforeVsafter.after.model.vo;

public class Tv extends Product{
	private int inch;
	
	public Tv() {
		
	}
	
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode,  pName, price);
		this.inch = inch;
	}
	
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public int getInch() {
		return inch;
	}
	
	public String information() {
		return super.information()+", inch : "+inch;
	}
}
