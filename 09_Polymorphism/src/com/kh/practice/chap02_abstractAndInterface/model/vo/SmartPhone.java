package com.kh.pratice.chap02_abstractAndInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	private String maker;

	public SmartPhone() {
		super();
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public String getMaker() {
		return maker;
	}
	
	public abstract String printInformaiton();
}
