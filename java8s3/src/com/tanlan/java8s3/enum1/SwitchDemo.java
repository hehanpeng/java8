package com.tanlan.java8s3.enum1;

public class SwitchDemo {
	public static String getSeason(Season s) {
		switch (s) {
		case SPRING:
			return "spring";
		case SUMMER:
			return "summer";
		case AUTUMN:
			return "sutumn";
		case WINTER:
			return "winter";
		default:
			return "null";
		}
	}

	public static void main(String[] args) {
		// System.out.println(getSeason(Season.SPRING));
		Season spring = Season.WINTER;
		spring.m2();
		System.out.println(spring.getName());

		Season summer = Season.SUMMER;
		System.out.println(spring.equals(Gender.FEMALE));
		
		Season summer1 = Season.SUMMER;
		System.out.println(summer==summer1);
		System.out.println(summer.equals(summer1));
	}
}
