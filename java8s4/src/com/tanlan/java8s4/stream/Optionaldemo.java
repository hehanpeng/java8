package com.tanlan.java8s4.stream;

import java.util.Optional;

import com.tanlan.java8s4.stream.Person.Gender;

public class Optionaldemo {
	public static void main(String[] args) {
		Person p = new Person(1, "Tom", 4000, null, Gender.MALE);
		// int year=p.getBirthDate().getYear();
		// System.out.println(year);

		Optional<String> o1 = Optional.ofNullable("");
		System.out.println(o1.orElse("default"));
		if (o1.isPresent()) {
			System.out.println(o1.get());
		}
	}
}
