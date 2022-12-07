package com.kh.array;

import java.util.Scanner;

public class A_Array {
	/*
	 * 변수 : 하나의 공간에 하나의 값을 담을 수 있음.
	 * 		 ex) int a = 10;
	 * 			 a = 20;
	 * 
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수가 있음.(단, 같은 자료형의 값으로만 가능)
	 * 		 정확히 얘기하자면 배열의 각 인덱스 자리에 실제 값이 담김(인덱스 0부터 시작.)
	 * 		 ex) int[] a = new int[3]; // int형의 자료가 들어갈 수 있는 공간을 3개 만든다.
	 * 								   // 방, 사물함 [0] [1] [2]을 3개 만듬.
	 * 								   // 인덱스는 항상 0부터 시작한다.(중요) 
	 * 								   // 배열의 크기느 3, 마지막 인덱스 = 2
	 * 								   // 배열의 크기 100, 마지막 인덱스 = 99
	 * 								   // 항상 크기 = n, 마지막 인덱스 = n-1
	 * 
	 */
	
	public void method1() {
		// 배열을 왜 써야할까
		// 만약에 변수만을 가지고 프로그래밍을 하게 되면
		// 0, 1, 2, 3, 4 기록해야 됨
		
		/*
		 * 변수로 이용하여 각각의 데이터를 보관하자고할때 -> 각각의 변수를 만들어서 따로 관리해야함.
		 * 
		 * int num1=0;
		 * int num2=1;
		 * int num3=2;
		 * int num4=3;
		 * int num5=4;
		 * 
		 * 출력할 때는 -> 일일이 출력해야 함. 반복문 사용 안됨.
		 * 
		 * for(int i=1; i<=5; i++){
		 * 	 System.out.println(num+i);
		 * }
		 * 
		 * 1. 배열을 가지고 프로그래밍 하기
		 * 0, 1, 2, 3, 4
		 * 
		 * [표현법]
		 * 자료형 [] 배열명;
		 * 자료형 배열명 [];
		 * int a; //변수
		 * int[] a; //배열
		 * int a[]; //배열
		 * 
		 * 2) 배열 할당
		 * 이 배열에 몇 개의 값들을 보관할건지 배열의 크기를 지엉해주는 과정
		 * 지정한 갯수만큼 값이 들어갈 방이 생성함.
		 * [표현법]
		 * 배열명 = new 자료형[배열의 크기]
		 * 
		 * a = new int[5];
		 */
		
		int [] arr = new int[5];
		/*
		 * 3. 배열의 각 인덱스(=방번호) 자리에 값대입
		 * [포현법]
		 * 배열명[인덱스] = 값;
		 * 
		 * arr[0] =0;
		 * arr[1] = 1;
		 * arr[2] = 2;
		 * arr[3] = 3;
		 * arr[4] = 4;
		 */
		
		// 배열의 가장 큰 장점 : 반복문을 할용할 수 있다.
		for(int i = 0; i < 5; i++) {
			// 0 1 2 3 4
			arr[i] = i;
		}
		
		// 배열의 for문을 활용해 값을 입력, 출력도 가능함.
		for(int i = 0;i<5; i++) {
			System.out.printf("%d번 인덱스의 값 : %d \n",i,arr[i]);
		}
		
		// 각각의 인덱스값을 확인하기 위해서는 []블럭을 통해 내가 확인하고자 하는 인덱스(방번호)를 제시해줘야함.
		// 그럼 arr에 전체담겨있는 값을 확인하고 싶다면?
		System.out.println(arr);// 실제 arr이라는 값에 주소값이 담겨있음.
		// [I@587d1d39 여기서 @기준으로 우측은 참조하고 있는 heap 영역의 주소값
		// [ : 배열임을 나타냄
		// I : int 자료형을 의마함.
	}
	
