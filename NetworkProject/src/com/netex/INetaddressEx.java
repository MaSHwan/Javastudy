package com.netex;

import java.net.*;

public class INetaddressEx {
	public static void main(String[] args) {
		// InetAddress ��ü�� �����ڰ� �ƴ� static �޼ҵ带 �̿��ؼ� ��ü ����
		
		try {
			InetAddress ipinfo1 = InetAddress.getByName("www.google.com");
			// ip �ּ� ���
			String ip = ipinfo1.getHostAddress();
			System.out.println("ip �ּ� : " + ip);
			
			InetAddress[] ipArray = InetAddress.getAllByName("www.google.com");
			for(InetAddress tempip : ipArray) {
				System.out.println(tempip);
			}
			
			// ���� ���� ��ǻ�� ip����
			InetAddress myHost = InetAddress.getLocalHost();
			System.out.println("host name : " + myHost.getHostName());
			System.out.println("my ip : " + myHost.getHostAddress());
		} catch (UnknownHostException uhe) {
			uhe.printStackTrace();
		}
	}
}
