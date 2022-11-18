package com.kh.chap04_field.model.vo;

public class Test {

	public static void main(String[] args) {
		FieldTest2 f2 = new FieldTest2();
		
		//public -> 어디서든 직접 접근가능
		System.out.println(f2.pub);
		
		//protected -> 같은 패키지에서는 직접 접근가능,
		//			   다른 패키지에서는 직접 접근불가
		System.out.println(f2.pro);
		
		//default -> 같은 패키지에서만 직접 접근가능.
		System.out.println(f2.df);
		
		//private
		//System.out.println(f2.pri);
		
	}

}
