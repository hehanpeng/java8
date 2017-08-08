package com.tanlan.java8s4.string;


public class StringDemo3 {
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		StringBuilder b = builder.append(1).append("abc").append(1.2);
		System.out.println(b);
		System.out.println(b.length() + "," + b.capacity());
		System.out.println(b.insert(2, "xxx"));
		System.out.println(b.delete(1, 3));
		System.out.println(b.deleteCharAt(5));
		//b.setLength(2);
		System.out.println(b);
		System.out.println(b.reverse());
	}

}
