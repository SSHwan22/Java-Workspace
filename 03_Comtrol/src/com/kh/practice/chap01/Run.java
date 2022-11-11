package com.kh.practice.chap01;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ControlPractice cp = new ControlPractice();
		//cp.practice1();
//		cp.practice2();
//		cp.practice3();
//		cp.practice4();
//		cp.practice5();
//		cp.practice6();
//		cp.practice7();
//		cp.practice8();
//		cp.practice9();
//		cp.practice10();
//		cp.practice11();
		
		System.out.print("실행번호 : ");
		int num = sc.nextInt();
		
			switch(num) {
		
			case 1 :
				cp.practice1();
				break;
			case 2 :
				cp.practice2();
				break;
			case 3 :
				cp.practice3();
				break;
			case 4 :
				cp.practice4();
				break;
			case 5 :
				cp.practice5();
				break;
			case 6 :
				cp.practice6();
				break;
			case 7 :
				cp.practice7();
				break;
			case 8 :
				cp.practice8();
				break;
			case 9 :
				cp.practice9();
				break;
			case 10 :
				cp.practice10();
				break;
			case 11 :
				cp.practice11();
				break;
			default :
				System.out.println("잘못된 실행번호!\n");
				main(args);
			}
		}
}
