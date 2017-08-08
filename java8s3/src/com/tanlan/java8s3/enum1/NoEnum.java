package com.tanlan.java8s3.enum1;

enum Gender {
	MALE, FEMALE;
}

public class NoEnum {
	public static String getGender(Gender g) {
		return "";
	}

	public static String getGender(char c) {
		if (c == 'f') {
			return "女";
		} else if (c == 'm') {
			return "男";
		} else {
			return "";
		}
	}

	public static void main(String[] args) {
		System.out.println(getGender('m'));
	}

}
