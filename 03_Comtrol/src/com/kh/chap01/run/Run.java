package com.kh.chap01.run;

import java.util.Scanner;

import com.kh.chap01.condition.A_If;
import com.kh.chap01.condition.B_Switch;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		A_If ai = new A_If();
		B_Switch bs = new B_Switch();
		
		System.out.print("class(A/B) : ");
		char chap = sc.nextLine().charAt(0);
		
		System.out.print("실행번호 : ");
		int num = sc.nextInt();
		
		int numA = num;
		int numB = num;
		
		if(chap=='A' || chap=='a' ) {
			switch(numA) {
		
			case 1 :
				ai.method1();
				break;
			case 2 :
				ai.method2();
				break;
			case 3 :
				ai.method3();
				break;
			case 4 :
				ai.method4();
				break;
			case 5 :
				ai.method5();
				break;
			case 6 :
				ai.method6();
				break;
			case 7 :
				ai.method7();
				break;
			default :
				System.out.println("잘못된 실행번호!\n");
				main(args);
			}
			
		}else if(chap=='B' || chap=='b') {
			switch(numB) {
			
			case 1:
				bs.method1();
				break;
			case 2:
				bs.method2();
				break;
			case 3:
				bs.method3();
				break;
			case 4:
				bs.method4();
				break;
			default :
				System.out.println("잘못된 실행번호!\n");
				main(args);
			}
			
		}else {
			System.out.println("잘못된 클래스!\n");
			main(args);
		}
		
	}
}
