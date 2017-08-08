package com.tanlan.java8s4.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class CountTask extends RecursiveTask<Integer> {
	private static final int RANGE = 50;
	private int start;
	private int end;

	public CountTask(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	protected Integer compute() {
		int result = 0;
		if (end - start <= RANGE) {
			for (int i = start; i <= end; i++) {
				result += i;
			}
		}else{
			int middle=(start+end)/2;
			CountTask leftTask=new CountTask(start, middle);
			CountTask rightTask=new CountTask(middle+1, end);
			leftTask.fork();
			rightTask.fork();
			int leftResult=leftTask.join();
			int rightResult=rightTask.join();
			result=leftResult+rightResult;
		}
		return result;
	}
	
	public static void main(String[] args) {
		ForkJoinPool pool=new ForkJoinPool();
		CountTask task=new CountTask(1, 10000);
		Future<Integer> f=pool.submit(task);
		try {
			System.out.println(f.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
