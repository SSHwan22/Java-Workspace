package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public class Basketball extends Sports{

	@Override
	public void rule() {
		System.out.println("손으로 공을 던져서 골대에 넣어줘야 함.");		
	}
	/*
	 * 미완성된 클래스인 추상클래스를 상속받게 되면, 부모클래스에 있는 추상메소드를 강제로 오버라이딩 해줘서 완성시켜야함.
	 */
	
	
	
	
}
