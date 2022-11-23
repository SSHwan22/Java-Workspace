package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		Book[] arr = new Book[3];
		
		Scanner sc = new Scanner(System.in);
		
		// 3개의 전체 도서정보를 입력 받은 후 각 객체배열의 인덱스에 해당 객체를 생성하기.
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("저자 : ");
			String author = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
					
			arr[i] = new Book(title, author, price, publisher);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].information());
		}
		
		// 사용자에게 검색할 도서 제목을 입력받아 각 전체 도서들의 제목과 일일이 비교하여 일치하는 도서의 가격을 알려주는 메소드
		
		System.out.println("검색할 책 제목 : ");
		String searchTitle = sc.nextLine();
		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i].getTitle().equals(searchTitle)) {
//				System.out.println(arr[i].getPrice());
//			}
//		}
		
		//만약 일치하는 도서를 차지 못한 경우 "검색된 도서가 없습니다."출력
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].getTitle().equals(searchTitle)) {
				count++;
				System.out.println("책의 가격은 : "+arr[i].getPrice());
				break;	// 책의 제목이 중복되지 않은 이상 break문을 걸어주게되면
						// 찾고자하는 책을 찾고나서 더 이상 반복문을 실행시키지 않음.
			}
		}
		if(count == 0) {
			System.out.println("검색된 도서가 없습니다.");
		}
		
	}

}
