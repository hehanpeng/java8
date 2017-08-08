package com.tanlan.java8s4.net;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {

	public static void main(String[] args) throws Exception {
		InetAddress a1=InetAddress.getLocalHost();
		System.out.println(a1.getHostAddress());
		
		InetAddress[] a2=InetAddress.getAllByName("tanlanpc");
		for (InetAddress inetAddress : a2) {
			System.out.println(inetAddress.getHostAddress());
		}
		
		InetAddress a3=InetAddress.getByName("www.baidu.com");
		System.out.println(a3.getHostAddress());
		
		InetSocketAddress a4=new InetSocketAddress("tanlanpc", 80);
		
	}

}
