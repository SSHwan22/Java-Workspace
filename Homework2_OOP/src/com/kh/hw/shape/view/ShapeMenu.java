package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		if(num==3) {
			triangleMenu();
		}else if(num==4) {
			squareMenu();
		}else if(num==9) {
			System.out.println("프로그램을 종료합니다.");
		}else {
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			inputMenu();
		}
	}
	
	public void triangleMenu() {
		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		inputSize(3, menuNum);
	}
	public void squareMenu() {
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		if(num==1) {
			System.out.print("높이 : ");
			double height = sc.nextDouble();
			System.out.print("너비 : ");
			double width = sc.nextDouble();
			scr.calcPerimeter(height, width);
		}else if(num==2) {
			System.out.print("높이 : ");
			double height = sc.nextDouble();
			System.out.print("너비 : ");
			double width = sc.nextDouble();
			scr.calcArea(height, width);
		}else if(num==3) {
			System.out.print("색깔을 입력하세요 : ");
			String color = sc.nextLine();
			tc.paintColor(color);
		}else if(num==4) {
			printlnformation(num);
		}
		else if(num==9){
			inputMenu();
		}
	}
	
	public void inputSize(int type, int menuNum) {

	}
	
	public void printlnformation(int type) {
		if(type==3) {
			System.out.println("삼각형 "+tc.print());
		}else if(type==4) {
			System.out.println("사각형 "+scr.print());
		}
		
	}
	
}
