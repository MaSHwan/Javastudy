package com.ioex;

import java.io.File;

public class FileNameChange {
	public static void main(String[] args) {
		// ���� Ȥ�� ���丮 �̸� ����
		File src = new File("c:/ppp/newFile.txt");
		File dest = new File("c:/newDirectory/dest.txt");
		File dest2 = new File("c:/newDirectory/dest2.txt");

		if (src.exists()) {
			src.renameTo(dest);
			src.renameTo(dest2);
		} else {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
	}
}
