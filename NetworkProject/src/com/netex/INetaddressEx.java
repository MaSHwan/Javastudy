package com.netex;

import java.net.*;

public class INetaddressEx {
	public static void main(String[] args) {
		// InetAddress 객체는 생성자가 아닌 static 메소드를 이용해서 객체 생성
		
		try {
			InetAddress ipinfo1 = InetAddress.getByName("www.google.com");
			// ip 주소 얻기
			String ip = ipinfo1.getHostAddress();
			System.out.println("ip 주소 : " + ip);
			
			InetAddress[] ipArray = InetAddress.getAllByName("www.google.com");
			for(InetAddress tempip : ipArray) {
				System.out.println(tempip);
			}
			
			// 현재 본인 컴퓨터 ip정보
			InetAddress myHost = InetAddress.getLocalHost();
			System.out.println("host name : " + myHost.getHostName());
			System.out.println("my ip : " + myHost.getHostAddress());
		} catch (UnknownHostException uhe) {
			uhe.printStackTrace();
		}
	}
}
