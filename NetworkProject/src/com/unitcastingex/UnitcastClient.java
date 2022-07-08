package com.unitcastingex;

import java.io.*;
import java.net.*;

public class UnitcastClient {
	
	Socket socket = null;

	BufferedReader br = null;
	BufferedWriter bw = null;
	BufferedReader keyboard = null;
	
	public UnitcastClient() {
		try {
			// 소켓생성
			socket = new Socket("192.168.0.51",5000);
		} catch (UnknownHostException ue) {
			System.out.println("서버를 찾을수 없습니다.");
			System.exit(0);
		}catch (IOException e) {
			System.out.println("서버와 연결할 수 없습니다.");
			System.exit(0);
		}
		
		try {
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// 서버와 메시지를 주고받음
			while (true) {
				// 키보드로 부터 입력한 내용 읽기
				System.out.print("전송할 메시지 : ");
				String msg = keyboard.readLine();
				
				//메시지를 서버로 전송
				bw.write(msg + "\n");
				bw.flush();
				
				String getMsg = br.readLine();
				System.out.println("수신된 메시지 : " + getMsg);
				
				
			}

		} catch (IOException e) {
			System.out.println("서버와 연결할 수 없습니다.");
			System.exit(0);
			
		}
	}

	public static void main(String[] args) {
		new UnitcastClient();
	}
}
