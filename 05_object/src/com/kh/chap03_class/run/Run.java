package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Member;
import com.kh.chap03_class.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setterpName("아이폰14");
		p1.setterPrice(1750000);
//		p1.setterBrand("애플");// brand필드에 "애플"로 값이 이미 초기화 되어 있어서, brand명 지정 시 애플상품이라면 초기화하지 않아도 됨. 
		
		System.out.println(p1.information());
		
		Product p2 = new Product();
		p2.setterpName("갤럭시 z플립4");
		p2.setterPrice(1350000);
		p2.setterBrand("삼성");
		
		System.out.println(p2.information());
		
		Member m1 = new Member();
		m1.printName();
		m1.changeName( "황수환");
		m1.printName();
	}

}
