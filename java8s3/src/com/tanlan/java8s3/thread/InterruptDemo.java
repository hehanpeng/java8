package com.tanlan.java8s3.thread;

public class InterruptDemo {

	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 20; i++) {
				if(Thread.currentThread().isInterrupted()){
					break;
				}
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	);
		t1.start();
		for (int i = 1; i < 20; i++) {
			System.out.println("Main:" + i);
			Thread.sleep(300);
		}
		t1.interrupt();
		//System.out.println(t1.interrupted());
		//System.out.println(t1.isInterrupted());
	}

}
