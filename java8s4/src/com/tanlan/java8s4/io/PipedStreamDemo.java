package com.tanlan.java8s4.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamDemo {

	public static void main(String[] args) throws Exception {
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();
		pis.connect(pos);

		new Thread(()->produce(pos)).start();
		new Thread(()->consume(pis)).start();
	}

	public static void produce(PipedOutputStream pos) {
		try {
			for (int i = 1; i <= 50; i++) {
				pos.write(i);
				pos.flush();
				System.out.println("写入:" + i);
				Thread.sleep(500);
			}
			pos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void consume(PipedInputStream pis) {
		try {
			int num = -1;
			while ((num = pis.read()) != -1) {
				System.out.println("读取:" + num);
			}
			pis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
