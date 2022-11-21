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
		switch(num) {
		case 3 :
			triangleMenu();
			break;
		case 4 :
			squareMenu();
			break;
		case 9 :
			System.out.println("프로그램을 종료합니다.");
			break;
		default :
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
		int type = 3;
		switch(menuNum) {
			case 1: case 2: 
				inputSize(type, menuNum);
				break;
			case 3:
				printlnformation(type);
				
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				break;
			default :
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
				triangleMenu();
		}
	}
	public void squareMenu() {
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		int type = 4;
		switch(menuNum) {
		case 1: case 2: case 3: 
			inputSize(type, menuNum);
			break;
		case 4:
			printlnformation(type);
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
			break;
		default :
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			squareMenu();
	}

	}
	
	public void inputSize(int type, int menuNum) {
		if(type==3) {
			switch (menuNum) {
			case 1:
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				System.out.println("삼각형 면적 : "+tc.calcArea(height, width));
				triangleMenu();
				break;
			case 2:
				System.out.print("색깔을 입력하세요 : ");
				sc.nextLine();
				String color = sc.nextLine();
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다.");
				triangleMenu();
				break;
			}
			
		}else if(type == 4) {
			switch (menuNum) {
			case 1:
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				scr.calcPerimeter(height, width);
				System.out.println("사각형 둘레 : "+scr.calcPerimeter(height, width));
				squareMenu();
				break;
			case 2:
				System.out.print("높이 : ");
				height = sc.nextDouble();
				System.out.print("너비 : ");
				width = sc.nextDouble();
				scr.calcArea(height, width);
				System.out.println("사각형 면적 : "+scr.calcArea(height, width));
				squareMenu();
				break;
			case 3:
				System.out.print("색깔을 입력하세요 : ");
				sc.nextLine();
				String color = sc.nextLine();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다.");
				squareMenu();
				break;
			}
		}
	}
	
	public void printlnformation(int type) {
		switch(type) {
		case 3:
			System.out.println(tc.print());
			triangleMenu();
			break;
		case 4:
			System.out.println(scr.print());
			squareMenu();
			break;
		}
		
	}
	
}
