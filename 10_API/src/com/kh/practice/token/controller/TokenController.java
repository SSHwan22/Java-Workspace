package com.kh.practice.token.controller;

import java.util.StringTokenizer;


public class TokenController {
	
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		StringTokenizer stt = new StringTokenizer(str, " ");
		String get = "";
		
		//방법1. String클래스 이용
//		while(stt.hasMoreTokens()) {
//			get += stt.nextToken();
//		}
		
		//방법2. StringBuffer or StringBuilder를 이용
		StringBuilder sb = new StringBuilder();
		
		while(stt.hasMoreTokens()) {
			sb.append(stt.nextToken());
		}
		
//		return get;
		return sb.toString();
	}
	
	public String firstCap(String input) {
		String a = input.substring(0, 1).toUpperCase();  //0이상 1이상 1미만의 인덱스범위를 잘라온다.
		String b = input.substring(1, input.length());
		return a.concat(b);
	}
	
	public int findChar(String input, char one) {
		int count = 0;
		
//		for(int i=0; i<input.length(); i++){
//			if(input.charAt(i)== one) {
//				count++;
//			}
//		}
		
		char arr[] = input.toCharArray();
		for(char in : arr) {
			if(in==one) {
				count++;
			}
		}
		return count;
	}
}
