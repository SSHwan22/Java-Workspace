package com.kh.practice.chap02_abstractAndInterface.model.vo;

public interface Phone {
	char[] NUMBERPAD = new char[]{'1','2','3','4','5','6','7','8','9','*','0','#'};
	
	String makeCall();
	String takeCall();
}
