package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//DAO(Data Access Object) : 데이터가 보관되어있는 공간과 직접 접근해서 데이터를 입,출력하는 클래스
public class FileByteDao {
	
	// 현재 프로그램 -> 외부매체(파일)
	// 출력 : 프로그램 내의 데이터를 파일로 내보내기(즉, 파일에 기록하겠다.)
	
	public void fileSave() {
		
		// FileOutputStream : "파일"로 데이터를 1byte단위로 출력하는 스트림.
		
		FileOutputStream fout = null;
		
		try {
			/*
			 * 1. FileOutputStream 객체 생성 => 해당 파일과 직접적으로 연결되는 통로(스트림)만듬.
			 * 해당 파일 존재하지 않으면 해당 파일이 생성되면서 통로가 연결됨.
			 * 		   존재하는 파일이면 바로 통로 연결.
			 * 두 번째 매개변수로 true 추가시 => 기존에 해당파일이 있을경우 "이어쓰기" 기능
			 * 두 번째 매개변수 미작성 => 기존에 해당파일이 있을경우 "덮어씌우기"기능(기본값 false)
			 */
			fout = new FileOutputStream("a_byte.txt"); // 객체생성후 덮어씌우기
			//fout = new FileOutputStream("a_byte.txt",true); // 객체생성후 이어쓰기
			
			//2. 연결통로로 데이터 출력 : write()메서드 이용.
			// 1 byte 범위 : -128~127까지의 숫자(단, 파일에 기록되기를 해당 숫자의 고유한 '문자'가 기록됨)
			//			  : 아스키코드표 참고
			
			fout.write(97); // a기록
			fout.write('b'); // b기록
			//fout.write('민'); // 한글은 2byte이기 때문에 깨져서 저장(바이트 스트림으로는 제한)
			
			byte [] arr = {99, 100, 101};
			fout.write(arr);
			
			fout.write(arr, 1, 2); // 1번 인덱스부터 2개 기록해라. 100, 101 -> d,e
			
			
			// 3. 스트림을 다 이용했으면 자원 반납하기(반드시!!)
			//fout.close(); //위에서 에러(예외)가 발생했을경우 실행이 안될수 있음.
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 어떤 예외가 발생하든간에 반드시 실행하는 구문을 작성하는 블럭.
			// 3. 스트림을 다 이용했으면 자원 반납하기
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 프로그램 <-- 외부매체(파일)
	// 입력 : 파일로부터 데이터를 읽어들이겠다.
	public void fileRead() {
		// FileInputStream : 파일로부터 데이터를 1바이트씩 입력받는 스트림.
		
		FileInputStream fis = null;
		
		try {
			//1. FileInputStream 객체 생성(스트림을 열겠다.)
			fis = new FileInputStream("a_byte.txt"); // 존재하는 파일로 제시
			
			//2. 통로로 데이터입력받기 read() 사용.
			// 단, 1byte 단위로 하나씩 읽어옴
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());// 파일 끝을 만나는 순간 fis.read => -1을 출력
			
			//방법 1
//			while(true) {
//				int value = 0;
//				value = fis.read();
//				if(value != -1) {
//					System.out.println(value);
//					continue;
//				}
//				break;
//			}
			
			//권장하는 방법.
			int value = 0;
			while((value = fis.read()) != -1) {
				System.out.println(value);
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 다 쓴 스트림자원 반납.
			try {
				fis.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
