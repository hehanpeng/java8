package com.tanlan.java8s4.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();
		String msg = "Hello";
		DatagramPacket p = new DatagramPacket(msg.getBytes(),
				msg.getBytes().length);
		p.setAddress(InetAddress.getByName("localhost"));
		p.setPort(9000);
		ds.send(p);
		ds.receive(p);
		byte[] data=p.getData();
		int length=p.getLength();
		int offset=p.getOffset();
		String s=new String(data,offset,length);
		System.out.println(s);
	}

}
