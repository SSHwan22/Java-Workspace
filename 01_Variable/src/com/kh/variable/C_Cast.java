package com.kh.variable;

public class C_Cast {
	/*
	 * 형변환 : 값의 자료형을 바꾸는 개념
	 * 
	 * 컴퓨터 상에서의 값 처리 규칙
	 * 1. 대입연산자(=)를 기준으로 왼쪽과 오른쪽은 같은 자료형이여야 함.
	 *    => 즉, 같은 자료형에 해당하는 값만 대입이 가능합니다.
	 *    => 다른 자료형의 값을 대입하고자 한다면 "형변환"이 필수.
	 * [표현법] 자료형 변수명 = (바꿀 자료형) 값;
	 * 
	 * 2. 같은 자료형끼리만 연산 가능.
	 *    => 즉, 다른 자료형끼리 연산을 수행하고 싶으면 한 구문은 "형변환"을 해야함.
	 * [표현법] 값 + (바꿀자료형) 값;
	 * 	  => dNum + (double) iNum;	
	 * 
	 * 형변환의 종류
	 * 1. 자동 형변환 => 자동으로 형변환이 진행되기 때문에 내가 직접 형변환할 필요가 없음.
	 *   		   => 작은 바이트의 자료형 -> 큰 바이트의 자료형
	 *   
	 * 2. 강제(명시적)형변환	=> 자동 형반환이 되지 않아 내가 직접 강제로 형변환을 해야하는 경우
	 *                  => 큰 바이트의 자료형 -> 작은바이트의 자료형
	 *                  
	 * [표현법] (바꿀자료형) 값;
	 * 
	 * (바꿀 자료형) == 형변환연산자 == cast 연산자
	 * 
	 * ** boolean은 형변환 불가. **
	 * 
	 */
	
	//자동형변환 : 작은 바이트의 자료형이 큰 바이트의 자료형으로 형반환 되는 경우
	public void autoCasting() {
		
		//1. int (4byte) -> double(8byte)
		
		int i1 = 10;
		double d1= /*(double)*/i1; // 자동으로 형변환이 되었다.
								   // 컴퓨터 표장용상자에 휴대폰을 담은꼴과 비슷함.
								   // 그런데 int는 정수, double은 실수자료형임.
								   // d1은 10 -> 10.0으로 형변환이 된다.
		System.out.println("d1 : "+d1);
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result = /*(double)*/i2 + d2; // 12.0 + 3.3 => 15.3
		System.out.println(i2 +" + "+ d2 + " = " + result);
		
		//2. int(4byte) -> long(8byte)
		int i3 = 1000;
		long l3 = /*(long)*/i3; //1000
		
		long l4 = 2000;	// L을 붙이지 않아도 문제가 없는 이유 : 자동형변환이 되기 때문
		
		// 3. 특이케이스 long(8byte) - float(4byte)
		// 정수가 실수로 담길 떄에는 큰 사이즈의 정수여도 작은 사이즈의 실수변수에 대입 가능.
		// 아무리 4byte float라고 해도 long형보다 담을 수 있는 값의 범위가 더 크기떄문에
		// float형이 실수이기 때문에 long형보다 표현가능한 범위의 수가 더 커서 자동형변환이 이루어짐.
		
		long l5 = 10000000000L;	//정수 10000000000은 int로 표현할 수 있는 범위가 넘었기에 오류가 나 뒤에 L를 붙여준다.
		float f5 = /*(float)*/l5;
		System.out.println("f5 : " + f5);
		
		// 4. 특이케이스 char(2byte) <-> int(4byte) : 양방향 형변환 가능.
		char ch = 65;
		System.out.println("ch : "+ch);
		
		int num = 'A';
		System.out.println("num : "+num);
		
		/*
		 * char의 범위 0~65xxx :	각 문자마다 고유의 정수값이 정해져있다. 따라서 쌍방향 변환이 가능하다.
		 * 					   	음수 값은 오류가 난다.
		 * 참고 : 아스키코드표(0~127, 영문자 대소문자, 숫자, 특수문자)
		 *       유니코드표(0~65xxx, 영어, 숫자, 특수문자, 한글, 그외 언어)
		 */
		
		System.out.println((int)'김');
		
		char sum = 'A'+10;	//65+10 문자와 정수 사이에 연산이 가능하다.
		System.out.println(sum);
		
		//5. 특이케이스 byte와 short간의 연산
		byte b1 = 1;
		byte b2 = 10;
		
		// byte로 연산시 연산결과의 정수값은 무조건 int로 취급한다.
		byte b3 = (byte)(b1+b2);// 강제로 형변환을 해줘야 함.
	}
	
	//강제(명시적)형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 형변환 할 경우.
	public void forceCast() {
		// 1. double(8byte) -> float(4byte)
		float f1 = 4.0f; // 반드시 f를 붙여줘야함.
		double d2 = 8.0;
		
		float f2 = (float)d2;
		
		// 2. double(8byte) -> int(4byte)
		double d3 = 10.89;
		int i3 = (int)d3; //10.89 -> 10
		
		System.out.println("i3 : "+i3);
		
		int iNum = 10;
		double dNum = 5.89;
		
		// iNUm이 double형으로 우선 변환이됨. 10 -> 10.0
		// 10.0+5.89= 15.89 실수값이 반환됨
		// 연산결과 실수(double)자료형이므로 int형에 대입이 불가능하다.
		// 해결방법 1. 연산결과를 int형으로 맞춰서 강제변환.
		int iSum = (int)(iNum + dNum); //15
		
		// 해결방법 2. 덧셈 연산전에 dNum를 미리 int형으로 강제 형변환
		//           자동형변환은 작은 바이트변수가 큰 바이트 변수로 형변환 되기 때문에
        //			 큰바이트인 dNum변수를 강제로 int형으로 변환시킨것.
		int iSum2 = iNum + (int)dNum; //15
		
		// 실수값을 정수형으로 강제형변환시 소수점아래 부분은 버려짐(데이터손실 발생.)
		
		// 해결방법3. 애초에 결과값을 double형 변수에 담기.(데이터 손실없이 정확한 값이 담김)
		double dSum = iNum + dNum; //15.89
		
		System.out.println("iSum : " +iSum+", iSum2 : "+iSum+", dSum : "+dSum);
		
		/* 데이터 손실 테스트 */
		int iNum2 = 290;
		byte bNum2 = (byte)iNum2;
		
		// byte의 범위 : -128~127
		// 290-34 = 256 데이터 손실
		System.out.println("bNum2 : "+bNum2);
		
		
		
		
		
		
		
	}
}
