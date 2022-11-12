package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>1) {
			for(int i=1; i<=num; i++) {
				System.out.print(i+" ");
			}
		}else {
			System.out.println("1이상의 숫자를 입력하세요. \n");
			practice1();
			
		}
	}
	
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 1) {
			for (int i = num; 1 <= i; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력하세요. \n");
			practice2();
		}
	}
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int result = 0;
		
		for(int i=1; i<=num; i++) {
			result += i;
			if(i==num) {
				System.out.print(i);
			}else {
			System.out.print(i+"+");
			}
		}
		System.out.println("="+result);
	}
	
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if (num1 > 0 && num2 > 0) {
			if (num1 < num2) {
				for (; num1 <= num2;) {
					System.out.print(num1++ + " ");
				}
			} else {
				for (; num1 >= num2;) {
					System.out.print(num2++ + " ");
				}
			}
		} else {
			System.out.println("1이상의 숫자를 입력하세요. \n");
			practice4();
		}
	}
	
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if(dan<=9) {	
		for(; 9>=dan; dan++) {
			System.out.println("===== "+dan+"단 =====");
			}
		}else {
			System.out.println("9 이하의 숫자만 입력하세요.\n");
			practice5();
		}
	}
	
	
	public void practice6() {	//미완성
		Scanner sc = new Scanner(System.in);

		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		for(int i=0; i<10; i++) {
			System.out.print(num1 +" ");
			if(false) {
			num1+=num2;
			}
			else {
				num1-=num2;
			}
		}
		
		}
	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++){
			for(int j=1; j<=i; j++){
			System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++){
			for(int j=num; j>=i; j--){
			System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++){
			for(int j=1; j<=num; j++) {
				if(j<=num-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	
}
	public void practice11() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num; j++) {
				if(j<i) {
					System.out.print(" ");
				}else {
				System.out.print("*");
				}	
			}
			System.out.println();
		}
	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=1; j<num-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
	}
}
