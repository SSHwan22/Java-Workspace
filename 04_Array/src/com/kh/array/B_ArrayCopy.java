package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	/*
	 * 배열 복사
	 * - 얕은 복사 : 배열의 주소값만 복사 
	 * 
	 * - 깊은 복사 : 동일한 새로운 배열을 하나 더 만들어서 실제 내부값들을 복사
	 */
	
	//배열복사
	public void method1() {
		//원본 배열 셋팅
		int[] origin = {1,2,3,4,5};//요 데이터 복사하기
		
		System.out.println("=== 원본 배열 출력 ===");
		for(int i=0; i<origin.length;i++) {
			System.out.print(origin[i]+" ");
		}
		
		// 단순하게 origin을 다시 copy본 배열에 대입.
		int[] copy = origin; //얕은 복사
		System.out.println("\n\n=== 카피본 출력 ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		
		copy[2] = 99;
		
		System.out.print("\n\n== 본사본 배열 수정 후 ==");
		System.out.println("\n=== 원본 배열 출력 ===");
		for(int i=0; i<origin.length;i++) {
			System.out.print(origin[i]+" ");
		}
		
		System.out.println("\n\n=== 카피본 출력 ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		
		// 복사본 배열만 가지고 수정을 했는데도 원본배열도 함께 수정이 된다.
		// 이유는 얕은복사가 이루어졌기때문 => 배열의 주소값이 복사되어
		// 원본과 복사본은 사실상 동일한 데이터를 공유하고 있다.
		System.out.println("\n원본배열 해시코드 : "+origin.hashCode());
		System.out.println("복사본 배열 해시코드 : "+copy.hashCode());
	}
	
	//깊은복사 첫번째
	public void method2() {
		
		//1. for문 방법(수작업)
		// 새로운 배열을 생성한 후 각 인덱스별로 내부값을 일일이 대업하는 방법.
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[origin.length];
		
		for(int i=0; i<origin.length; i++) {
			copy[i] = origin[i];
		}
		
		// 복사가 잘 이루어졌는지 출력
		for(int i=0; i<copy.length;i++) {
			System.out.print(copy[i]+" ");
		}
		copy[2] = 99;
		
		System.out.print("\n\n== 본사본 배열 수정 후 ==");
		System.out.println("\n=== 원본 배열 출력 ===");
		for(int i=0; i<origin.length;i++) {
			System.out.print(origin[i]+" ");
		}
		
		System.out.println("\n\n=== 카피본 출력 ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		
		System.out.println("\n원본배열 해시코드 : "+origin.hashCode());
		System.out.println("복사본 배열 해시코드 : "+copy.hashCode());
	}
	
	// 자바에서 제공하는 다양한 메서드 사용해서 배열을 복사
	public void method3() {
		// 2. 새로운 배열을 생성한 후 System클래스에서 array copy메서드를 이용
		
		int[] origin = {1,2,3,4,5};
		
		int[] copy = new int[10];
		
		//System.arraycopy(원본 배열명, 원본배열의 복사를 시작할 인덱스, 복사본 배열명, 복사본 배열의 복사될 시작 인덱스, 복사할 갯수)
		//System.arraycopy(origin, 0, copy, 0, 5); // 1 2 3 4 5 0 0 0 0 0
		//System.arraycopy(origin, 0, copy, 2, 5); // 0 0 1 2 3 4 5 0 0 0
		//System.arraycopy(origin, 2, copy, 1, 3); // 0 3 4 5 0 0 0 0 0 0 
		System.arraycopy(origin, 2, copy, 9, 2);
		//인덱스의 범위를 벗어난 복사는 불가능함.
		// 0 0 0 0 0 0 0 0 3 4
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
	}
	
	public void method4() {
		 // 3. Arrays클래스에서 제공하는 copyOf 메소드를 이용한 복사
		
		int[] origin = {1, 2, 3, 4, 5};
		
		//복사본 배열 = Arrays.copyOf(원본배열명, 복사할 갯수)
		int[] copy = Arrays.copyOf(origin, 3); //copy배열의 크기 == 복사할 갯수
		
		for(int i = 0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		
		/*
		 * 2. System.arraycopy 메소드 : 몇번 인덱스부터 몇 개를 어느 위치의 인덱스에 복사할 것인지 세밀하게 지정가능.
		 * 
		 * 3. Arrays.copyOf 메소드 : 무조건 원본 배열의 0번 인덱스부터 내가 제시한 갯수만큼 복사 진행됨. 내가 제시한 길이가 원본베열도 크다면 나머지에는 0값으로 채워서 복사해줌.
		 */
	}
	
	public void method5() {
		// 4. clone메소드 사용
		int[] origin = {1, 2, 3, 4, 5};
		
		//복사본 배열 = 원본배열.clone();
		int[] copy = origin.clone();// 인덱스 직접 지정x, 복사할 갯수 지정x
									// 무조건 원본배열과 동일한 녀석이 반환됨.
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		/*
		 * Arrays.toString(배열)
		 * -> 앞과 뒤에 [] 각 값마다 ,를 넣어서 하나의 문자열로 연이어서 출력해주는 메서드
		 */
		System.out.println("원본배열의 해시코드 : "+origin.hashCode());
		System.out.println("복사본배열의 해시코드 : "+copy.hashCode());
	}
}
	
