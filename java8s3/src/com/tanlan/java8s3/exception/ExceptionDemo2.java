package com.tanlan.java8s3.exception;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 0;
		int[] nums = { 1, 2, 3 };

		try {
			System.out.println(num1 / num2);
			System.out.println(nums[3]);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {

		} finally {
			System.out.println("finally");
		}
		System.out.println("Hello");
	}
}
