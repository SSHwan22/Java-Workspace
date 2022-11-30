package com.kh.exception.run;

import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.B_CheckedException;
import com.kh.exception.controller.C_CustomException;

public class ExceptionRun {
	public static void main(String[] args) {
		/*
		 * 에러(오류) 종류
		 * - 시스템 에러 : 컴퓨터의 오작동으로 인해 발생하는 에러 => 소스코드로 해결 안됨(심각한 에러)
		 * - 컴파일 에러 : 소스코드상의 문법적인 문제로 발생하는 에러 => 소스코드 수정으로 해결(빨간줄로 오류 알려줌)
		 * - 런타임 에러 : 소스코드상으로는 ㄴ문제가 없는데 프로그램 실행 중 발생하는 에러
		 * 				=> 사용자의 잘못일수도 있고 개발자가 예측해야 하는데 하지 못한 경우
		 * - 논리	 에러 : 소스코드상으로 문제 없고, 샐행했을 때도 에러가 발생하지 않지만, 의도한대로 결과가 나오지 않는 경우
		 * 
		 * 시스템 에러를 제외한 컴파일 에러, 런타임 에러, 논리 에러와 같은 비교적 덜 심각한 것들을 가지고 작업을 함.
		 * 이런 것들을 "예외"라고 부름.(Exception)
		 * 
		 * 이러한 예외들이 발생했을경우에 대비해서 처리하는 방법을 정의해두는것을 "예외처리"라고 한다.
		 * 
		 * 예외처리를 해야하는 이유 : 예외 발생시 프로그램이 비정상적으로 종료되는것을 막기위함.
		 * 
		 * 예외처리방법
		 * 1. try ~ catch (직접처리)
		 * 2. throws 이용 (떠넘기기)
		 */
		
		A_UncheckedException aue = new A_UncheckedException();
			
//		aue.method1();
//		aue.method2();
//		aue.method3();
		
		B_CheckedException bce = new B_CheckedException();
//		bce.method1();
		
		//throw : throw뒤에 있는 예외를 강제적으로 발생시킴.
		throw new C_CustomException("예외가 발생했습니다.");
	}
}
