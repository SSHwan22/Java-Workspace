package com.kh.third;

public class MethodTest {
	
	
	public void printMethodA() {
		System.out.println("프린트메서드A 출력중!!!");
		
//		System.out.println(); //자바에서 기본으로 제공하는 System 클래스의 메서드
		
		printMethodB();//printMethodA메서드 안에 printMethodB 메서드 실행
	}

	public void printMethodB() {
		System.out.println("프린트메서드B 출력중!!!");
		
		printMethodC();//printMethodB메서드 안에 printMethodC 메서드 실행
	}
	
	public void printMethodC() {
		System.out.println("프린트메서드C 출력중!!!");
		
		//printMethodA();//printMethodC메서드 안에 printMethodA 메서드 실행
		
	}
}