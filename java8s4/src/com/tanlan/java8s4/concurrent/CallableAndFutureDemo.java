package com.tanlan.java8s4.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableAndFutureDemo {

	public static void main(String[] args) {
		Callable<Integer> c=new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				Thread.sleep(2000);
				return 1;
			}
		};
		
		FutureTask<Integer> task=new FutureTask<Integer>(c);
		try {
			task.run();
			System.out.println(task.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
