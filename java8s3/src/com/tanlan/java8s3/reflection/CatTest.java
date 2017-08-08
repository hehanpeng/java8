package com.tanlan.java8s3.reflection;

import java.lang.reflect.Array;

public class CatTest {

	public static void main(String[] args) {
		Class<Cat> c = Cat.class;

		Cat[] cats = (Cat[]) Array.newInstance(Cat.class, 10);
		System.out.println(cats.getClass().isArray());
		System.out.println(cats.getClass().getComponentType().getName());
		System.out.println(cats.length);
		cats[0] = new Cat();

		// Integer[] nums=(Integer[]) Array.newInstance(int.class,5);
		System.out.println(new String[10]);

		int[][] nums2 = (int[][]) Array.newInstance(int.class, 3, 5);

		int[] num3 = (int[]) Array.newInstance(int.class, 5);
		Array.setInt(num3, 0, 10);
		Array.setInt(num3, 1, 20);
		Array.setInt(num3, 2, 30);
		Array.setInt(num3, 3, 40);
		Array.setInt(num3, 4, 50);
		// for (int num : num3) {
		// System.out.println(num);
		// }
		for (int i = 0; i < num3.length; i++) {
			System.out.println(Array.getInt(num3, i));
		}

	}

}
