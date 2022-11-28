package com.kh.pratice.chap02_abstractAndInterface.controller;

import com.kh.pratice.chap02_abstractAndInterface.model.vo.*;

public class PhoneController {
	private String[] result = new String[2];
	
	public String[] method() {
		result[0] = new V40().printInformaiton();
		result[1] = new GalaxyNote9().printInformaiton();
		
		return 
	}
}
