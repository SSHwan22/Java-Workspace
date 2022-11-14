package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	/*
	 * break; | break문을 만나는 순간 현재 숙해있는 반복문을 빠져나감.
	 * -> 즉, 가장가까운 반복문만 빠져나감.
	 * 
	 * 주의할 점 : switch문 안의 break; 와는 다른 개념.
	 * 			 switch문 안의 break는 해당 switch문만 빠져나가는 용도.
	 */
	
	public void method1() {
		// 매번 반복적으로 발생되는 랜덤값(1~100) 출력
		//그 랜덤값이 3의 배수일 경우에만 반복문을 종료;
		
		while(true) {
			// 랜덤값 추출
			int random = (int)(Math.random()*100+1);
			// 랜덤값을 출력
			System.out.println("random : "+random);
			// 랜덤값이 3의 배수인지 검사
			if(random%3==0) {
				break;
			}
		}	
	}
	
	public void method2() {
		//매번 사용자에게 문ㅁ자열을 입력받은 후 해당 문자열의 길이 출력
		//단, 사용자가 입력한 문자열이 "exit" 인 경우 반복문을 종료
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			if(str.equals("exit")) {
				break;
			}
			System.out.println(str+"의 길이는 : "+str.length());
		}
	}
	
	public void method3() {
		// 매번 반복적으로 사용자에게 양수를 입력받아 1 ~ 사용자가 입력한 수까지 출력
		// 단, 정상적으로 양수를 입력했을시 1 ~ 사용자가 입력한 수까지 출력을 하고 종료
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("양수 입력 : ");
			int num = sc.nextInt();
			
			if(num > 0) { // 양수로 제대로 입력한 경우 -> 1~num 출력 후 종료
				for(int i = 1; i<=num; i++) {
					System.out.print(i+" ");
				}
				break;
			}else { // 잘못 입력 시 -> 다시 입력하라는 출력문
				System.out.println("잘못입력했습니다. 다시입력해주세요.");
			}
		}
	}
}
