package com.kh.practice1.run;

import com.kh.practice1.func.*;

public class Run {

	public static void main(String[] args) {
		VariablePractice1 vp1 = new VariablePractice1();
		vp1.imformation();
		System.out.println("\n");
		
		VariablePractice2 vp2 = new VariablePractice2();
		vp2.operation();
		System.out.println("\n");
		
		VariablePractice3 vp3 = new VariablePractice3();
		vp3.Square();
		System.out.println("\n");
		
		VariablePractice4 vp4 = new VariablePractice4();
		vp4.charIndex();
	}
}
