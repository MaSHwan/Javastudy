package com.ioex;

import java.io.*;
// 텍스트파일에 문자 기록
public class BufferedWriterEx {
	public static void main(String[] args) {
		
		// Buffered 스트림 : 스트림을 읽고 쓰는 기능을 위해 스트림 내부에 버퍼를 가지고 있는 스트림
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
//		FileInputStream fis = new FileInputStream("c:/ppp/hello.txt");
//		
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			fw = new FileWriter("c:/ppp/hello.txt");
			bw = new BufferedWriter(fw);
			bw.write("코우모 텐키와 쿠모리네");
			bw.newLine();
			bw.write("쿄우모 텐키와 쿠모리네");
			bw.write("쿄우모 텐키와 쿠모리네");
			bw.flush();
		} catch (IOException ie) {
			ie.printStackTrace();
		}finally {
			try {if(fw != null) fw.close();}catch(IOException e) {}
			try {if(bw != null) bw.close();}catch(IOException e) {}
		}
		
	}
}
