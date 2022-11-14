package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		String menu = "";
		
		switch(num) {
		case 1 :
			menu = "입력";
			break;
		case 2 :
			menu = "수정";
			break;
		case 3 :
			menu = "조회";
			break;
		case 4 :
			menu = "삭제";
			break;
		case 7 :
			menu = "종료";
			//System.out.println("프로그램이 종료됩니다."); //밑에 if문 안 쓸 시 
			return;
		}
		if(menu.equals("종료")) {
		System.out.println("프로그램이 종료됩니다.");
		}else {
			System.out.printf("%s 메뉴입니다.\n",menu);
		}
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			if(num%2==0) {
				System.out.println("짝수다.");
			}else {
				System.out.println("홀수다.");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 :");
		int kor = sc.nextInt();
		System.out.print("수학점수 :");
		int math = sc.nextInt();
		System.out.print("영어점수 :");
		int eng = sc.nextInt();
		
		int sum = kor+math+eng;
		double avg = sum/3.0;
		
		if(kor>=40 && math>=40 && eng>=40 && avg>=60) {
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("수학 : %d\n", math);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("합계 : %d\n", sum);
			System.out.printf("평균 : %.1f\n", avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 2: case 12:
			System.out.printf("%d월은 겨울입니다.\n", month);
			break;
		case 3: case 4: case 5:
			System.out.printf("%d월은 봄입니다.\n", month);
			break;
		case 6: case 7: case 8:
			System.out.printf("%d월은 여름입니다.\n", month);
			break;
		case 9: case 10: case 11:
			System.out.printf("%d월은 가울입니다.\n", month);
			break;
		default :
			System.out.printf("%d월은 잘못 입력된 달입니다.\n", month);
		
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pass = sc.nextLine();
		
		if(id.equals("minmin")) {	//아이디값이 잘 입력했는지 체크
			if(pass.equals("Min1234")) { //비밀번호를 잘 입력했는지 체크
				System.out.println("로그인 성공");
			}else {	//비밀번호 틀렸을 때
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else { //아이디값이 틀렸을 때
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String level = sc.nextLine();

		switch(level) {
		case "관리자" :
			System.out.print("회원관리, 게시글 관리, ");
		case "회원" :
			System.out.print("게시글 작성, 댓글 작성, ");
		case "비회원" :
			System.out.println("게시글 조회");
			
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg/(height*height);
		
		String result;
		
		if(bmi<18.5) {
			result = "저체중";
		}else if(bmi<23) {
			result = "정상체중";
		}else if(bmi<25) {
			result = "과체중";
		}else if(bmi<30) {
			result = "비만";
		}else {
			result = "고도 비만";
		}
		
		System.out.println("BMI 지수 : "+bmi+'\n'+result);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		double num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		double num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		
		double result = 0;
		
		if(num1>0 && num2>0) {
			switch(op) {
			case '+' :
				result = num1 + num2;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case '*' :
				result = num1 * num2;
				break;
			case '/' :
				result = num1 / num2;
				break;
			case '%' :
				result = num1 % num2;
				break;
			default :
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
		}else {
			System.out.println("입력값이 정수가 아닙니다.");
			return;
		}
		
		System.out.printf("%d %c %d = %f",(int)num1,op,(int)num2,result);
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int midE = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int finalE = sc.nextInt();
		System.out.print("과제 점수 : ");
		int ass = sc.nextInt();
		System.out.print("출석 점수 : ");
		int att = sc.nextInt();
		
		
		double midR = midE * 0.2;
		double finalR = finalE * .3;
		double assR = ass * 0.3;
		double attR = (double)att/20*20;
		
		
		double sum = midR+finalR+assR+attR;
		
		System.out.println("================= 결과 =================");

		
		if(sum>=70) {
			System.out.println("중간 고사 점수(20) : "+midR);
			System.out.println("기말 고사 점수(30) : "+finalR);
			System.out.println("과제 점수    (30) : "+assR);
			System.out.println("출석 점수    (20) : "+attR);
			System.out.println("총점 : "+sum);
			System.out.println("PASS");
		}else if(sum<70 || (double)(att-20)/20>=0.3) {
			System.out.println("중간 고사 점수(20) : "+midR);
			System.out.println("기말 고사 점수(30) : "+finalR);
			System.out.println("과제 점수    (30) : "+assR);
			System.out.println("출석 점수    (20) : "+attR);
			System.out.println("총점 : "+sum);
			System.out.println("Faill [출석 회수 부족 ("+att+'/'+20+")]");
		}
	}
	
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. PF");
		System.out.print("선택 : ");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1: 
			practice1();
			break;
		case 2: 
			practice2();
			break;
		case 3: 
			practice3();
			break;
		case 4: 
			practice4();
			break;
		case 5: 
			practice5();
			break;
		case 6: 
			practice6();
			break;
		case 7: 
			practice7();
			break;
		case 8: 
			practice8();
			break;
		case 9: 
			practice9();
			break;
		}
	}
	
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비밀번호 입력(1000~9999) : " );
		int num = sc.nextInt();
//		String num0 = num+""; 
//		
//		char num1 = num0.charAt(0);
//		char num2 = num0.charAt(1);
//		char num3 = num0.charAt(2);
//		char num4 = num0.charAt(3);
//		
//		if(999<num&&num<=9999) {
//		if(num1==num2 || num1==num3 || num1==num4 || num2==num3 || num2==num3 || num3==num4){
//			System.out.println("중복 값 있음");
//		}else {
//			System.out.println("생성 성공");
//		}
//		}else {
//			System.out.println("자리 수 안 맞음");
//		}
		
//이걸 왜 했지....
//		//중복값
		int num1 = (num)%10; //1000
		
		//정수 길이
		int length = (int)(Math.log10(num)+1);
		if(num>0) {
			if(num > 999 && num < 9999){
				int first = (num)%10; //1000
				int second =(num/10)%10; //100
				int third = (num/100)%100; //10
				int forth = (num/1000)%10; //1
				if(first != second && first != third && first != forth && second != third && second != forth && third != forth) {
					System.out.println("생성 성공");
				}else {
					System.out.println("중복 값 있음");
				}
			}else {
				System.out.println("자릿수 안 맞음");
			}
			}System.out.println("1~9사이의 정수를 입력해주세요.");
			
		
	}
}