package com.kh.practice.chap02_abstractAndInterface.run;

import com.kh.practice.chap02_abstractAndInterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
	String[] arr = new PhoneController().method();
	for(String phones : arr) {
	System.out.println(phones);
	}
	}

}
