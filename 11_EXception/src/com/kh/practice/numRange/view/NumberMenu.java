package com.kh.practice.numRange.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;

public class NumberMenu {
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		NumberController nc = new NumberController();
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		try {
		System.out.println(num1+"은(는) "+num2+"의 배수인가 ? "+nc.checkDouble(num1, num2));
		}catch ( ) {
			
		} 
		
		
		
		
	}
}
