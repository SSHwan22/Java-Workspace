package com.kh.pratice.chap02_abstractAndInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	
	public GalaxyNote9() {
		setMaker("삼성");
	}
	
	@Override
	public String makeCall() {
		return "통화버튼을 누름";
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
		return true;
	}
	
	@Override
	public String printInformaiton() {
		return "갤럭시 노트9은 "+getMaker()+"에서 만들어졌고 제원은 다음과 같다.\n"
				+ "번호를 누르고 "+makeCall()+"\n"
				+takeCall()+"\n"
				+picture()+"\n"
				+charge()+"\n"
				+touch()+"\n"
				+"불루투스 펜 탑재 여부 : "+bluetoothPen();
	}
}