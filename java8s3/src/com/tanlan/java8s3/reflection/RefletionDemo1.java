package com.tanlan.java8s3.reflection;

class User {
	static {
		System.out.println("User init...");
	}
}

public class RefletionDemo1 {

	static void create1() {
		new User();
	}

	static void create2() {
		Class c = User.class;
	}

	static void create3() {
		try {
			Class c = Class.forName("com.tanlan.java8s3.reflection.User");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	static void create4() {
		try {
			Class c = Class.forName("com.tanlan.java8s3.reflection.User", false,
					RefletionDemo1.class.getClassLoader());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		create4();
		// Class<String> c = String.class;
		//
		// String s = "";
		// Class<?> c1 = s.getClass();
		//
		// try {
		// Class<?> c2 = Class.forName("java.lang.String");
		// } catch (ClassNotFoundException e) {
		// e.printStackTrace();
		// }
		
		System.out.println(int.class==Integer.TYPE);
	}

}
