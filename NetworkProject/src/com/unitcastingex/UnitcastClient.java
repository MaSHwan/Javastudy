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
			// ���ϻ���
			socket = new Socket("192.168.0.51",5000);
		} catch (UnknownHostException ue) {
			System.out.println("������ ã���� �����ϴ�.");
			System.exit(0);
		}catch (IOException e) {
			System.out.println("������ ������ �� �����ϴ�.");
			System.exit(0);
		}
		
		try {
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// ������ �޽����� �ְ����
			while (true) {
				// Ű����� ���� �Է��� ���� �б�
				System.out.print("������ �޽��� : ");
				String msg = keyboard.readLine();
				
				//�޽����� ������ ����
				bw.write(msg + "\n");
				bw.flush();
				
				String getMsg = br.readLine();
				System.out.println("���ŵ� �޽��� : " + getMsg);
				
				
			}

		} catch (IOException e) {
			System.out.println("������ ������ �� �����ϴ�.");
			System.exit(0);
			
		}
	}

	public static void main(String[] args) {
		new UnitcastClient();
	}
}
