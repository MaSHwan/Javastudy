package com.netex;

import java.net.*;
import java.io.*;

public class UrlEx {

	public static void main(String[] args) {
		// URL (uniform resource locator)에 대한 정보를 가지고 있는 클래스
		// 프로토콜, 호스트명, 포트번호, 자원의 경로, 쿼리스트링으로 정보를 얻음
		
		
		BufferedReader br = null;
		
		try {
			URL url = new URL("https://www.google.com/index.html");
			
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("호스트 : " + url.getHost());
			System.out.println("포트번호 : " + url.getPort());
			System.out.println("자원의 경로 : " + url.getPath());
			
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			String str = null;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {if(br != null) br.close();}catch(IOException ee) {}
		}
	}

}
