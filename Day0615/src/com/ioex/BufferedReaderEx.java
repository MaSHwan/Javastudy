package com.ioex;

import java.io.*;

public class BufferedReaderEx {
	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		try {
			fis = new FileInputStream("c:/ppp/hello.txt");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);

			// 한 라인씩 읽어들인 문자열을 저장할 변수선언
			String str = null;

			// readLine() 은 개행문자(엔터)를 만나면 개행문자 이전까지의 문자열을 반환하고
			// 스트링을 끝에 도달하면 null을 반환함

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
			}
			try {
				if (isr != null)
					isr.close();
			} catch (IOException e) {
			}
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
			}
		}

	}
}