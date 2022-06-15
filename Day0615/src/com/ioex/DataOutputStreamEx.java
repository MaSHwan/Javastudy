package com.ioex;

import java.io.*;

/*
 * 		DataInputStream �� DataOutputStream
 * 
 * 		DataOutputStream
 * 		- Ư�� ������ Ÿ�԰� ������ ������ä �����͸� ����ϰ� �о� �� �� �ִ� ��Ʈ��
 * 		- Ư�� ������ Ÿ�̺� ���˿� �°� ���� �� �ִ� �޼ҵ带 ����
 * 		   writeBoolean, readBoolean, readInt, writeInt, readUTF, writeUTF 
 */
public class DataOutputStreamEx {
	public static void main(String[] args) {
		// DataOutputStream�� �⺻ �ڷ��� Ÿ�� �״�� ��Ʈ���� ���ؼ� ����� �� ����
		// DataOutputStream�� 1�� ��Ʈ���� �ƴϱ� ������ �ٸ� ��Ʈ���� �̿��ؼ�
		// Ư�� ��ġ�� ����� �� �ִ�.
		DataOutputStream dos = null; // 2��
		FileOutputStream fos = null; // 1��
		try {
			// DataOutputStream �� ����� FileOutputStream
			fos = new FileOutputStream("c:/ppp/data.sav");
			// �⺻ �ڷ����� Ÿ���� ������ä ����� �� �ִ� DataOutputStream ��ü ����
			dos = new DataOutputStream(fos);
			int i = 10;
			double d = 3.14;
			String s = "���� �ڹٸ� ����մϴ�.";
			//DataOutputStream�� �⺻ �ڷ������� �����ϴ� write �޼ҵ尡 ������
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeUTF(s);
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch(IOException ie) {
			ie.printStackTrace();
		} finally {
			try {if(fos != null)fos.close();}catch(IOException e) {}
			try {if(fos != null)fos.close();}catch(IOException e) {}
		}
	}
}
