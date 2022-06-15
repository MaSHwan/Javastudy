package com.ioex;

import java.io.*;
public class DataInputStreamEx {
public static void main(String[] args) {
	DataInputStream dis = null; // 2차
	FileInputStream fis = null; // 1차
	
	try {
		// DataOutputStream 과 연결된 FileOutputStream
		fis = new FileInputStream("c:/ppp/data.sav");
		// 기본 자료형의 타입을 유지한채 저장된 값을 읽어들임
		// 있을때 반드시 기록한 순서대로 읽어와야함
		dis = new DataInputStream(fis);
		int i = dis.readInt();
		double d = dis.readDouble();
		String s = dis.readUTF();
		
	System.out.println("i 값 : " + i);
	System.out.println("d 값 : " + d);
	System.out.println("s 값 : " + s);
		
		
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