	public void method2() {
		
		int i = 10; //일반 변수. i라는 박스에 10이라는 값이 그냥 담겨있음.
		int[] arr = new int[5];
		//배열 자료형
		/*
		 * 우선 대입연산자기준 왼쪽이 먼저 실행되므로 arr이라는 int형배열 박스가 먼저 만들어짐.(stack영역에)
		 * 그 다음int[5]짜리 방이 heap영역에 생성됨.(new키워드가 붙은 녀석은 항상 heap영역에 값이 할당됨)
		 * 5칸 짜리 방이 만들어진 후에 각방에 기본값으로(int 0으로)데이터가 초기화되고, 주소값이 할당됨(0x123)
		 * 마지막으로 대입연산자가 실행되면서 주소값이 arr에 할당이 됨.
		 */
		System.out.println("i : "+i);
		System.out.println("arr : "+arr);
		System.out.println("arr의 해시코드값 : "+arr.hashCode());
		//해시코드 : 주소값을 10진수의 형태로 변환한것
		
		double[] dArr = new double[3];
		System.out.println("dArr : "+dArr);
		System.out.println("dArr의 해시코드값 : "+dArr.hashCode());
		
		/*
		 * 기본자료형(boolean, char, byte, short, int, long, float, double)
		 * => 실제 값(리터럴)을 바로 stack영역에서 담을 수 있는 변수 => 일반변수
		 * 
		 * 그 외 자료형(int[], double[], short[], ..., String, Scanner, ..)
		 * -> 주소 값을 담고 있는 변수 => 참조 변수(레퍼런스 변수)
		 */
	}
	
	public void method3() {
		int[] iArr = new int[3]; //iArr[0] == 0
		double[] dArr = new double[3]; //dArr[0] == 0
		
		for(int i=0; i<iArr.length; i++) { //0, 1, 2
			System.out.println(iArr[i]);
		}
		for(int i=0; i<dArr.length;i++) {
			System.out.println(dArr[i]);
		}
		/*
		 * 내가 각 인덱스 초기화하지 않았는데도 값들이 담겨있는 이유
		 * -> heap이라는 영역에는 절~때로 빈 공간이 존재할 수 없기때문.
		 * 따라서 jvm이 각 공간에 각 자료형의 기본값으로 초기화(대입)을 시켜줌.
		 * 
		 * ++ 배열의 크기를 아는 방법 => 배열명.length
		 */
	}
	
