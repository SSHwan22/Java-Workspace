package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student hong = new Student();
		
		hong.setGrade(3);
		hong.setClassroom(2);
		hong.setName("홍길동");
		hong.setHeight(188);
		hong.setGender('남');
		
		hong.information();
	}

}
