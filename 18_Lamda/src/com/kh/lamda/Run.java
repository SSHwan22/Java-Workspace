package com.kh.lamda;

public class Run {
	/*
	 * 람다식이란? 익명함수(제목이 없는 함수)처럼 구동됨. (java8버전 이후부터 사용가능)
	 * 실제로는 익명구현객체(이름없는 클래스)를 생성하여 내부에 내가 작성한 코드를 실행시키는 방식으로 구동됨.
	 * 
	 * 람다식의 장점 : 표현이 간결해지고, 가독성이 좋다.
	 * 			    내부적으로 람다식이 활동된 메서드가 많다.
	 * 		  단점 : 람다식에 대해 이해도가 부족하면 알아보기 힘듬.
	 * 
	 * [표현식]
	 * 변수 변수명 = (매개변수) -> {구현코드};
	 * 
	 */
	//람다식 기본 활용
	// 1) 매개변수가 없고 리턴값도 없는 람다식
	
	@FunctionalInterface // 내부적으로 1개의 미구현 함수를 지닌 인터페이스(람다식으로 사용할 인터페이스)
	public interface lamda{
		void test();
	}
	
	// 2) 매개변수가 잇고 리턴값은 없는 람다식
	@FunctionalInterface
	public interface lamda2{
		void test(int number);
	}
	
	
	// 3) 매개변수가 없고 리턴값은 있는 람다식
	@FunctionalInterface
	public interface lamda3{
		String test();
	}
	
	// 4) 매개변수가 있고 리턴값도 있는 람다식
	@FunctionalInterface
	public interface lamda4{
		int test(int a);
	}
	
	public static void main(String[] args) {
//		lamda l;
//		l = () -> { System.out.println("lamda");}; l.test();
		lamda l = () -> { System.out.println("lamda");}; l.test();
		
		lamda2 l2 = (a) -> {
			System.out.println("안녕하세요"+a);
		}; 
		l2.test(12);
			
		lamda3 l3;
		l3 = () -> "하이";
		System.out.println(l3.test());
		
	lamda4 l4 = a -> a*a; // 매개변수가 하나면 () 생략가능, 코드가 단순 return문이 끝이면 {} 생략가능.
	
	System.out.println(l4.test(5));
	}

	
}
