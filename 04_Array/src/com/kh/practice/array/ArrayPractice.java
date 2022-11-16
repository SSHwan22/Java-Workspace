package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		int length = arr.length;
		for(int i=0;i<arr.length; i++) {
			arr[i] = 10-i;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice4() {
		String[] str = new String[]{"사과","귤","포도","복숭아","참외"};
		System.out.println("str[1] : "+str[1]);
		
	}
	
	public void practice5() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] chA = new char[str.length()];
		
		int count = 0;
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ",str,ch);
		for(int i=0; i<str.length(); i++) {
			chA[i] = str.charAt(i);
			
			if(chA[i]==ch) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.printf("\n%c 개수 : %d\n",ch,count);
	}
	
	public void practice6() {
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		String[] str = new String[] {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		
		if(num>=0 && num<=6) {
		System.out.println(str[num]);
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice7() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] numArr = new int[num];
		
		for(int i=0; i<num;i++) {
		System.out.print("배열"+ i+"번째 인덱스에 넣을 값 : ");
		numArr[i] = sc.nextInt();
		
		}
		int sum = 0;
		for(int i=0; i<num; i++) {
			System.out.print(numArr[i]+" \n");
			sum+=numArr[i];
		}
		System.out.println("총합 : "+ sum);
		
	}
	
	public void practice8() {
		System.out.print("정수 : ");
		int size = sc.nextInt();
		
		if(size < 3 || size % 2== 0) {
			System.out.println("다시 입력하세요.");
			practice8();
		}else {
			int [] arr = new int[size];
			for(int i=0; i<=size/2;i++) {
				arr[i] = 1+i;
			}
			int value = 1;
			for(int i=size/2+1; i<arr.length; i++) {
				arr[i] = size/2+1 - value;
				value++;
			}
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+ (i == arr.length-1 ? "" : ", "));
			}
		}
	}
	
	public void practice9() {
		System.out.println("치킨 이름을 입력하세요. :");
		String menu = sc.nextLine();
		
		String[] menuArr = new String[] {"양념","간장","후라이드","파닭","뿌링클"};
		
//		for(int i=0; i<menuArr.length; i++) {
//			if(menuArr[i].equals(menu)) {
//				System.out.println(menu+"배달 가능");
//				break;
//			}else {
//				System.out.println(menu+"은 없는 메뉴입니다.");
//				break;
//			}
		for(int i=0; i<menuArr.length; i++) {
			if(menuArr[i].equals(menu)) {
				System.out.println(menu+"치킨 배달 가능");
				return;
			
			}
		}
		System.out.println(menu+"치킨은 없는 메뉴입니다.");
		
	}
}
