package com.kh.pratice.chap02_abstractAndInterface.controller;

import com.kh.pratice.chap02_abstractAndInterface.model.vo.*;

public class PhoneController {
	private String[] result = new String[2];
	private Phone[] p = new Phone[2];

	public String[] method() {
 		p[0] = new GalaxyNote9();
 		p[1] = new V40();
 		for(int i=0; i<p.length; i++) {
 			if(p[i] instanceof GalaxyNote9) {
 				result[i] = ((GalaxyNote9) p[i]).printInformaiton();
 			}else {
 				result[i] = ((V40)p[i]).printInformaiton();
 			}
 		}
 		return result;
	}
}
