package com.tanlan.java8s4.concurrent;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class AtomicIntegerDemo {

	public static void main(String[] args) {
		int num = 10;
		// num++;//num=num+1;

		AtomicInteger i1 = new AtomicInteger(num);
		System.out.println(i1.getAndIncrement());// 获取值，然后自增

		System.out.println(i1.getAndAccumulate(3, (x, y) -> x + y));
		System.out.println(i1.get());

		System.out.println(i1.decrementAndGet());
		System.out.println(i1.updateAndGet(x -> x * x));

		int[] nums1 = { 1, 2, 3, 4, 5 };
		AtomicIntegerArray a = new AtomicIntegerArray(nums1);
		System.out.println(a.addAndGet(3, 10));
		System.out.println(a.accumulateAndGet(2, 10, (x, y) -> x * y));

		User user = new User();
		user.setScore(100);
		AtomicIntegerFieldUpdater<User> updater = AtomicIntegerFieldUpdater
				.newUpdater(User.class, "score");
		System.out.println(updater.getAndAdd(user, 200));
		System.out.println(user.getScore());
	}

}
