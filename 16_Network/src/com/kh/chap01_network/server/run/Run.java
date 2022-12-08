package com.kh.chap01_network.server.run;

import com.kh.chap01_network.server.tcp.Server;

public class Run {
	
	/*
	 * TCP(Transmission Control Protocol)
	 * - 서버, 클라이언트간의 1:1 소켓 통신
	 * - 데이터를 교환하기에 앞서서 서버, 클라이언트 연결되어 있어야 됨.(서버가 먼저 실행되면서 클라이언트의 요청을 기다림)
	 * - 신뢰성 있는 데이터 전달 가능.
	 * 
	 * ServerSocket
	 * - 서버에서 클라이언트의 요청을 받을 때까지 기다리는 클래스
	 * - 사용법 : ServerSocket server = new ServerSocket(int portNumber);
	 * - 메서드
	 *    > Socket client = server.accept() 메서드를 통해 클라이언트의 연결을 기다리고 연결이 오면 Socket객체로 반환.
	 *  
	 * Socket
	 * - 클라이언트에서 서버에 요청을 하거나, 서버에서 클라이언트의 요청을 받았을 때 사용하는 클래스
	 * - 사용법 : Socket socket = new Socket(String IPAdress, int portNumber)
	 * - 메서드
	 *    > OutputStream out = client.getOutputStream() 메서드를 통해 데이터를 "내보낼 수 있는" 출력스트림을 생성.
	 *    > InputStream in = client.getInputStream() 메서드를 통해 데이터를 읽을 수 있는 입력 스트림을 생성.
	 */
	public static void main(String[] args) {
		new Server().serverStart();
	}
}
