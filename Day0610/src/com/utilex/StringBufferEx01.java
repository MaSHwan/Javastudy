package com.utilex;
/*		���۴� �����͸� �Ѱ����� �ٸ� �Ѱ����� �����ϴ� ����
 * 		�Ͻ������� �� �����͸� �����ϴ� �޸��� ������ �ǹ���(�ӽø޸𸮰���)
 * 
 * 		���۸��̶�
 * 		���۸� ä��� ������ �ǹ���
 * 
 */

import java.io.*;

public class StringBufferEx01 {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("���ڿ� �Է� : ");
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
		sb.replace(4, 7, "������");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
