package com.tanlan.java8s4.internation;

import java.util.Locale;
import java.util.ResourceBundle;

public class InternationDemo {

	public static void main(String[] args) {
//		Locale locale=new Locale("en", "US");
//		ResourceBundle rb=ResourceBundle.getBundle("msg",locale);
//		String name=rb.getString("email");
//		System.out.println(name);
		
		Locale locale=new Locale("zh", "CN");
		ResourceBundle rb=ResourceBundle.getBundle("com.tanlan.java8s4.internation.Error",locale);
		String name=rb.getString("name");
		System.out.println(name);
	}

}
