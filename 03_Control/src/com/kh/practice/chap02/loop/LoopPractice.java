package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력하세요. \n");
			practice1();

		}
	}

	public void practice2() {

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

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int result = 0;

		for (int i = 1; i <= num; i++) {
			result += i;
			if (i < num) {
				System.out.print(i + "+");
			} else {
				System.out.print(i);
			}

		}
		System.out.println("=" + result);
	}

	public void practice4() {

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

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		if (dan <= 9) {
			for (int i = dan; i <= 9; i++) {
				System.out.println("\n===== " + i + "단 =====");
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " + " + j + " = " + i * j);
				}
			}
			System.out.println();
		} else {
			System.out.println("9 이하의 숫자만 입력하세요.\n");
			practice5();
		}
	}

	public void practice6() {

		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.print(num1 + " ");
			num1 += num2;
		}
	}

	public void practice8() {

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice9() {

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) { // i증가-> j감소랑 중첩
//		for (int i = num; i>=1; i--) {	 //i감소-> j증가랑 중
//			for (int j = 1; j <= i; j++) { //j증가반복
//				System.out.print("*");
//			}

			for (int j = num; j >= i; j--) { // j감소반복
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice10() {

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (j >= num - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public void practice11() {

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public void practice12() {

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//	public void practice13() {
//	
//
//		System.out.print("숫자 : ");
//		int num = sc.nextInt();
//		
//		int result = 0;
//		
//		for(int i=2; i<=num; i++) {
//				if(num%i==0) {
//					System.out.println("소수가 아닙니다.");
//					return;
//				}
//			}
//		System.out.println("소수입니다.");
//	}
//	
//	
	public void practice14() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num <2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		int count = 0;
		for(int i=2; i<=num; i++) {
			boolean isPrime = true;
			//i값이 소수인지 아닌지 검사를 함.
			for(int j=2; j< i; j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i +" ");
				count++;
			}
			//i값이 소수라면 출력을 하고, 값을 1 증가시킴.
			
		}
		
		System.out.printf("2부터  %d까지의 소수의 개수는 %d개 입니다.", num,count);
	}
	
	public void practice15() {

		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();

		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			} else if (i % 2 == 0) {
				System.out.print(i + " ");
			}

			if (i % 2 == 0 && i % 3 == 0) {
				count++;
			}
		}
		System.out.println("\ncount : " + count);
	}

	public void practice16() {

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num + (num - 1); i++) {
			if (i <= num) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int k = 0; i + k <= num + (num - 1); k++) {
					System.out.print("*");
				}

			}
			System.out.println();
		}
	}

	public void practice17() {

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i <= 1 || i >= num) {
					System.out.print("*");
				} else if (j == 1 || j == num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void practice18() {

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

//		for (int i = 0; i < num + (num - 1); i++) {
//			if (i < num) {
//				for (int j = 1; j < num - i; j++) {
//					System.out.print(" ");
//				}
//				for (int k = 0; k < (i * 2 + 1); k++) {
//					System.out.print("*");
//				}
//			} else {
//				for (int j = 0; num + j <= i; j++) {
//					System.out.print(" ");
//				}
//				for (int k = 0; k <= num * 2 - ((i - num) * 2 + 4); k++) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}

		
		// 피라미드
		for (int i = 0; i < num; i++) {

			for (int j = 0; j < num - (1 + i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 1 + 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//역 피라미드
		for (int i = 0; i < num - 1; i++) {
			for (int j = 0; j < 1 + i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (num - i) * 2 - 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public void practice19() {

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num + (num - 1); i++) {	//내가 푼 풀이
			if (i < num) {
				for (int j = 1; j < num - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= (i * 2 + 1); k++) {
					if (k == 1 || k == (i * 2 + 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			} else {
				for (int j = 0; num + j <= i; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k <= num * 2 - ((i - num) * 2 + 4); k++) {
					if (k == 0 || k == num * 2 - ((i - num) * 2 + 4)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		

		
	}
}
