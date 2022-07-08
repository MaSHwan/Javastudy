package com.unitcastingex;

import java.io.*;
import java.net.*;

public class UnitcastServer {

	public UnitcastServer() {
		ServerSocket server = null;

		try {
			// ���� ���� ����
			server = new ServerSocket(5000);

		} catch (IOException e) {
			System.out.println("�ش� ��Ʈ�� ������Դϴ�.");
			System.exit(0);
		}

		try {
			while (true) {
				System.out.println("server Ready");
				Socket socket = server.accept();

				/*
				 * Ŭ���̾�Ʈ�� �޽����� �ۼ����� �� �ִ� ������ ���� ������ ������ socket�� ���޹޾Ƽ� ������ �����带 ������
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
