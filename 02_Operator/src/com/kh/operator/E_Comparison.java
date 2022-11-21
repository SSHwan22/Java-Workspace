package com.kh.operator;

import java.util.Scanner;

public class E_Comparison {
	
	/*
	 * 비교연산자 (관계연산자)
	 * 두 개의 값을 가지고 비교
	 * 비교 연산하나 결과가 참일경우 true / 거짓일 경우 false값을 반환
	 * => 나중에 특정 조건을 제시할 수 있는 조건문에서 많이 사용할 예정.
	 * 
	 * 크고 작음을 비교
	 * a < b : a가 b보다 작습니까?
	 * a > b : a가 b보다 큽니까?
	 * a <= b : a가 b보다 작거나 같습니까?
	 * a >= b : a가 b보다 크거나 같습니까?
	 * 
	 * 일치함을 비교
	 * a == b : a와 b가 같습니까?
	 * a != b : a와 b가 같지 않습니까?
	 */
	
	public void method1() {
		int a = 10;
		int b = 25;
		
		System.out.println("a > b : " + (a>b));
		System.out.println("a <= b : " + (a<=b));
		
		boolean result1 = (a == b);
		System.out.println("result1 : "+result1);
		
		boolean result2 = (a != b);
		System.out.println("result2 : "+result2);
		
		//산술연산 + 비교연산
		System.out.println(a-b < 0);
		
		//어떤 값을 2로 나웠을떄 나머지값이 0이면 짝수, 1이면 홀수
		System.out.println("a가 짝수입니까 ? " + (a%2==0));
		System.out.println("b가 짝수입니까 ? " + (b%2!=1));
	}
	
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 값 한 개 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("사용자가 입력한 값은 양수입나까? "+(num>0));
		System.out.println("사용자가 입력한 값은 짝수입니까? "+(num%2==0));
	}
}
