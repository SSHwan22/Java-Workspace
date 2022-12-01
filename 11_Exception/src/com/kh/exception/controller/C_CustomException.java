package com.kh.exception.controller;

public class C_CustomException extends RuntimeException{
	
	/*
	 * 특정상황에서 발생하는 에러를 내가 직접 핸들링하는 방법.
	 * 
	 * 1. 예외처리용 클래스를 만든 후 Exception클래스를 상속받음.
	 * 
	 * 2. super키워드를 통해 부모생성자에 생성자의 매개변수로 msg(메세지)값을 전달.
	 * 
	 * 3. 부모생성자에서 msg내용을 호출하면서 예외처리함.
	 */
	
	public C_CustomException() {
		
	}
	
	public C_CustomException(String msg) {
		super(msg);
	}
}
