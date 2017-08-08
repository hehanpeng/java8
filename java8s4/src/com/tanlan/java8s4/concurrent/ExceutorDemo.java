package com.tanlan.java8s4.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExceutorDemo {

	public static void main(String[] args) {
		ExecutorService es=	Executors.newFixedThreadPool(5);
		Future<Integer> f=es.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				Thread.sleep(2000);
				return 1;
			}
		});
		
		try {
			System.out.println(f.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		es.shutdown();
	}

}
