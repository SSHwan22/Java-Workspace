package com.kh.pratice.chap02_abstractAndInterface.run;

import com.kh.pratice.chap02_abstractAndInterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
	PhoneController pc = new PhoneController();
	String[] arr = pc.method();
	for(String str : arr) {
	System.out.println(str+"\n");
	}
	}

}
