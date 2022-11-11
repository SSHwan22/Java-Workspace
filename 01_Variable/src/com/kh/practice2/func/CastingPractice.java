package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {
	
	public void score() {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("국어 : ");
	double korea = sc.nextDouble();
	System.out.print("영어 : ");
	double english = sc.nextDouble();
	System.out.print("수학 : ");
	double math = sc.nextDouble();
	
	int sum = (int)(korea+english+math);
	int avg = sum/3;
	
	System.out.println();
	System.out.printf("총점 : %d \n", sum);
	System.out.printf("평균 : %d \n", avg);

	
	}
}
