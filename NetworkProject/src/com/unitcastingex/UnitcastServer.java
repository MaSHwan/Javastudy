package com.unitcastingex;

import java.io.*;
import java.net.*;

public class UnitcastServer {

	public UnitcastServer() {
		ServerSocket server = null;

		try {
			// 서버 소켓 생성
			server = new ServerSocket(5000);

		} catch (IOException e) {
			System.out.println("해당 포트가 사용중입니다.");
			System.exit(0);
		}

		try {
			while (true) {
				System.out.println("server Ready");
				Socket socket = server.accept();

				/*
				 * 클라이언트와 메시지를 송수신할 수 있는 스레드 생성 스레드 생성시 socket을 전달받아서 구현함 스레드를 시작함
				 */
				UnitcastServerThread thread = new UnitcastServerThread(socket);

				thread.start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		new UnitcastServer();
	}

}
