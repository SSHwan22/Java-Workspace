package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("총, 균, 쇠","가","나작가");
		Book book3 = new Book("어린왕자", "발행자", "생 머시기", 30000, 0.1);
		
		book1.inform();
		book2.inform();
		book3.inform();
		
	}

}
