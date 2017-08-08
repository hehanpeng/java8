package com.tanlan.java8s4.time;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {
	public static void main(String[] args) {
		Instant i1 = Instant.ofEpochMilli(1000);
		Instant i2 = Instant.now();

		Duration d1 = Duration.ofDays(3);
		Duration d2 = Duration.ofMinutes(30);

		System.out.println(i2);
		System.out.println(d2);

		System.out.println(i1.isAfter(i2));
	}
}
