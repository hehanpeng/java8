package com.tanlan.java8s4.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.SerializablePermission;

public class SerialDemo {

	public static void main(String[] args) throws Exception {
		
		User user = new User();
		user.setAge(23);
		user.setName("Tom");

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"user.ser"));
		oos.writeObject(user);
		oos.close();
	}

}
