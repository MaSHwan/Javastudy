package com.ioex;

import java.io.*;
// �ؽ�Ʈ���Ͽ� ���� ���
public class BufferedWriterEx {
	public static void main(String[] args) {
		
		// Buffered ��Ʈ�� : ��Ʈ���� �а� ���� ����� ���� ��Ʈ�� ���ο� ���۸� ������ �ִ� ��Ʈ��
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
//		FileInputStream fis = new FileInputStream("c:/ppp/hello.txt");
//		
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			fw = new FileWriter("c:/ppp/hello.txt");
			bw = new BufferedWriter(fw);
			bw.write("�ڿ�� ��Ű�� ��𸮳�");
			bw.newLine();
			bw.write("���� ��Ű�� ��𸮳�");
			bw.write("���� ��Ű�� ��𸮳�");
			bw.flush();
		} catch (IOException ie) {
			ie.printStackTrace();
		}finally {
			try {if(fw != null) fw.close();}catch(IOException e) {}
			try {if(bw != null) bw.close();}catch(IOException e) {}
		}
		
	}
}
