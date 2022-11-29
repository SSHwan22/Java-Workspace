package com.kh.practice.chap02_abstractAndInterface.controller;


import com.kh.practice.chap02_abstractAndInterface.model.vo.*;

public class PhoneController {
	private String[] result = new String[2];

	public String[] method() {
		Phone[] p = new Phone[2];
 		p[0] = new GalaxyNote9();
 		p[1] = new V40();
 		int count = 0;
 		for(Phone phones: p) {
 			if(phones instanceof GalaxyNote9) {
 				result[count++] = ((GalaxyNote9) phones).printInformaiton();
 			}else {
 				result[count++] = ((V40)phones).printInformaiton();
 			}
 		}
 		return result;
	}
}
