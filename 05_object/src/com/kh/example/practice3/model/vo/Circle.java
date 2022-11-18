package com.kh.example.practice3.model.vo;

public class Circle {
	private static final double PI = 3.14;
	private int radius = 1;
	
	
	public Circle() {
		getAreaOfCircle();
		getSizeOfCircle();
	}
	
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	
	public void incrementRadius() {
		//radius += 1;
		radius++;
		getAreaOfCircle();
		getSizeOfCircle();
	}
	
	//원의 둘레 2*반지름*원주율
	public void getAreaOfCircle() {
		System.out.println(2*radius*PI);
	}
	
	//원의 넓이 반지름*반지름*원주율
	public void getSizeOfCircle() {
		System.out.println(radius*radius*PI);
	}
}
