package com.socex;

import java.io.IOException;
import java.net.*;

public class ServerSocketEx {
	public static void main(String[] args) throws Exception {
		// ����ڵ��� �޾Ƶ��̱� ���� serverSocket�� �ʿ���
		ServerSocket ss = new ServerSocket(3000);
		
		while(true) {
			// Ŭ���̾�Ʈ�� �����Ҷ����� ���Ѵ��
			Socket s = ss.accept();// accept : ����ϴ� �޼ҵ�
			InetAddress iaddr = s.getInetAddress();
			String u_ip = iaddr.getHostAddress();
			System.out.println(u_ip + " ���� �����ϼ̽��ϴ�.");
		}
	}
}
