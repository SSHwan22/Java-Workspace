package run;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		// 일차원 배열 선언
		int[] arr1;
		int arr2[];

		// 이차원 배열 선언
		int[][] arr3;
		int arr4[][];
		int[] arr5[];

		// 이차원 배열선언과 동시에 할당
		int[][] arr = new int[2][4];

		System.out.println(arr); // [[I@2a742aa2
		System.out.println(arr[0]); // [I@3cb1ffe6
		System.out.println(arr[1]); // [I@3cb1ffe6
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(arr[0][0]); // 0
	}
}
