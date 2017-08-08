package com.tanlan.java8s4.net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		Socket socket=new Socket("localhost", 9000);
		OutputStream os=socket.getOutputStream();
		os.write("Hello Java".getBytes());
		os.flush();
		os.close();
	}

}
