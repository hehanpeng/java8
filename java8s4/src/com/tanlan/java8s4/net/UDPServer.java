package com.tanlan.java8s4.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(9000);
		while (true) {
			DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
			ds.receive(dp);
			byte[] data=dp.getData();
			int length=dp.getLength();
			int offset=dp.getOffset();
			String s=new String(data,offset,length);
			System.out.println(s);
			ds.send(dp);
		}
	}

}
