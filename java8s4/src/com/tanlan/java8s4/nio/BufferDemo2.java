package com.tanlan.java8s4.nio;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;

public class BufferDemo2 {

	public static void main(String[] args) {
		ByteBuffer b = ByteBuffer.allocate(10);
		// b=b.asReadOnlyBuffer();
		// b.duplicate()

		for (int i = 1; i <= b.limit(); i++) {
			b.put((byte) i);
		}
		b.position(3);
		System.out.println(b.get(3));
		ByteBuffer b1 = b.slice();
		b.put(5,(byte)100);
		while (b1.hasRemaining()) {
			System.out.println(b1.get());
		}
		System.out.println("------------------------");
		b.position(0);
		System.out.println(b.position());
		b.limit(5);
		for (int i = 0; i < b.limit(); i++) {
			System.out.println(b.get());
			if (i == 2) {
				b.mark();
			}
		}
		System.out.println(b.position());
		b.reset();
		System.out.println(b.position());
		System.out.println(b.limit());
		b.flip();
		System.out.println(b.position());
		System.out.println(b.limit());
		
		DoubleBuffer b3=DoubleBuffer.allocate(10);
	}

}
