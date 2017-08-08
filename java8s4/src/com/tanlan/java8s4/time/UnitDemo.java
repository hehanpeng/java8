package com.tanlan.java8s4.time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class UnitDemo {

	public static void main(String[] args) {
		LocalDate now=LocalDate.now();
		System.out.println(now.plus(4, ChronoUnit.WEEKS));
	}

}
