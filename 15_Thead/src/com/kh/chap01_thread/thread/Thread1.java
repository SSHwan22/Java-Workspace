package com.kh.chap01_thread.thread;

// 쓰레드 생성방법
/*
 * 1. Thread클래스를 상속 받는 방법.
 * 	 - Tread클래스 상속 후에 run()메서드 오버라이딩
 *   - Tread1 객체를 생성 후 start()메서드를 호출.
 */

public class Thread1 extends Thread{
	
	/*
	 * 쓰레드 실해잇 Run메서드 호출됨.
	 * 따라서 작업을 하고자 하는 코드를 반드시 RUN메서드 안에 재정의 해줘야 한다.
	 * 즉, Tread클래스 안에 있는 run메서드를 재정의 해줘야 한다.
	 */
	@Override
	public void run() {
		// 내가 작업할 코드를 작성.
		for(int i=0; i<=100; i++) {
			System.out.println(getName()+"["+i+"]");
			// getName() : 쓰레드의 이름 반환, 순차적으로 Tread-0, Tread-1, ... 이름이 붙는다.
		}
	}
}
