package com.tanlan.java8s3.thread;

public class SimplestThread {

	public static void main(String[] args) {
		Thread simplestThread = new Thread();
		simplestThread.setName("ss");
		simplestThread.start();
	System.out.println(simplestThread.currentThread().getName());
		//simplestThread.getState();

		ThreadGroup tg1 = new ThreadGroup("ThreadGroup");
		Thread t1 = new Thread(tg1, "thread1");

		Thread ct = Thread.currentThread();
		System.out.println(ct.getName());
	}

}
