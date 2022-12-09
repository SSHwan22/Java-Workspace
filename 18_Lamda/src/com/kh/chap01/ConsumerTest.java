package com.kh.chap01;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

import com.kh.model.vo.Product;

public class ConsumerTest {

	/*
	 * Consumer 인터페이스 특징
	 * 1. 주로 소비자 역할을 띈 함수를 작성할 때 사용.
	 * 2. 매개변수가 있고, 리턴값은 없다.
	 * 3. 내부적으로 accept()메서드 한 개만 구현되지 않은 형태로 존재
	 */
	
	// 1) Consumer<T> : 인자 값 1개
	static Consumer<String> c1 = (str) -> System.out.println(str+"구매 하였습니다.");
	
	// 2) xxxConsumer : xxx인자 값 1개 리턴x
	static IntConsumer c2 = (point) -> System.out.println("현재 귀하의 잔고는 "+point+"입니다");
	
	// 3) BiConsumer<T, U> : 인자 값이 2개를 받음.
	static BiConsumer<String, Integer> c3 = (product, price) -> {
		System.out.println(product+"의 가격은 "+price+"원 입니다.");
	};
	
	// 4) ObjXXXConsumer<T> : T타입인자 1개 + XXX타이의 인자 값 1개를 가짐.
	static ObjIntConsumer<Product> c4 = (product, price) -> {
		System.out.println(product.getpName()+"의 가격은 "+price+"원 입니다.");
	};
	
	public static void main(String[] args) {
		c1.accept("갤럭시 z플립4");
		c2.accept(40000);
		c3.accept("갤럭시 z플립4", 1350000);
		c4.accept(new Product("갤럭시 z플립4",0,1), 1350000);
	}
}
