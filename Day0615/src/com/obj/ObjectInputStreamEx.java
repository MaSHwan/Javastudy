package com.obj;

import java.io.*;

public class ObjectInputStreamEx {
	public static void main(String[] args) {
		ObjectInputStream ois = null;

		try {
			// 파일에 저장된 객체를 읽어 오기 위해 ObjectInputStream 객체를 생성
			ois = new ObjectInputStream(new FileInputStream("c:/ppp/obj.oob"));

			// ObjectInputStream은 스트림으로부터 읽어들인 직렬화된 객체를
			// 역직렬화 해서 객체를 생성할 수 있음
			// 역직렬화 할 떄 필요한 클래스를 찾지 못하면 예외가 발생됨
			Data data = (Data) ois.readObject();
			System.out.println("번호 : " + data.getNo());
			System.out.println("이름 : " + data.getName());
			System.out.println("메일 : " + data.getMail());

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
			} catch (IOException e) {
			}
		}
	}
}
