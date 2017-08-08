package com.tanlan.java8s4.time;

import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		Period p1=Period.of(1, 2, 20);
		System.out.println(p1);
		
		System.out.println(p1.minusDays(21));
	}

}
