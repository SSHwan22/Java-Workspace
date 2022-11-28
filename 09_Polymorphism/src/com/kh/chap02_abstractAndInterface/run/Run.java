package com.kh.chap02_abstractAndInterface.run;

import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		//Sports s = new Sport();
		// 추상클래스로 절대 생성불가 => 미완성된 클래스이기 때문.
		
		Sports s;// 단, 객체 생성만 완될뿐 레퍼런스 변수로는 사용 가능.
		
		s = new Football();// 즉, 다형성을 적용해서 자식객체를 받아주는 용도로는 사용 가능.
		
		Sports[] arr = new Sports[2];
		arr[0] = new Football();
		arr[1]= new Basketball();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();
		}
		/*
		 * 추상클래스
		 * - 미완성된 클래스 abstract class
		 * - 객체생성 불가.(단, 레퍼런스 변수로는 선언가능)
		 * - 추상메서드가 존재하는 순간 반드시 추상클래스로 정의
		 * 	 (일반필드 + 일반메소드 + [추상메서드(생략가능)]
		 * 
		 *   단, 추상메서드가 굳이 없어도 추상클래스로 둘 수 있긴함.
		 *   언제? => 클래스가 아직 구체적으로 덜 구현된 상태인것으로 보이는 경우(개념적)
		 *   	  => 현재 이 클래스를 객체 생성이 불가하게끔 하고자 할 때 (기술적)
		 *   
		 *   - 객체 생성 불가
		 *   단, 레퍼런스 변수로는 사용가능(다형성 적용 가능)
		 *   
		 *   
		 *   추상메서드
		 *   - 미완성된 메서드롤 몸통부가 {}가 구현되어 이지 않은 메서드
		 *   - 자식클래스에서 오버라이딩을 통해 완성됨(강제로 오버라이딩 해야 함)
		 *     => 오버라이딩 하지 않을 경우 에러 발생
		 *     => 메서드 사용의 통일서 확보 목적
		 *     => 표준화된 틀을 제공할 목적
		 */
		
	}

}
