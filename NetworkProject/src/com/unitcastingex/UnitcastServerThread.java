package com.unitcastingex;

import java.io.*;
import java.net.*;

public class UnitcastServerThread extends Thread {
	// 서버로 부터 전달된 socket을 저장
	Socket socket = null;

	BufferedReader br = null;
	BufferedWriter bw = null;

	// 객체 생성시 socket을 전달 받아서 멤버 변수에 저장함
	public UnitcastServerThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// 클라이언트와 메시지를 송수신함
			while (true) {
				// 클라이언트가 보낸 메시지를 수신함
				String msg = br.readLine();
				System.out.println(msg);

				// 클라이언트로 메시지를 보냄
				bw.write(msg + "\n");
				bw.flush();
			}

		} catch (IOException e) {
			// 클라이언트와 연결이 끊어진 경우 예외가 발생함
			InetAddress ip = socket.getInetAddress();
			String address = ip.getHostAddress();
			System.out.println("[" + address + "]와의 연결이 끊어졌습니다.");
			
		}
	}

	public UnitcastServerThread() {

	}
}
