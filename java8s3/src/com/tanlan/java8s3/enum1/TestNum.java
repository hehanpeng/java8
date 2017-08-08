package com.tanlan.java8s3.enum1;

public class TestNum {
	public static void main(String[] args) {
		Season e1 = Season.SPRING;

		Season[] s = Season.values();
		for (Season season : s) {
			System.out.println(season.name());
			System.out.println(season.ordinal());
		}

		Season s1 = Season.valueOf("autumn");
		System.out.println(s1.ordinal());
	}
}
