package com.kh.chap01_poly.part01_basic.model.vo;

public class Child2 extends Parent{
	
	private int n;

	public Child2() {
		super();
	}

	public Child2(int x, int y, int n) {
		super(x, y);
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return "child2 [n=" + n + ", toString()=" + super.toString() + "]";
	}
	
	public void printChild2() {
		System.out.println("두 번째 자식에서 호출됨.");
	}
	
	@Override
	public void print() {
		System.out.println("두번째 자식");
	}
	

}
