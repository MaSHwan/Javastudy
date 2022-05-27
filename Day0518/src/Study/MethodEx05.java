package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodEx05 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	
	 int getInt(String str) throws IOException {
	System.out.println(str + " : ");
	int imsi = Integer.parseInt(br.readLine());
	return imsi;
	}
	public static void main(String[] args)throws IOException {
//		int kor = 30;
		MethodEx05 me = new MethodEx05();
		int kor = me.getInt("국어 점수");
		System.out.println("국어 점수 : " + kor);
	}
}
