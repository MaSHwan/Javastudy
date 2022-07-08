package com.socex;

import java.io.IOException;
import java.net.*;

public class ServerSocketEx {
	public static void main(String[] args) throws Exception {
		// 사용자들을 받아들이기 위해 serverSocket이 필요함
		ServerSocket ss = new ServerSocket(3000);
		
		while(true) {
			// 클라이언트가 접속할때까지 무한대기
			Socket s = ss.accept();// accept : 대기하는 메소드
			InetAddress iaddr = s.getInetAddress();
			String u_ip = iaddr.getHostAddress();
			System.out.println(u_ip + " 님이 접속하셨습니다.");
		}
	}
}
