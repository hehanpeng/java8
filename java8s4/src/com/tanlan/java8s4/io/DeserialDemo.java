package com.tanlan.java8s4.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialDemo {

	public static void main(String[] args) throws Exception {
		int[] nums={1,2,3};
		System.out.println(nums);
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
//				"user.ser"));
//		User user = (User) ois.readObject();
//		System.out.println(user.getAge()+","+user.getName());
	}

}
