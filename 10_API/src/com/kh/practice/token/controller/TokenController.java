package com.kh.practice.token.controller;

import java.util.StringTokenizer;


public class TokenController {
	
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		StringTokenizer stt = new StringTokenizer(str, " ");
		String get = "";
		while(stt.hasMoreTokens()) {
			get += stt.nextToken();
		}
		return get;
	}
	
	public String firstCap(String input) {
		String a = input.substring(0, 1).toUpperCase();
		String b = input.substring(1, input.length());
		return a.concat(b);
	}
	
	public int findChar(String input, char one) {
		int count = 0;
		char arr[] = input.toCharArray();
		for(char in : arr) {
			if(in==one) {
				count++;
			}
		}
		return count;
	}
}
