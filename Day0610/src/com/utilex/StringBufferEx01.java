package com.utilex;
/*		버퍼는 데이터를 한곳에서 다른 한곳으로 전송하는 동안
 * 		일시적으로 그 데이터를 보관하는 메모리의 영역을 의미함(임시메모리공간)
 * 
 * 		버퍼링이란
 * 		버퍼를 채우는 동작을 의미함
 * 
 */

import java.io.*;

public class StringBufferEx01 {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("문자열 입력 : ");
//		String str = br.readLine();
		
		StringBuffer sb =  new StringBuffer("JAVA");
//		System.out.println(sb);
//		System.out.println(sb.capacity());
		sb.append("1.8");
		System.out.println(sb);
		sb.delete(3, 5);
		System.out.println(sb);
		sb.insert(3, "A1");
		System.out.println(sb);
		sb.replace(4, 7, "일점팔");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
