package com.tanlan.java8s4.format;

import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		//Locale locale=Locale.getDefault();
		Locale locale=Locale.US;
		System.out.println(locale.getCountry());
		System.out.println(locale.getLanguage());
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
	}

}
