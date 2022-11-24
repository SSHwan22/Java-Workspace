package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.*;

public class Run {

	public static void main(String[] args) {
		Airplane a = new Airplane("콜럼비아호",0.02,"여객기",16,5);
		Car c = new Car("테슬라",12.5,"전기차",4);
		Ship s = new Ship("낚시배", 3, "원양어선", 2);
		
		System.out.println(a.information());
		System.out.println(c.information());
		System.out.println(s.information());
		
		a.howToMove();
		s.howToMove();
		c.howToMove();
	}

}
