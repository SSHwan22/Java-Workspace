package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {

		int[][] arr = new int[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d, %d)", i, j);
			}
			System.out.println();
		}
	}

	public void practice2() {

		int[][] arr = new int[4][4];

		int value = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", value++);
			}
			System.out.println();
		}
	}

	public void practice3() {
		int[][] arr = new int[4][4];

		int value = 16;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", value--);
			}
			System.out.println();
		}
	}

	public void practice4() {
		int[][] arr = new int[4][4];
		int random = 0;
		int sumR = 0;
		int sumC = 0;
		int count = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j < 3 ) {
					random = (int) (Math.random() * 10 + 1);
					arr[i][j] = random;
					sumR += arr[i][j];
				}else {
					arr[i][j] = sumR;
				}
				if(j<3) {
					sumC += arr[j][i];
				}else {
					arr[j][i] = sumC;
				}
				
				System.out.printf("%3d", arr[i][j]);
			}
			sumR = 0;
			System.out.println();
		}
		
		for(int i=0; i<3; i++) {
			System.out.print(arr[3][i]);
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("행 크기 : ");
		int row = sc.nextInt();
		System.out.print("열 크기 : ");
		int column = sc.nextInt();

		// 65 ~90
		int[][] arr = new int[row][column];

		int randomAZ = 0;
		if ((row >= 1 && row <= 10) && (column >= 1 && column <= 10)) {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					randomAZ = (int) (Math.random() * 25 + 65);
					arr[i][j] = randomAZ;
					System.out.printf("%C ", (char) arr[i][j]);
				}
				System.out.println();
			}
		} else {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			practice5();
		}
	}

	public void practice6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "!", "더", "!!" } };
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				// System.out.print(strArr[j][i]+" ");
				// System.out.print(strArr[i][j]+" ");
				System.out.printf("(%d, %d)", j, i);
			}
			System.out.println();
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("행의 크기 : ");
		int row = sc.nextInt();

		int[][] column = new int[row][];

		for (int i = 0; i < row; i++) {
			System.out.printf("%d행의 열 크기 :", i);
			column[i] = new int[sc.nextInt()];
		}

		char value = 'a';
		for (int i = 0; i < column.length; i++) {
			for (int j = 0; j < column[i].length; j++) {

				column[i][j] = value;
				value = (char) (value + 1);
				System.out.print((char) column[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice8() {
		String[] student = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		String[][] arr = new String[3][2];

		int count = 0;
		System.out.println("== 1분단 ==");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = student[count++];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = student[count++];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
