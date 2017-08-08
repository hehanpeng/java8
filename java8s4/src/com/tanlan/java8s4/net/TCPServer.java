package com.tanlan.java8s4.net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9000);
		while (true) {
			Socket socket = server.accept();
			InputStream is = socket.getInputStream();
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(is));
			String msg = null;
			while ((msg = reader.readLine()) != null) {
				System.out.println(msg);
			}
			socket.close();
		}
	}

}