	public void method4() {
		int[] arr = new int[5];
		
		//각 배열의 인덱스에 값을 대입하는 반복문
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;// arr[0]=1, arr[1]=2, arr[2]=3, arr[3]=4, arr[4]=5		
		}
		System.out.println(arr[4]);
		//System.out.println(arr[5]);
		/*
		 * ArrayIndexOutOfBoundsException
		 * 배열의 인덱스 범위를 벗어남.
		 */
	}
	
	public void method5() {
		
		int i = 0;
		String str = null;
		
		//int i2 = null; typeMissMatch -> null값을 int자료형에 넣을 수 없음.
		int[] arr = null; //null값 할당가능. 주소값을 담을 수 있는 변수의 기본값은 null;
		
		//System.out.println(arr.hashCode());
		/*
		 * 기본값이 null인 변수를 가지고 메소드를 호출한다거나 특정 어딘가에 접근하고자한다면
		 * 무조건 오류발생 -> NullPointerException
		 * ex) arr.hashCode(), arr.length
		 */
	}
	
	public void method6() {
		int[] arr = new int[5];
		
		/*
		 * arr[0] = 2;
		 * arr[1] = 4;
		 * arr[2] = 6;
		 * arr[3] = 8;
		 * arr[4] = 10;
		 */
		
		//방법0
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = (i+1)*2;
//			System.out.println("arr["+i+"] = "+arr[i]);
//		}
		
		int value = 2;
		for(int i=0; i<arr.length;i++) {
			//방법 1.
			//arr[i] = (i+1)*2;
			//arr[0] = 1*2;
			//arr[1] = 2*2;
			//...
			//arr[4] = 5*2;
			
			//방법2.
			arr[i] = value;
			value += 2;
		}
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//arr[6] = 100;
		/*
		 * 배열의 가장 큰 단점
		 * 한번 지정한 배열의 크기는 변경 불가능함.
		 * => 배열의 크기를 변경하고자한다면 어쩔수없이 새로운배열을 다시 만들어야함.
		 */
		System.out.println("===== arr 변경전 =====");
		System.out.println(arr);
		System.out.println("arr의 해시코드값 : "+arr.hashCode());
		
		arr = new int[7];
		
		System.out.println("===== arr 변경후 =====");
		System.out.println(arr);
		System.out.println("arr의 해시코드값 : "+arr.hashCode());
		/*
		 * 항상 고유한 주소값 부여, 기존에 생성되었던주소와 절!대로 겹치지 않는다.
		 * 기존에 참조하고 있던 연결이 끊기고 새로운 곳 참조
		 * 
		 * 연결이 끊어진 기존의 배열은 Heap영역에 둥둥 떠다님
		 * 일정 시간이 지나고서도, 사용이 되지 않으면 "가비지 컬렉터(GC)"가 삭제시켜줌.
		 * => 자바에서 자동메모리관리 특징, 개발자가 코드에만 신경쓸 수 있게 해줌.
		 */
		
		// 현재 연결되어있는 고리를 끊고자 할때
		arr = null; //null : 아무것도 존재하지 않음을 의미
	}
	
	public void method7() {
		// 배열 선언과 동시에 할당(크기 지정)
		int[] arr = new int[4];
		// 각 인덱스에 값 초기화(대입)
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		// 배열 선언 및 동시에 초기화(대입) 까지 한번에 끝내는 방법 2가지
		// 방법1.
		int[] arr1 = new int[] { 1, 2, 3, 4};
		
		// 방법2.
		int[] arr2 = {1,2,3,4};
		
		// 배열 비교
		System.out.println(arr1 == arr2);
		// arr1 -> arr1의 heap영역의 "주소값"
		// arr2 -> arr1의 heap영역의 "주소값"
		// 주소값 == 주소값 : 주소값간에 동등비교를 수행하기때문에 false
	}
	
	public void method8() {
		//1. 크기 10짜리 정수(int)배열 선언.
		//2. 반복문을 활용해서 0번인덱스부터 마지막 인덱스까지 순차적으로 접근하면서 값을 대입. 대입하는 값은 랜덤값(1~100)
		//3. 반복문 활용해서 0번인덱스부터 ~ 마지막인덱스까지 배열에 담긴값 출력.
		//   출력예시) arr[x] : xx
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int) (Math.random()*100+1);
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
		}
	}
	
	public void method9() {
		//1. 시용자에게 매번 키의 정보를 입력받은 후 해당 크기만큼 문자열 배열생성
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		
		int size = sc.nextInt();
		
		String [] arr = new String[size];
		
		//2. 반복문을 활용해서 매번 사용자에게 과일명을 입력받아 그 값을 매~ 인덱스자리에 대입
		sc.nextLine();
		for(int i=0; i<arr.length; i++) {
			System.out.print("좋아하는 과일 입력 : ");
			arr[i] = sc.nextLine();
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void method10() {
		// 사용자에게 문자열을 하나 입력받은 후
		// 각각의 문자들을 char 배열에 옮겨담기
		
		// 1. 사용자에게 문자열 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		// 2. char배열 생성해두기 (배열 크기 == 문자열의 길이만큼)
		char[] arr = new char[str.length()];
		
		// 3. 문자열에서 각 인덱스별로 문자를 뽑아서 char배열의 각 인덱스에 담기
		//    arr[0] = 문자열.charAt();
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
			//4. char배열의 각 인덱스에 있는 값들 출력하기
			System.out.println(arr[i]);
		}
	}
	
	public void method11() {
		Scanner sc = new Scanner(System.in);
		// 1. 사용자에게 배열의 길이 입력받은 후, 해당 크기만큼 정수배열 생성
		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		// 2. 반복문 활용해서 0번인덱스부터 마지막 인덱까지 순차적으로 접그하면서 값 대입
		//    ->랜덤값(1~100)
		// 3. 반복문 할용해서 0번인덱스부터 ~ 마지막인덱스까지 배열에 담긴 값 출력과 동시에,
		//    해당 인덱스에 담긴 값이 짝수인 경우 그 값들의 총합 구하기
		int sum=0;
		
		for(int i=0; i<size; i++) {
			arr[i] = (int)(Math.random()*100+1);
			System.out.println("arr["+i+"] : "+arr[i]);
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
		}
		System.out.println("총합 : "+sum);
	}
	
	public void method12() {
		Scanner sc = new Scanner(System.in);
		
		double[] heights = new double[3];
		
		// 1. 반복문을 활용해서 heights배열의 0번인덱스부터 마지막인덱스까지 반복을 진행하면서 사용자로부터 키에대한정보(cm)를 입력받아 각 인덱스에 저장
		// 2. 3명의 키에대한 정보를 출력 시키면서 동시에 모든 키에 대한 총합을 저장
		// 3. 3명의 키의 총합을 출력하고, 3명의 키의 평균도 출력 단, 소숫점 첫째자리까지 출력)
		
		double sum = 0;
		
		for(int i=0; i<heights.length; i++) {
			System.out.print("키를 입력하세요(cm) : ");
			heights[i] = sc.nextDouble();
		}
		
		for(int i=0; i<heights.length; i++) {
			sum += heights[i];
			System.out.printf("heights[%d] : %.1f \n", i, heights[i]);
		}
		System.out.printf("키의 총합: %.1f\n",sum);
		System.out.printf("키의 평균: %.1f",sum/3);
		
	}
	
}
