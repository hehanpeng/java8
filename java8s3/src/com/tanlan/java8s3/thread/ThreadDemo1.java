package com.tanlan.java8s3.thread;

class Thread1 extends Thread {
	private int num;

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		Thread ct = Thread.currentThread();
		System.out.println(ct.getName());
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + "," + num);
		}
	}
}

class Thread2 implements Runnable {
	private int num;

	public Thread2(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		Thread ct = Thread.currentThread();
		System.out.println(ct.getName());
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread2:" + i + "," + num);
		}
	}

}

public class ThreadDemo1 {

	public static void main(String[] args) throws Exception {
		Thread1 t1 = new Thread1();
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		t1.setName("线程1");
		t1.setNum(100);
		t1.start();
		t1.join();
		Runnable r2 = new Thread2(300);
		Thread t2 = new Thread(r2, "线程2");
		t2.start();
		t2.join();

		// new Thread(() -> {
		// for (int i = 0; i < 20; i++) {
		// try {
		// Thread.sleep(500);
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// System.out.println("Thread3:" + i);
		// }
		// }).start();
		//
		// new Thread(ThreadDemo1::print).start();
		//
		for (int i = 0; i < 20; i++) {
			Thread.sleep(500);
			System.out.println("Main:" + i);
		}
	}

	static void print() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread4:" + i);
		}
	}

}