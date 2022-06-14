package com.ioex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		System.out.print("���� ���� ����");
		long start = System.currentTimeMillis();

		FileInputStream src = null;
		FileOutputStream dest = null;

		try {
			// ���� ������ �б� ���� FileInputStream ��ü ����
			src = new FileInputStream(new File("c:/windows/win.ini"));
			
			// ���� ������ �����ϱ� ���� FileOutputStream ��ü ����
			dest = new FileOutputStream(new File("c:/ppp/dest.txt"));
			
			// FileInputStream �� ���ؼ� �о���� ���� ������ ���� ����
			int readValue = 0;
			
			// FileInputStream�� read()�޼ҵ带 ���ؼ� �о���� ���� readValue�� ����
			while((readValue = src.read()) != -1) {
				dest.write(readValue); // readValue �� ����� ���� FileOutputStream�� write()�޼ҵ带 ���ؼ� ���Ͽ� ����
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (dest != null) {
					dest.close();
				}
			} catch (IOException ii) {
				ii.printStackTrace();
			}
			try {
				if (src != null) {
					src.close();
				}
			} catch (IOException ii) {
				ii.printStackTrace();
			}
		}

		long end = System.currentTimeMillis();

		long copyTime = (end - start) / 1000;
		System.out.println("���翡 �ɸ� �ð� : " + copyTime + "��");
	}
}
