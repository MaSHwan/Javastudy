package com.ioex;

import java.io.*;

public class DirectoryCreate {
	public static void main(String[] args) {
		// ���丮 ����
		File f2 = new File("c:/newDirectory");
		if (!f2.exists()) {
			f2.mkdir();
		} else {
			System.out.println("���丮 �̸� : " + f2.getPath()); // ���丮 : get path
		}

		// ���� Ȥ�� ���丮 ����
		File f3 = new File("c:/ppp");
		if (f3.exists()) {
			f3.delete();
		} else {
			System.out.println("���� Ȥ�� ���丮�� �������� �ʽ��ϴ�.");
		}
	}
}
