package Study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MethodEx04 {

	public static String getString(String str)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(str + " : ");
		String imsi = br.readLine();
		return imsi;
	}
	
	public static void main(String[] args) throws IOException{
		String name = getString("이름");
		System.out.println(name + " 안녕하세요. ");
		
	}
}
