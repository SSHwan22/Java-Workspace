package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();

	public void mainMenu() {
		while (true) {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1:
				saveMenu();
				break;
			case 2:
				readMenu();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void saveMenu() {
		int num = 0;
		while (true) {
			System.out.println(++num + "번째 학생 정보 기록");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어 점수 : ");
			int kor = Integer.parseInt(sc.nextLine());
			System.out.print("영어 점수 : ");
			int math = Integer.parseInt(sc.nextLine());
			System.out.print("수학 점수 : ");
			int eng = Integer.parseInt(sc.nextLine());
			
			
			scr.saveScore(name, kor, eng, math, (kor+eng+math), (double)(kor+eng+math)/3);
			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			char no = sc.nextLine().charAt(0);
			if (no == 'N' || no == 'n') {
				return;
			}
		}
	}

	public void readMenu() {
		int count = 0;
		int sumAll = 0;
		double avgAll = 0.0;
		
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		double avg = 0.0;
		
		
		try {
			DataInputStream in = scr.readScore();
			System.out.printf("이름\t국어\t영어\t수학\t총점\t평균");
			System.out.println();
			
			while(true) {
				name = in.readUTF(); 
				kor = in.readInt();
				eng = in.readInt();
				math = in.readInt();
				sum = in.readInt();
				avg = in.readDouble(); 
				System.out.printf("%s\t",name);
				System.out.printf("%d\t",kor);
				System.out.printf("%d\t",eng);
				System.out.printf("%d\t",math);
				System.out.printf("%d\t",sum);
				sumAll += sum;
				System.out.printf("%s\n",avg+"".trim());
				avgAll += avg;
				count++;
//				System.out.printf("%s\t",in.readUTF());
//				System.out.printf("%d\t",in.readInt());
//				System.out.printf("%d\t",in.readInt());
//				System.out.printf("%d\t",in.readInt());
//				System.out.printf("%d\t",in.readInt());
//				sumAll += ?; sum의 값을 변수로 안 정해주면 해당하는 총점의 값을 재사용할 수 없다.
//				System.out.printf("%f\t\n",in.readDouble());
//				avgAll += ?; 평균의 해당하는 값을 변수로 안 정해주면 재사용할 수가 없다.
//				count++;
			}
			
		} catch (EOFException e) {
			System.out.println("읽은 횟수 전체 합계 전체 평균");
			System.out.println(count+"\t"+sumAll+"\t"+avgAll/count);
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
}
