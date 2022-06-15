package com.ioex;

import java.io.*;
public class DataInputStreamEx {
public static void main(String[] args) {
	DataInputStream dis = null; // 2��
	FileInputStream fis = null; // 1��
	
	try {
		// DataOutputStream �� ����� FileOutputStream
		fis = new FileInputStream("c:/ppp/data.sav");
		// �⺻ �ڷ����� Ÿ���� ������ä ����� ���� �о����
		// ������ �ݵ�� ����� ������� �о�;���
		dis = new DataInputStream(fis);
		int i = dis.readInt();
		double d = dis.readDouble();
		String s = dis.readUTF();
		
	System.out.println("i �� : " + i);
	System.out.println("d �� : " + d);
	System.out.println("s �� : " + s);
		
		
	} catch (FileNotFoundException fnfe) {
		fnfe.printStackTrace();
	} catch(IOException ie) {
		ie.printStackTrace();
	} finally {
		try {if(fis != null)fis.close();}catch(IOException e) {}
		try {if(dis != null)dis.close();}catch(IOException e) {}
	}
}
}
