package com.kh.third.run;

import com.kh.third.MethodTest;	//MethodTest 클래스를 사용하기위해 임포트 추가

public class Run {

	public static void main(String[] args) {
		
		//1. 사용하고자하는 클래스 임포트
		MethodTest mt = new MethodTest();
		
		//2. 내가 실행하고자하는 일반메소드 실행
		mt.printMethodA();	//StackOverflowError 발생(MethodTest클래스안 printMethodC 메서드안에 printMethodA(); 구문이 있을 시)
		
		System.out.println("메인 메서드 종료!");
	}

}
