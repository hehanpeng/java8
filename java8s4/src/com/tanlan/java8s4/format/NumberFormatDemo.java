package com.tanlan.java8s4.format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		NumberFormat f1=NumberFormat.getNumberInstance(Locale.FRENCH);
		System.out.println(f1.format(1234567890));
		
		f1=NumberFormat.getCurrencyInstance(Locale.FRENCH);
		System.out.println(f1.format(123456.345));
		
		DecimalFormat f2=new DecimalFormat("#####.#####");
		System.out.println(f2.format(123.4521));
	}

}
