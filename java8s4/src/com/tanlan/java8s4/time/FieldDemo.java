package com.tanlan.java8s4.time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class FieldDemo {
	public static void main(String[] args) {
		LocalDateTime t=LocalDateTime.now();
		System.out.println(t.get(ChronoField.YEAR));
		System.out.println(t.get(ChronoField.MONTH_OF_YEAR));
	}
}
