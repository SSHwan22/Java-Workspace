package com.kh.stream;

import java.util.Arrays;
import java.util.List;


public class StreamMethod {

	public static void main(String[] args) {
		//steam에서 원하는 값을 얻어내기 위한 메서드들.
		
		// 1) filter : 조건에 맞는 값만 추려주는 메서드
		String [] foods = {"마라탕","마라탕","김치찜","김치찜","삼겹살","하와이안피자","김밥","짬뽕","마라샹궈","고구마스틱"};
		
		// 음식이름이 "마"로 시작하는 음시만 추리기.
		Arrays.stream(foods)
							.filter(food -> food.charAt(0)=='마')
							//.filter(food -> food.contains("마"))
							.forEach(System.out :: println);
		
		System.out.println("\n===중복값 제거===");
		
		// 2) distinct() : 중복값을 제거해주는 메서드
		List<String> arr = Arrays.asList(foods);
		
		arr.stream()
					.distinct()
					.filter(food -> food.charAt(0) == '마')
					.forEach(System.out :: println);
		
		// 3) map관련 메서드들.
		// 3-1) mapXXX : 현재요소를 XXX로 대체하여 스트림 반환
		System.out.println("\n-----맵-----");
		arr.stream()
					.map(food -> food.equals("하와이안피자") ? food+"맛없다." : food+"맛있다.")
					.forEach(System.out :: println);
		
		// 3-2) flatMapxxx : 특정요소가 여러개의 요소로 대체되는 스트림 반환.
		List<String> arr2 = Arrays.asList("마라탕 훠쿼 양꼬치 김밥","경민 호호");// ["마라탕 훠쿼 양꼬치 김밥"]
		
		// 스페이스바 기준으로 각각의 요리를 String요소로 만들기
		arr2.stream()
					.flatMap(food -> Arrays.stream(food.split(" ")))
					.forEach(System.out :: println);
		
		//3-3) asXXXStream(), boxed() : 형변환 관련 메서드
		int [] iArr = {1,3,5,7,9};
		
		// double로 형변환하여 출력
		Arrays.stream(iArr)
							.asDoubleStream()
							.forEach(System.out :: println);
		
		Arrays.stream(iArr)
							.boxed()
							.forEach( i -> System.out.println(i.hashCode()+" "));
		
		// 4) sorted() : 정렬
		Arrays.stream(iArr)
							.sorted()
							.forEach( i -> System.out.println(i));
		// 5) 루프메서드
		// 5-1) foroEach : 최종처리 스트림 -> 마지막에 호출해야 정상적으로 작동함.
		// 5-2) peek	 : 중간처리 메서드, 중간에 호출해야 정상작동함.
		
		System.out.println("\n---------------peak-------------");
		arr.stream()
					.distinct()
					.filter(food -> food.length() == 3)
					.peek(food -> System.out.println("남아있는 음식은 ??"+food))
					.forEach(System.out :: println);
		
		/*
		 * 6) 집계함수들
		 * 	  스트림의 마지막에 사용한다.
		 *    count() : 갯수 반환.
				System.out.println(arr.stream().distinct().filter(food -> food.length() ==3).count());
		 *    sum() : 함계 반환.
		 *    max() : 최대값 반환.
		 *    min() : 최소값 반환
		 *    
		 * 7) 그 외~
		 *    findFirst() : 스트림의 첫 번째 요소 반환.
		 *    findAny()   : 스트림에 값이 있다면 아무값이나 반환.
		 *    orElse()(대체값) : 값이 저장되어있지 않다면 대체값 설정가능  
		 *    
		 */
	}

}
