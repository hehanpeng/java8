package com.tanlan.java8s4.time;

import java.time.Clock;
import java.time.Instant;

public class ClockDemo {

	public static void main(String[] args) {
		Clock c = Clock.systemDefaultZone();
		System.out.println(c.getZone());
		
		Instant i=c.instant();
		Instant i2=Instant.now(c);
	}

}
