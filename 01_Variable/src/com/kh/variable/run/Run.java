package com.kh.variable.run;

import com.kh.variable.*;


public class Run {
	
	public static void main(String[] args) {
		
		A_Variable av = new A_Variable();
	
		//av.printVariable(); //av의 월급 출력 메서드 
		//av.declareVariable(); //av의 자료형 출력 메서드
		//av.initVariable(); //av의 자료형 초기화 출력 메서드
		//av.constantVariable(); //av의 상수 출력 메서드
		
		B_KeyboardInput bk = new B_KeyboardInput();
		
		//bk.inputTest1();
		//bk.inputTest2();
		
		C_Cast cc = new C_Cast();
		
		//cc.autoCasting();
		//cc.forceCast();
		
		D_Printf dp = new D_Printf();
		dp.printFtest();
		
	}
}
