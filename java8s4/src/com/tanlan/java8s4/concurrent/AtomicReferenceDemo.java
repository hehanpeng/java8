package com.tanlan.java8s4.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class AtomicReferenceDemo {

	public static void main(String[] args) {
		User user = new User();
		user.setName("老谭");
		user.setScore(100);
		AtomicReference<User> r1 = new AtomicReference<User>();
		r1.set(user);
		r1.getAndUpdate(u -> {
			u.setScore(300);
			return u;
		});
		System.out.println(user.getScore());
		User user2 = new User();
		user2.setName("Tanlan");
		user2.setScore(200);
		r1.accumulateAndGet(user2, (u1, u2) -> {
			u1.setScore(u2.getScore());
			return u1;
		});
		System.out.println(user.getScore());

		AtomicReferenceArray<User> r2 = new AtomicReferenceArray<User>(
				new User[] { user, user2 });
		r2.accumulateAndGet(0, user2, (u1, u2) -> {
			u1.setScore(u2.getScore() * 2);
			return u1;
		});
		System.out.println(user.getScore());

		AtomicReferenceFieldUpdater<User, Group> r3 = AtomicReferenceFieldUpdater
				.newUpdater(User.class, Group.class, "group");
		User user3=new User();
		user3.setName("老谭");
		user3.setScore(100);
		Group group=new Group("一组");
		r3.set(user3, group);
		System.out.println(r3.get(user3).getName());
		r3.getAndUpdate(user3, g->{g.setName("二组");return g;});
		System.out.println(user3.group.getName());
		System.out.println(r3.get(user3).getName());
	}

}
