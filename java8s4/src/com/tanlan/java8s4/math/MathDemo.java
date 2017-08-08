package com.tanlan.java8s4.math;

import java.util.Random;

public class MathDemo {

	public static void main(String[] args) {
		System.out.println(Math.abs(-12.34));
		System.out.println(Math.ceil(1.9));
		System.out.println(Math.floor(-2.1));
		System.out.println(Math.max(12, 11));
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}
		System.out.println("---------------------");
		Random r1 = new Random(10);
		for (int i = 0; i < 10; i++) {
			System.out.println(r1.nextInt(11)+10);
		}
	}
}
