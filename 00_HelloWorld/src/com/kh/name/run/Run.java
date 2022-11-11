package com.kh.name.run;

import com.kh.name.MyName;	//class파일(.java파일) MyName의 풀네임(패키지는 소문자 class는 대문자로 시작하여 패키지와 class를 구분 지을수 있다.) 
							//패키지는 이중에서 삼중으로 구성 ex) com.kh.name.클래스
public class Run {
	
	public static void main(String[] args) {
	
		MyName nm = new MyName();
		nm.callMyName();
		
	}
}
