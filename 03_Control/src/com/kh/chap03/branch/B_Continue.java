package com.kh.chap03.branch;

public class B_Continue {
	/*
	 * continue; : 반복문 안에서 사용하는 구문
	 * 			   continue를 만나게 되면 그 뒤에 어떤 코드가 있든 간에 실행하지 않고
	 * 			   가장 가까운 반복문으로 올라감.
	 * 
	 */
	
	public void method1() {
		// 1부터 10까지 홀수만을 출력
		// 1 3 5 7 9
		
		//방법 1
		for(int i =1; i<=10; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
			
		//방법 2
		for(int i=1; i<=10;i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		//방법 3
		for(int i=1; i<10; i++) {
			if(i%2==0) { // 짝수일 경우
				continue; // 뒷쪽의 내용의 코드는 무시하고 다음 증감식으로 넘어감.
			}
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public void method2() {
		// 1부터 100까지의 총 합계
		// 단, 6의 배수값은 빼고 더해보기. (i%6==0)
		// continue문을 활용해서 코드를 작성
		// 총합계 : xx
		
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%6==0) { 
				continue;	//i%6==0(6의 배수)값이 참이면 이번 i값에서 반복문은 넘어가고 다음 i의 증감으로 넘어간다.
			}
			sum +=i;
		}
		System.out.println("총 합계 : "+sum);
	}
	
	public void method3() {
		// 2 ~ 9단까지 출력을 하되
		// 단, 4의 배수단은 빼고출력하시오.(continue문 사용)
		
		for(int i=2; i<=9; i++) {
			if(i==4) {
				continue;
			}
			System.out.printf("=== %d단 ===\n",i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%d X %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
	}
}


	
