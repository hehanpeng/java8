package com.tanlan.java8s4.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InputStreamDemo {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("f2.txt")) {
			byte byteData;
			while ((byteData=(byte) fis.read()) != -1) {
				System.out.println((char) byteData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
