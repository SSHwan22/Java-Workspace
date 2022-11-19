package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("어린왕자","솔","생텍쥐페리");
		Book book3 = new Book("해리포터", "발행자", "J.k.롤링", 25000, 0.1);
		
		book1.inform();
		book2.inform();
		book3.inform();
		
	}

}
