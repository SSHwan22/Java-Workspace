package com.kh.pratice.chap02_abstractAndInterface.model.vo;

public class V40 extends SmartPhone implements NotePen{
	
	public V40() {
		setMaker("LG");
	}
	
	@Override
	public String makeCall() {
		return "통화버튼";
	}
	@Override
	public String takeCall() {
		return "전화받기";
	}
	@Override
	public String picture() {
		return "1300만 듀얼카메라";
	}
	@Override
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}
	@Override
	public String touch() {
		return "정전식, 와콤펜 지원";
	}
	@Override
	public boolean bluetoothPen() {
		return true;
	}
	@Override
	public String printInformaiton() {
		return null;
	}
	
}
