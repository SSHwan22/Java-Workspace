package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	Student[] sArr = ssm.printStudent(); // ssm.printStudent()의 반환 값(sArr)를 Student[] sArr에다가 대입한다.
										 // 배열변수에 대입을 한하면 sArr자리에 ssm.printStudent()를 넣어줘야 한다.
	public StudentMenu(){
		System.out.println("========== 학생 정보 출력 ==========");
		//방법 1
		for(int i=0; i<sArr.length;i++) {
			System.out.println(ssm.printStudent()[i].inform());
			}
		
		//방법 2
//		for(int i=0; i<ssm.printStudent().length;i++) {
//		System.out.println(ssm.printStudent()[i].inform());
//		}
		
		System.out.println();
		
		System.out.println("========== 학생 성적 출력 ==========");
		System.out.println("학생 점수 합계 :"+(int)ssm.avgScore()[0]);
		System.out.println("학생 점수 평균 :"+ssm.avgScore()[1]);
		System.out.println();
		
		System.out.println("========== 학생 결과 출력 ==========");
		
		//방법 1-1
		for(Student std : ssm.printStudent()) {
			String result = "통과";
			if(std.getScore() < StudentController.CUT_LINE) {
				result = "재시험 대상";
			}
			System.out.printf("%s학생은 %s입니다.\n", std.getName(), result);
		}
		//방법 1-2
//		for(Student std : ssm.printStudent()) {
//			String result = "통과";
//			if(std.getScore() < StudentController.CUT_LINE) {
//				result = "재시험 대상";
//			}
//			System.out.printf("%s학생은 %s입니다.\n", std.getName(), result);
//		}
		
		//방법 2-1
//		for(int i=0; i<sArr.length;i++) {
//			System.out.print(sArr[i].getName()+"은 ");
//			if(StudentController.CUT_LINE > sArr[i].getScore()) {
//				System.out.println("재시험 대상입니다.");
//			}else {
//				System.out.println("통과입니다.");
//			}
//		}
		//방법 2-2
//		for(int i=0; i<ssm.printStudent().length;i++) {
//			System.out.print(ssm.printStudent()[i].getName()+"은 ");
//			if(StudentController.CUT_LINE > ssm.printStudent()[i].getScore()) {
//				System.out.println("재시험 대상입니다.");
//			}else {
//				System.out.println("통과입니다.");
//			}
//		}
		
	}
}
