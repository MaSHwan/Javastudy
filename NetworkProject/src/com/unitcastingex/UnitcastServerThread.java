package com.unitcastingex;

import java.io.*;
import java.net.*;

public class UnitcastServerThread extends Thread {
	// ������ ���� ���޵� socket�� ����
	Socket socket = null;

	BufferedReader br = null;
	BufferedWriter bw = null;

	// ��ü ������ socket�� ���� �޾Ƽ� ��� ������ ������
	public UnitcastServerThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// Ŭ���̾�Ʈ�� �޽����� �ۼ�����
			while (true) {
				// Ŭ���̾�Ʈ�� ���� �޽����� ������
				String msg = br.readLine();
				System.out.println(msg);

				// Ŭ���̾�Ʈ�� �޽����� ����
				bw.write(msg + "\n");
				bw.flush();
			}

		} catch (IOException e) {
			// Ŭ���̾�Ʈ�� ������ ������ ��� ���ܰ� �߻���
			InetAddress ip = socket.getInetAddress();
			String address = ip.getHostAddress();
			System.out.println("[" + address + "]���� ������ ���������ϴ�.");
			
		}
	}

	public UnitcastServerThread() {

	}
}
