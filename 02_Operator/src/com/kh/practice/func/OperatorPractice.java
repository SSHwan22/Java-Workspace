package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int persons = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candys = sc.nextInt();
		

		
		System.out.println("1인당 사탕 개수 : "+candys/persons);
		System.out.println("남는 사탕 개수 : "+candys%persons);
		System.out.println("");
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		 
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다. \n", grade, classNum, num, name,(gender=='M' ? '남' : gender == 'F' ? '여' : "잘못된 성별"),  score );
		System.out.println("");
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = age<=13 ? "어린이" : age<=19 ? "청소년" : "성인";
		
		System.out.println(result);
		System.out.println("");
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor+eng+math;
		double avg = sum/3.0;
		
		String result = (kor>=40 && eng>=40 && math>=40) && avg>=60 ? "합격" : "불합격";
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println(result);
		System.out.println("");
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char num = sc.nextLine().charAt(7);
		
		String gender = (num=='1' || num=='3') ? "남자" : (num=='2' || num=='4') ? "여자" : "다시 입력해주세요";
		System.out.println(gender);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num2<num3) || (num3<=num1) ? true : false;
//		String result = num1<num2 ? (num1>=num3) || (num3>num2) ? "true" : "false" : "잘못된 입력!";
		
		System.out.println(result);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int input1 = sc.nextInt();
		System.out.print("입력2 : ");
		int input2 = sc.nextInt();
		System.out.print("입력3 : ");
		int input3 = sc.nextInt();
		
		System.out.println(input1==input2 && input2==input3 ? true : false);
						//input1 == input2 == input3 형식은 자바에서는 지원하지 않는다.
						// a=b
						// b=c 가 같다면
						// a=c 는 같다.
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int aNum = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int bNum = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int cNum = sc.nextInt();

		double aSum = aNum*1.4;
		double bSum = bNum*1;
		double cSum = cNum*1.15; //cNum*0.15+cNum와 같은데 소수점의 자리가 다르다.
		
		System.out.println("A사원 연봉/연봉+a : "+aNum+'/'+aSum+'\n'+(aSum>= 3000 ? "3000 이상" : "3000 미만"));
		System.out.println("B사원 연봉/연봉+a : "+bNum+'/'+bSum+'\n'+(bSum>= 3000 ? "3000 이상" : "3000 미만"));
		System.out.println("C사원 연봉/연봉+a : "+cNum+'/'+cSum+'\n'+(cSum>= 3000 ? "3000 이상" : "3000 미만"));
	}

}
