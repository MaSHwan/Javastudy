package com.ioex;

import java.io.*;

public class DirectoryCreate {
	public static void main(String[] args) {
		// 디렉토리 생성
		File f2 = new File("c:/newDirectory");
		if (!f2.exists()) {
			f2.mkdir();
		} else {
			System.out.println("디렉토리 이름 : " + f2.getPath()); // 디렉토리 : get path
		}

		// 파일 혹은 디렉토리 삭제
		File f3 = new File("c:/ppp");
		if (f3.exists()) {
			f3.delete();
		} else {
			System.out.println("파일 혹은 디렉토리가 존재하지 않습니다.");
		}
	}
}
