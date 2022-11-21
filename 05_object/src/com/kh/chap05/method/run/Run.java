package com.kh.chap05.method.run;

import com.kh.chap05.method.controller.*;

public class Run {

	public static void main(String[] args) {
		MethodTest1 mt1 = new MethodTest1();
		mt1.method1();
		int random = mt1.method2();
		System.out.println("랜덤값 : "+random);
		
		mt1.method3(10, 21);
		System.out.println(mt1.method4(42, 5));
		
		System.out.println("================================================");
		
		// static 메소드의 경우에 new 문으로 객체를 생성할 필요가 없다.
		// static이 붙은 클래스변수와 마찬가지로, 메소드 또한 프로그램 실행시 정적메모리영역에 저장되기때문.
		MethodTest2.method1();
		
		System.out.println(MethodTest2.method2());
		
		MethodTest2.method3("민경민", 33);
		
		System.out.println(MethodTest2.method4(110));
	}

}
