package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayForeach {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30};
		
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		/*
		 * 여태까지 사용했던 반복문 : for loop, 기본 반복문
		 * 새롭게 배울 반복문: 향상된/개선된 for문 
		 * 
		 * for each문(향상된 for문, 개선된 for문)
		 * 배열 또는 컬렉션과 상용됨
		 * 배열 또는 컬렉션의 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근할 목적일 때
		 * 
		 * 초기식 조건식 증감식 없음.
		 * 반복하는 획수는 배열 또는 컬렉션의 크기.
		 * 
		 * for(순차적으로 접근한 값을 담아주 변수선언 : 순차적으로 접근할 배열/컬렉션){
		 * 	 실행할 코드
		 * }
		 */
		int [] arr2 = {40, 50, 60};
		
		for(int num: arr2) {
		// arr2라는 배열은 0부터 순차적으로 접근하면서 int num이라는 변수에
		// arr2의 각 인덱스의 값을 저장함.
			System.out.println(num);
		}
		
		Phone[] phones =  new Phone[3];
		
		phones[0] = new Phone("갤럭시","zplip3","삼성",1000000);
		phones[1] = new Phone("갤럭시","zplip4","삼성",1350000);
		phones[2] = new Phone("갤럭시","zfold4","삼성",2000000);
		
		int sum = 0;
		for(Phone phone : phones) {
			System.out.println(phone.information());
			sum += phone.getPrice();
		}
		System.out.println("총 합계 : "+sum);
		System.out.println("총 평균 : "+sum/phones.length);
		
		// 사용자에게 구매하고자하는 폰의 이름을 입력받고
		// 구매하고자하는 핸드폰이 phones배열에 있으면
		// "xx핸드폰의 가격은 xxxx원 입니다."
		// 구매하고자하는 핸드폰이 없다면
		// "해당핸드폰이 없습니다."
		Scanner sc = new Scanner(System.in);
		
		System.out.print("폰 이름 : ");
		String phoneName = sc.nextLine();
		
		int find = 0;
		for(Phone phone : phones) {
			if(phone.getSeries().equals(phoneName)) {
				find++;
				System.out.println(phone.getSeries()+"핸드폰의 가격은 "+phone.getPrice()+"원 입니다.");
				break;
			}//else {	//여기에 else를 넣으면 안되는 이유 : 첫번쨰 반복에서 조건과 맞지 않아 else로 넘어가고 break를 만나 끝난ㄷ.
						//그래서 break를 빼면 반복할 때마다 조건 flase면 else로 실행하고 조건 true면 true일 떄의 실행문이 실행되어서
						//반복된 만큼의 출력이 나온다.
			//	System.out.println("해당 핸드폰이 없습니다.");
			//	break;
			//}
		}
		if(find==0) {
		System.out.println("해당 핸드폰이 없습니다.");
		}

	}

}
