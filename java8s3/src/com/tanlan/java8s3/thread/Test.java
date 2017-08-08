package com.tanlan.java8s3.thread;

public class Test {
	public static void main(String[] args) {
		Resource r=new Resource();
		
		ProductorThread p=new ProductorThread(r);
		new Thread(p).start();
		ProductorThread p2=new ProductorThread(r);
		new Thread(p2).start();
		ProductorThread p3=new ProductorThread(r);
		new Thread(p3).start();
		ConsumerThread c=new ConsumerThread(r);
		new Thread(c).start();
		ConsumerThread c2=new ConsumerThread(r);
		new Thread(c2).start();
	}
}
