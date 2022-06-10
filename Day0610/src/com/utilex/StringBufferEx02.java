package com.utilex;

import java.io.*;

public class StringBufferEx02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer("1234567890");
		System.out.println(sb.capacity()); // 16 + 10
		System.out.println(sb.length()); // 데이터의 길이
		sb.append("ABCDEFGHIJKLMNOPQ");
		System.out.println(sb.capacity()); // 26 + 26(+2)
		System.out.println(sb.length()); // 데이터의 길이
		sb.delete(1, 20);
		System.out.println(sb.capacity());		// 버퍼의 크기는 늘어날수는 있지만 줄어들 수는 없다.
		System.out.println(sb.length());
	}
}
