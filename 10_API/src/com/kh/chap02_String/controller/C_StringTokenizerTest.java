package com.kh.chap02_String.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		String str = "Java,Oracle,JDBC,HTML,CSS,JavaScript,Server";
		
		// 구분자를 제시해서 해당 문자열을 분리시키는 방법
		// 방법 1. 분리된 문자열들을 String[]배열에 차곡차곡 담아서 관리하는 방법
		//		  문자열.split(구분자) : String[]
		String[] arr = str.split(",");
//		for(int i=0; i<arr.length; i++) {
//		System.out.println(arr[i]);
//		}
		
		// 문자열 배열의 경우 for문을 다음과 같이 쓸 수 있다. : 향상된 for문
		// for( 값을 받아줄 변수 : 순차적으로 접근할 배열){
		// }
		for(String lang : arr) {
			System.out.println(lang);
		}
		
		System.out.println("========================================");
		
		//방법 2. 분리된 각각의 문자열들을 토큰으로 취급하고 싶을 때
		//		 java.util.StringTokenizer 클래스를 이용하는 방법
		//		 StringTokenizer stn = new StringTokenizer(분리시키고자 하는 문자열, 구분자);
		String str2 = "Java Oracle JDBC HTML CSS JavaScript Server";
		StringTokenizer stn = new StringTokenizer(str2, " ");
		System.out.println("분리된 문자열의 갯수 : "+stn.countTokens());
		
		while(stn.hasMoreTokens()) { // 다음토큰이 있으면 true, 없으면 false
		System.out.println(stn.nextToken()); 
		}
		System.out.println(stn.hasMoreTokens()); //stn의 토큰을 다 출력후 hasMoreTokens메서드를 출력하니깐 false
		
	}
	
}
