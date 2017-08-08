package com.tanlan.java8s4.format;

import java.util.Formatter;

public class FormatterDemo {

	public static void main(String[] args) {
		Formatter f1 = new Formatter();
		System.out.println(f1.format("%s,%s", "abc","def"));
	}

}
