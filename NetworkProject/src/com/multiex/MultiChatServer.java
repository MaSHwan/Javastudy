package com.multiex;

import java.io.*;
import java.net.*;
import java.util.*;

public class MultiChatServer {

	private ServerSocket ss = null;
	private Socket s = null;
	// 연결된 클라이언트 스레드를 관리 ArrauList
	ArrayList<ChatThread> chatlist = new ArrayList<ChatThread>();

	// 멀티채팅 메인 프로그램
	public void start() {
		// 서버 소켓 생성
		try {
			ss = new ServerSocket(4000); // 포트 4000 소켓생성
			System.out.println("Server Start");

			// 무한루프를 돌면서 클라이언트의 접속을 기다림
			while (true) {
				s = ss.accept();

				// 연결된 클라이언트에서 스레드 생성
				ChatThread chat = new ChatThread();

				// 클라이언트 리스트에 스레드를 추가
				chatlist.add(chat);

				// 스레드 시작
				chat.start();

			}
		} catch (Exception e) {
			System.out.println("[MultiChatServer]start() Exception 발생");
		}
	}

	// 스레드는 내부클래스로
	// 각 클라이언트 관리를 위한 스레드 클래스 구현
	class ChatThread extends Thread {

		// 수신메시지와 파싱메시지 처리하는 변수선언
		String msg;
		String[] rmsg;

		// 입출력 스트림생성
		private BufferedReader inMsg = null;
		private PrintWriter outMsg = null;

		@Override
		public void run() {
			boolean status = true;
			System.out.println("##ChatThread start");

			try {
				inMsg = new BufferedReader(new InputStreamReader(s.getInputStream()));
				outMsg = new PrintWriter(s.getOutputStream(), true);

				// 상태정보가 true이면 루프를 돌면서 사용자한테서 수신된 메시지를 처리한다.
				while (status) {
					// 수신된 메시지를 msg 변수에 저장함
					msg = inMsg.readLine();
					// "/"로 구분자를 기준으로 메시지를 문자열 배열로 파싱함
					rmsg = msg.split("/");

					// 파싱된 문자열 배열의 두번째 요소값에 따라 처리함

					// 로그아웃 메시지 일때
					if (rmsg[1].equals("logout")) {
						// 모든 사용자한테 알린다
						chatlist.remove(this);
						msgSendAll("server/" + rmsg[0] + "님이 종료 했습니다.");
						
						// 해당 클라이언트 스레드 종료로 인해 status를 false로 설정함
						status = false;
					}
					
					// 로그인 메시지 일때
					else if (rmsg[1].equals("login")) {
						msgSendAll("server/" + rmsg[0] + "님이 로그인 했습니다.");
					}
					// 그외의 메시지 일때
					else {
						msgSendAll(msg);
					}
				}
				
				// 루프를 벗어나면 클라이언트 연결이 종료 되므로 스레드의 인터럽트가 발생
				this.interrupt();
				System.out.println("stop" + this.getName());
			} catch (IOException e) {
				chatlist.remove(this);
				System.out.println("[ChatThread]run() IOException 발생");

			}
		}
	}

	// 연결된 모든 클라이언트에게 메시지를 전달하는 기능 구현
	public void msgSendAll(String msg) {
		for (ChatThread ct : chatlist) {
			ct.outMsg.println(msg);
		}
	}

	

	public static void main(String[] args) {
		MultiChatServer ser = new MultiChatServer();
		ser.start();
	}
}
