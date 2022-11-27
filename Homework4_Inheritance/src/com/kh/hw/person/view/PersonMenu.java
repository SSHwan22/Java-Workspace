package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in) ;
	private PersonController pc =  new PersonController(); 
	
	public void mainMenu() {
		while(true){
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 0명입니다." );
		System.out.print("1. 학생 메뉴");
		System.out.print("2. 사원 메뉴");
		System.out.print("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		int numMenu = sc.nextInt();
		switch(numMenu) {
		case 1:
			studentMenu();
			break;
		case 2:
			employeeMenu();
			break;
		case 9:
			return;
		}
		
		}
	}
	public void studentMenu() {
		insertStudent();
		printStudent();
	}
	public void employeeMenu() {
		insertEmployee();
		printEmployee();
	}
	public void insertStudent() {
		
	}
	public void printStudent() {
		
	}
	public void insertEmployee() {
		
	}
	public void printEmployee() {
		
	}

}
