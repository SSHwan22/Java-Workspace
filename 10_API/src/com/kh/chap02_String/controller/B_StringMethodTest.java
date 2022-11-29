package com.kh.chap02_String.controller;

public class B_StringMethodTest {
	
	//문자열과 관련된 메소드
	public void method1() {
		
		String str1 = "Hello World";
		
		//1. 문자열.charAt(int index) : char
		//   문자열에서 전달받은 index의 위치에 있는 문자 하나만 뽑아서 리턴
		char ch = str1.charAt(3);
		System.out.println("ch : "+ch);
		
		//2. 문자열.concat(String str) : String
		//   문자열과 전달된 또 다른 문자열을 하나로 합쳐서 리턴
		String str2 = str1.concat("!!!");
		System.out.println(str2);
		
		//3. 문자열.length() : int
		//   문자열의 길이 반환.
		System.out.println("str1의 길이 : "+ str1.length());
		
		//4. 문자열.substring(int beginIndex) : String
		//   => 문자열의 beginIndex위치에서 부터 끝까지의 문자열을 추출해서 리턴.
		
		//   문자열.subString(int beginIndex, int endIndex) : String
		//   => 문자열의 beginIndex의 위치에서 부터 endIndex -1 까지의 문자열을 추출해서 리턴
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0,5));// 0 <= 인덱스범위 < 5
		
		// 5. 문자열.replace(char old, char new) : String
		//    => 현재 문자열에서 old문자를 new문자로 대체(replace)하고 변환한 문자열 리턴
		String str3 = (str1.replace('l', 'a'));
		System.out.println("str3 : "+str3);
		
		// 6. 문자열.trim() : String
		//    => 문자열의 앞 뒤 공백을 제거한 문자열 리턴
		String str4 = "                  j a v a          ";
		System.out.println("trim() : "+str4.trim());
		
		// 7. 문자열.toUpperCase() : String
		//    => 문자열을 모두 다 대문자로 변경 후 문자열 리턴(영문자)
		//    문자열.toLowerCase() : String
		//    => 문자열을 모두 다 소문자로 변경후 문자열 리턴
		System.out.println("upper : "+str1.toUpperCase());
		System.out.println("lower : "+str1.toLowerCase());
		
		// 8. 문자열.toCharArry() : char[]
		//    => 문자열의 각 문자들을 char[]배열에 옮겨 담은 후 해당 배열을 리턴
		char arr[] = str1.toCharArray();
		for(char str: arr) {
			System.out.print(str+" ");
		}
		
		// 9. static valueOf(char[] data) : String
		System.out.println(String.valueOf(arr));
		System.out.println(String.valueOf(11111111111.343));
		
		
		
	}
}
