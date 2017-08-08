package com.tanlan.java8s4.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
	Lock lock=new ReentrantLock();
	
	public void print(){
		lock.lock();
		for(int i=0;i<50;i++){
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		test();
		lock.unlock();
	}
	
	public void test(){
		lock.lock();
		System.out.println("test");
		lock.unlock();
	}

	public static void main(String[] args) {
		LockDemo demo=new LockDemo();
		new Thread(demo::print).start();
		new Thread(demo::print).start();
	}

}
