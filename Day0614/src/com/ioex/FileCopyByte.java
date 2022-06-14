package com.ioex;
import java.io.*;
// byte[] 단위로 복사
public class FileCopyByte {
public static void main(String[] args) {
	System.out.print("파일 복사 시작");
	long start = System.currentTimeMillis();

	FileInputStream src = null;
	FileOutputStream dest = null;

	try {
		// 원본 파일을 읽기 위한 FileInputStream 객체 생성
		src = new FileInputStream(new File("c:/ppp/abc.txt"));
		
		// 복사 파일을 생성하기 위한 FileOutputStream 객체 생성
		dest = new FileOutputStream(new File("c:/ppp/fileout.txt"));
		
		// 임시 저장소에 저장된 data 의 전체 개수를 저장할 변수를 선언
		int length = 0;
		
		// 임시 저장소로 사용할 byte[] 배열선언
		byte[] buffer = new byte[1024*8];
		
		// InputStream을 통해서 읽어들인 데이터를 임시 저장소에 저장하고
		// 저장된 데이터의 길이만큼 length에 저장함
		while((length = src.read(buffer)) != -1) {
			dest.write(buffer, 0, length);// OutputStream을 통해서 임시 저장소에 저장되어 있는 데이터를 length만큼 파일에 저장
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
	System.out.println("복사에 걸린 시간 : " + copyTime + "초");
}
}
