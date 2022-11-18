package com.kh.example.practice4.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	//초기화 블럭
	{
		grade = 0;
		classroom = 0;
		name = null;
		height = 0.0;
		gender = 0;
	}
	
	public Student(){
		
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public char getGender() {
		return gender;
	}
	
	public void information() {
		System.out.printf("%d학년 %d반 %s은 %c자이고 키가 %.1f이다.", grade, classroom, name, gender, height);
	}
}
