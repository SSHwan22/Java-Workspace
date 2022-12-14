package com.kh.practice.chap02_abstractAndInterface.model.vo;

public class V40 extends SmartPhone implements NotePen{
	
	public V40() {
		setMaker("LG");
	}
	
	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}
	@Override
	public String takeCall() {
		return "전화받기 버튼을 누름";
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
		return false;
	}
	@Override
	public String printInformaiton() {
		String result = "V40는 "+getMaker()+"에서 만들어졌고 제원은 다음과 같다.\n";
			result += makeCall()+"\n";
			result += takeCall()+"\n";
			result += picture()+"\n";
			result += charge()+"\n";
			result += touch()+"\n";
			result += "불루투스 펜 탑재 여부 : "+bluetoothPen();
			return result;
		
	}
	
}
