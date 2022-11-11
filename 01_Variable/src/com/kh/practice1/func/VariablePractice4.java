package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public void charIndex() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.println("\n첫 번째 문자 : "+name.charAt(0));
		System.out.println("두 번째 문자 : "+name.charAt(1));
		System.out.println("셋 번째 문자 : "+name.charAt(2));
	}
}
