package com.kh.chap03_class.model.vo;

public class Product {
	// 클래스 선언 구문에 사용 가능한 접근제한자 : public, default
	// public으로해야 다른 패키지에서 접근가능
	// default로 설정한 경우 같은 패키지에서만 접근 가능. / 다른 패키지에서 접근 불가
	
	// 상품명, 상품가격, 프랜드
	private String pName;
	private int price;
	private String brand = "애플";
	
	//setter메서드 public void 메서드명(자료형 메서드변수명){}
	public void setterpName(String name) {
		this.pName = name;
	}	
	public void setterPrice(int price) {
		this.price = price;
	}
	public void setterBrand(String brand) {
		this.brand = brand;
	}
	
	
	public String getterpName() {
		return pName;
	}
	public int getterPrice() {
		return price;
	}
	public String getterBrand() {
		return brand;
	}
	
	
	public String information() {
		return "상품명 : "+pName+", 가격 : "+price+"원, 브랜드 : "+brand;
	}
}
