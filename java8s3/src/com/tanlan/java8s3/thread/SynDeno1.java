package com.tanlan.java8s3.thread;

public class SynDeno1 {
	public synchronized void m1(){
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("A:"+i);
		}
	}
	
	public static synchronized void m2(){
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("B:"+i);
		}
	}

	public static void main(String[] args) {
		SynDeno1 d=new SynDeno1();
		new Thread(d::m1).start();
		new Thread(SynDeno1::m2).start();
	}
	
}
