package com.tanlan.java8s4.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseDemo {

	public static void main(String[] args) {
		String now = "12/16/2014";
		System.out.println(LocalDate.parse(now,
				DateTimeFormatter.ofPattern("MM/dd/yyyy")));

		System.out.println(LocalDate.from(DateTimeFormatter.ofPattern(
				"MM/dd/yyyy").parse(now)));
		System.out.println(DateTimeFormatter.ofPattern(
				"MM/dd/yyyy").parse(now,LocalDate::from));
	}

}
