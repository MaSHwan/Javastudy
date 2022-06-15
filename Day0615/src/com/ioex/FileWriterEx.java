package com.ioex;

// 파일에 문자 기록
import java.io.*;

public class FileWriterEx {
	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			// 파일에 한 문자 단위로 기록할 수 있는 FIleWriter 객체생성
			fw = new FileWriter("c:/ppp/song.txt");
			// fw 는 문자열을 바로 기록할 수 있다.
			String str = "오렌지";
			fw.write(str);
			
			// 한 글자 단위로 읽고 쓸수 있는 reader, Writer 계열의 스트림은
			// 내부적으로 버퍼를 내장하고 있음
			// 내장된 버퍼는 버퍼가 가득 채워질 때에만 스트림을 통해 내보낸다.
			// 그래서 가득 채워지지 않은 상태에서 버퍼를 비워야할 경우
			// flush() 메소드를 활용하여 버퍼가 채워지지 않은 상태에서도 비우게 한다.
			fw.flush();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie){
			ie.printStackTrace();
		}
		finally {
			try {if(fw != null) fw.close();}catch(IOException e) {}
		}
	}
}
